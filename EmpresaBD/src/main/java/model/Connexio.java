/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;

/**
 *
 * @author jrmd
 */
public class Connexio {
    private static Connexio instancia = null;
    private static final String URL = "jdbc:oracle:thin:@192.168.100.203:1521:ORCLCDB";
    private final DataSource datasource;
    private final PoolProperties pool;
    
    public static Connexio getConnexio(){
        if(instancia == null) instancia = new Connexio();
        return instancia;
    }

    private Connexio() {
        pool = new PoolProperties();
        pool.setUrl(URL);
        pool.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        pool.setUsername("javauser");
        pool.setPassword("javauser");
        pool.setMaxActive(15);
        pool.setMaxIdle(10);
        pool.setMaxWait(5000);
        datasource = new DataSource();
        datasource.setPoolProperties(pool);
    }

    public DataSource getDatasource() {
        return datasource;
    }
    
    public PreparedStatement getPrepared(String sql) throws SQLException {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            try (Connection conn = datasource.getConnection()) {
                return conn.prepareStatement(sql);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("DRIVER NO TROBAT");
        }
        return null;
    }
    
    
    
}