package edu.miu.elibrary.dataaccess;

import edu.miu.elibrary.auth.User;

public interface DataAccess {

    User findUserByUsername(String username);
}
