package edu.miu.elibrary.controller;

import edu.miu.elibrary.dataaccess.DataAccessFacade;

public class AuthorController {
    private DataAccessFacade dataAccessFacade;

    public AuthorController(DataAccessFacade dataAccessFacade) {
        this.dataAccessFacade = dataAccessFacade;
    }
}
