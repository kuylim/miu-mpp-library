package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.LibraryMember;
import edu.miu.elibrary.dataaccess.MemberRepository;

import java.sql.SQLException;

public class MemberController {

    MemberRepository member;
    public MemberController(){
        member = new MemberRepository();
    }

    public LibraryMember add(LibraryMember mem) throws SQLException {
        return member.add(mem);
    }

}
