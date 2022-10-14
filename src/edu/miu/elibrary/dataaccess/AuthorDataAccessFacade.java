package edu.miu.elibrary.dataaccess;

import edu.miu.elibrary.business.Author;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorDataAccessFacade extends  DataAccessFacade implements AuthorDataAccess{
    @Override
    public boolean addAuthor(Author author) throws SQLException {
        String add_address_sql = "INSERT INTO tb_address (street, city, state, zip) VALUES (?, ?, ?, ?)";
        String add_author_sql = "INSERT INTO tb_author (firstname, lastname, phonenumber, address_id) VALUES(?, ?, ?, ?)";

        preparedStatement = connection.prepareStatement(add_address_sql, java.sql.Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, author.getAddress().getStreet());
        preparedStatement.setString(2, author.getAddress().getCity());
        preparedStatement.setString(3, author.getAddress().getState());
        preparedStatement.setString(4, author.getAddress().getZip());
        preparedStatement.executeUpdate();
        try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                preparedStatement = connection.prepareStatement(add_author_sql);
                preparedStatement.setString(1, author.getFirstName());
                preparedStatement.setString(2, author.getLastName());
                preparedStatement.setString(3, author.getPhoneNumber());
                preparedStatement.setInt(4, generatedKeys.getInt(1));
                preparedStatement.executeUpdate();
                return true;
            } else {
                throw new SQLException("Creating address failed, no ID obtained.");
            }
        }
    }
}
