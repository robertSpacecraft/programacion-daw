/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Robert
 */
public class Mejoras {

    public interface ThrowingConsumer<T, E extends Exception> {

        void accept(T t) throws E;

    }
    //Sugerencia de José Ramón para poder meterlo todo en el try-with-resources

    public static PreparedStatement configure(PreparedStatement ps,
            ThrowingConsumer<PreparedStatement, SQLException> config)
            throws SQLException {
        config.accept(ps);
        return ps;
    }
}
