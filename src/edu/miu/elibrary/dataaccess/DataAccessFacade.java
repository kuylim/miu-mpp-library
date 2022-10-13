package edu.miu.elibrary.dataaccess;

import edu.miu.elibrary.auth.Auth;
import edu.miu.elibrary.auth.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

}
