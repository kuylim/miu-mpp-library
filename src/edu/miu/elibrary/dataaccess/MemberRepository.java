package edu.miu.elibrary.dataaccess;

import edu.miu.elibrary.business.LibraryMember;

import java.lang.reflect.Member;
import java.sql.*;


public class MemberRepository {
    private final Connection conn;
    private PreparedStatement preparedStatement;
    public MemberRepository() {
        this.conn = DbConnection.getConnection();
    }

    public LibraryMember add(LibraryMember member) throws SQLException {
        try{
            String query = "INSERT INTO `tb_library_member`\n" +
                    "(`firstname`,\n" +
                    "`lastname`,\n" +
                    "`phonenumber`,\n" +
                    "`address_id`" +
                    ")\n" +
                    "VALUES\n" +
                    "(?,\n" +
                    "?,\n" +
                    "?,\n" +
                    "?); ";

            PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, member.getFirstName());
            ps.setString(2, member.getLastName());
            ps.setString(3, member.getPhoneNumber());
            ps.setInt(4, (int)member.getAddressId());
            ps.executeUpdate();

            ResultSet re = ps.getGeneratedKeys();
            if(re.next()){
                int i = re.getInt(1);
                member.setMemberId(String.valueOf(i));
            }
            conn.close();
        }
        catch (SQLException ex){
            throw ex;
        }
        return member;
    }


}
