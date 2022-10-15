package edu.miu.elibrary.dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.format.DateTimeFormatter;

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
