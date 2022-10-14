package edu.miu.elibrary.dataaccess;

import edu.miu.elibrary.business.Address;

import java.sql.*;

public class AddressRepository {
    private final Connection conn;
    private PreparedStatement preparedStatement;

    public AddressRepository() {
        this.conn = DbConnection.getConnection();
    }

    public Address add(Address address) {
        try {
            String query = "INSERT INTO  `tb_address`\n" +
                    "(\n" +
                    "`street`,\n" +
                    "`city`,\n" +
                    "`state`,\n" +
                    "`zip`)\n" +
                    "VALUES\n" +
                    "(\n" +
                    "?,\n" +
                    "?,\n" +
                    "?,\n" +
                    "?);\n";

            preparedStatement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
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
}
