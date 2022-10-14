package edu.miu.elibrary.dataaccess.iml;

import edu.miu.elibrary.business.Address;
import edu.miu.elibrary.dataaccess.DbConnection;
import edu.miu.elibrary.dataaccess.AddressRepository;

import java.sql.*;

public class AddressRepositoryImpl implements AddressRepository {
    private final Connection conn;

    public AddressRepositoryImpl() {
        this.conn = DbConnection.getConnection();
    }

    @Override
    public Address add(Address address) {
        try {
            String query = "INSERT INTO tb_address (street, city, state, zip) VALUES (?,?,?,?)";

            PreparedStatement preparedStatement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
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
