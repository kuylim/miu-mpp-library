package edu.miu.elibrary.controller;

import edu.miu.elibrary.business.LibraryMember;
import edu.miu.elibrary.dataaccess.MemberRepository;

import java.sql.SQLException;

public class MemberController {

    MemberRepository memberRepository;

    public MemberController() {
        memberRepository = new MemberRepository();
    }

    public LibraryMember add(LibraryMember mem) throws SQLException {
        return memberRepository.add(mem);
    }

    public LibraryMember add(String firstname, String lastname, String phoneNumber, int addressId) {
        LibraryMember libraryMember = new LibraryMember(firstname, lastname, phoneNumber);
        libraryMember.setAddressId(addressId);
        return memberRepository.add(libraryMember);
    }
}
