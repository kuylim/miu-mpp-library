package edu.miu.elibrary.dataaccess;

import edu.miu.elibrary.auth.Auth;
import edu.miu.elibrary.auth.User;
import edu.miu.elibrary.business.*;
import edu.miu.elibrary.business.Address;
import edu.miu.elibrary.business.Author;
import edu.miu.elibrary.business.Book;
import edu.miu.elibrary.business.BookCopy;
import edu.miu.elibrary.business.dto.BookOverdue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Objects;

/**
 * Author: Kuylim TITH
 * Date: 10/13/2022
 */
public abstract class DataAccessFacade {
    final Connection connection;
    PreparedStatement preparedStatement;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public DataAccessFacade() {
        this.connection = DbConnection.getConnection();
    }
}
