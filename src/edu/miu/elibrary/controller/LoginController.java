package edu.miu.elibrary.controller;

import edu.miu.elibrary.auth.User;
import edu.miu.elibrary.business.LibraryMember;
import edu.miu.elibrary.dataaccess.DataAccessFacade;
import edu.miu.elibrary.auth.Principal;
import edu.miu.elibrary.auth.SecurityContext;
import edu.miu.elibrary.dataaccess.MemberDataAccess;
import edu.miu.elibrary.dataaccess.MemberDataAccessFacade;

import java.util.Objects;

/**
 * Author: Kuylim TITH
 * Date: 10/12/2022
 */
public class LoginController {

    private final MemberDataAccess dataAccess;

    public LoginController() {
        dataAccess = new MemberDataAccessFacade();
    }

    public LibraryMember addMember(LibraryMember member) {
        return null;
    }

    public boolean login(String username, String password) {
        User user = dataAccess.findUserByUsername(username);
        return verifyPassword(password, user);
    }

    public boolean verifyPassword(String password, User user) {
        if (Objects.isNull(user)) {
            throw new RuntimeException("Invalid user account");
        }
        if (password.equals(user.getPassword())) {
            SecurityContext.principal = new Principal(user.getAuth(), user.getUsername());
            return true;
        }
        return false;
    }
}
