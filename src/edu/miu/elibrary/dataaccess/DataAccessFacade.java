package edu.miu.elibrary.dataaccess;

import edu.miu.elibrary.auth.Auth;
import edu.miu.elibrary.auth.User;
import edu.miu.elibrary.business.Address;
import edu.miu.elibrary.business.Author;
import edu.miu.elibrary.business.Book;
import edu.miu.elibrary.business.BookCopy;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 10/13/2022
 */
public class DataAccessFacade implements DataAccess {


    private final Connection connection;
    private PreparedStatement preparedStatement;

    public DataAccessFacade() {
        this.connection = DbConnection.getConnection();
    }

    @Override
    public User findUserByUsername(String username) {
        String sqlCommand = "SELECT u.username, u.auth, u.password FROM tb_user u WHERE u.username = ?";
        try {
            preparedStatement = connection.prepareStatement(sqlCommand);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                User user = new User();
                user.setAuth(Auth.valueOf(resultSet.getString("auth")));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }


    @Override
    public Book saveNewBook(Book book) throws SQLException {
            String insert_book_statement = "INSERT INTO tb_book " + "(isbn, title, number_of_copy, max_checkout_length) "
                    + "VALUES(?, ?, ?, ?)";

            String insert_author_book = "INSERT INTO tb_author_book " + "(author_id, book_id) "
                    + "VALUES(?, ?)";

        String insert_book_copy = "INSERT INTO tb_book_copy " + "(book_id, copy_number,status) "
                + "VALUES(?, ?, ?)";

            preparedStatement = connection.prepareStatement(insert_book_statement, java.sql.Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, book.getIsbn());
            preparedStatement.setString(2, book.getTitle());
            preparedStatement.setInt(3, book.getNumberOfCopy());
            preparedStatement.setInt(4, book.getMaxCheckoutLength());

            int row = preparedStatement.executeUpdate();

            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    for (Author author: book.getAuthors()) {
                        preparedStatement = connection.prepareStatement(insert_author_book);
                        preparedStatement.setInt(1, author.getId());
                        preparedStatement.setInt(2, generatedKeys.getInt(1));
                        preparedStatement.executeUpdate();
                    }

                    for (BookCopy bookCopy: book.getBookCopies()) {
                        preparedStatement = connection.prepareStatement(insert_book_copy);
                        preparedStatement.setInt(1, generatedKeys.getInt(1));
                        preparedStatement.setString(2, bookCopy.getCopyNumber());
                        preparedStatement.setString(3, bookCopy.getStatus());
                        preparedStatement.executeUpdate();
                    }
                }
                else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }

            return book;
    }

    @Override
    public List<Author> getAuthors() {
        String sql = "SELECT * FROM tb_author";
        String sql_address = "SELECT * FROM tb_address where id = ?";

        List<Author> authors = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                String phoneNumber = resultSet.getString(4);
                int addressId = resultSet.getInt(5);
                preparedStatement = connection.prepareStatement(sql_address);
                preparedStatement.setInt(1, addressId);
                ResultSet addressResultSet = preparedStatement.executeQuery();

                while(addressResultSet.next()) {
                    String street = addressResultSet.getString(2);
                    String city = addressResultSet.getString(3);
                    String state = addressResultSet.getString(4);
                    String zip = addressResultSet.getString(5);
                    Address address = new Address(street, city, state, zip);
                    System.out.println(address);

                    Author author = new Author(firstName, lastName, phoneNumber,address);
                    author.setId(id);
                    authors.add(author);
                }

            }
            return authors;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean addBookCopy(Book book, List<BookCopy> newBookCopies) throws SQLException {

        String update_book = "UPDATE tb_book SET number_of_copy = ? WHERE id = ?";

        String insert_book_copy = "INSERT INTO tb_book_copy " + "(book_id, copy_number,status) "
                + "VALUES(?, ?, ?)";

        preparedStatement = connection.prepareStatement(update_book);
        preparedStatement.setInt(1, book.getNumberOfCopy() + newBookCopies.size());
        preparedStatement.setInt(2, book.getId());
        preparedStatement.executeUpdate();

        for (BookCopy bookCopy: newBookCopies) {
            preparedStatement = connection.prepareStatement(insert_book_copy);
            preparedStatement.setInt(1, book.getId());
            preparedStatement.setString(2, bookCopy.getCopyNumber());
            preparedStatement.setString(3, bookCopy.getStatus());
            preparedStatement.executeUpdate();
        }
        return true;
    }

    @Override
    public Book searchBookBy(String isbn) throws SQLException {
        String search_sql = "SELECT * FROM tb_book WHERE isbn = ?";
        preparedStatement = connection.prepareStatement(search_sql);
        preparedStatement.setString(1, isbn);

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println();
            int id = resultSet.getInt(1);
            String isbnString = resultSet.getString(2);
            String title = resultSet.getString(3);
            int number_of_copy = resultSet.getInt(4);
            int max_checkout_length = resultSet.getInt(5);
            Book book = new Book(isbnString, title, number_of_copy, null);
            book.setId(id);
            return book;
        }
        return null;
    }
}
