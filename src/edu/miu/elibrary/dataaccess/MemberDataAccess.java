package edu.miu.elibrary.dataaccess;

import edu.miu.elibrary.auth.User;
import edu.miu.elibrary.business.Address;
import edu.miu.elibrary.business.LibraryMember;

public interface MemberDataAccess {
    Address saveAddress(Address address);

    LibraryMember saveLibraryMember(LibraryMember member);

    User findUserByUsername(String username);
}
