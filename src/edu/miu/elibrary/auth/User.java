package edu.miu.elibrary.auth;

import java.io.Serial;
import java.io.Serializable;

/**
 * Author: Kuylim TITH
 * Date: 10/13/2022
 */
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 4346079408706205921L;

    private String username;
    private String password;
    private Auth auth;

    public User() {}

    public User(String username, String password, Auth auth) {
        this.username = username;
        this.password = password;
        this.auth = auth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }
}
