package edu.miu.elibrary.dataaccess;

import edu.miu.elibrary.auth.Auth;
import edu.miu.elibrary.auth.User;
import edu.miu.elibrary.business.Address;
import edu.miu.elibrary.business.LibraryMember;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberDataAccessFacade extends DataAccessFacade implements MemberDataAccess{
    @Override
    public Address saveAddress(Address address) {
        try {
            String query = "INSERT INTO tb_address (street, city, state, zip) VALUES (?,?,?,?)";
            preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, address.getStreet());
            preparedStatement.setString(2, address.getCity());
            preparedStatement.setString(3, address.getState());
            preparedStatement.setString(4, address.getZip());
            preparedStatement.executeUpdate();

            ResultSet re = preparedStatement.getGeneratedKeys();
            if (re.next()) {
                address.setId(re.getInt(1));
            }
            return address;
        } catch (SQLException s) {
            s.printStackTrace();
        }
        return null;
    }

    @Override
    public LibraryMember saveLibraryMember(LibraryMember member) {
        try {
            String query = "INSERT INTO tb_library_member (firstname, lastname, phonenumber, address_id) VALUES(?,?,?,?)";
            preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, member.getFirstName());
            preparedStatement.setString(2, member.getLastName());
            preparedStatement.setString(3, member.getPhoneNumber());
            preparedStatement.setInt(4, member.getAddressId());
            preparedStatement.executeUpdate();

            ResultSet re = preparedStatement.getGeneratedKeys();
            if (re.next()) {
                int i = re.getInt(1);
                member.setMemberId(i);
            }
            return member;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
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

}
