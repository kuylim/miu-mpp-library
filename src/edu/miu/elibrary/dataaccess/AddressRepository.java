package edu.miu.elibrary.dataaccess;

import com.mysql.cj.jdbc.CallableStatement;
import edu.miu.elibrary.business.Address;

import java.sql.*;

public class AddressRepository {
    private final Connection conn;
    private PreparedStatement preparedStatement;
    public AddressRepository() {
        this.conn = DbConnection.getConnection();
    }

    public Address add(Address address) throws SQLException {
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

            PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, address.getStreet());
            ps.setString(2, address.getCity());
            ps.setString(3, address.getState());
            ps.setString(4, address.getZip());
            ps.executeUpdate();

            ResultSet re = ps.getGeneratedKeys();
            if(re.next()){
                address.setId((long)re.getInt(1));
            }
        }
        catch (SQLException s){
            throw s;
        }

        return address;

    }


}
