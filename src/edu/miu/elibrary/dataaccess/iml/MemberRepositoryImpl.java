package edu.miu.elibrary.dataaccess.iml;

import edu.miu.elibrary.business.LibraryMember;
import edu.miu.elibrary.dataaccess.DbConnection;
import edu.miu.elibrary.dataaccess.MemberRepository;

import java.sql.*;

public class MemberRepositoryImpl implements MemberRepository {
    private final Connection conn;

    public MemberRepositoryImpl() {
        this.conn = DbConnection.getConnection();
    }

    @Override
    public LibraryMember add(LibraryMember member) {
        try {
            String query = "INSERT INTO tb_library_member (firstname, lastname, phonenumber, address_id) VALUES(?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, member.getFirstName());
            ps.setString(2, member.getLastName());
            ps.setString(3, member.getPhoneNumber());
            ps.setInt(4, member.getAddressId());
            ps.executeUpdate();

            ResultSet re = ps.getGeneratedKeys();
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
}
