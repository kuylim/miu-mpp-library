package edu.miu.elibrary.auth;

import edu.miu.elibrary.auth.Auth;

/**
 * Author: Kuylim TITH
 * Date: 10/12/2022
 */
public class Principal {
    private final Auth auth;
    private final String username;

    public Principal(Auth auth, String username) {
        this.auth = auth;
        this.username = username;
    }

    public Auth getAuth() {
        return auth;
    }

    public String getUsername() {
        return username;
    }
}
