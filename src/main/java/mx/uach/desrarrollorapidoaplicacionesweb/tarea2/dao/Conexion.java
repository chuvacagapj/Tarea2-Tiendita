/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.desrarrollorapidoaplicacionesweb.tarea2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User1
 */
public class Conexion {
    
    private static  Conexion conexion;
    
    private Connection connection;
    
    private Conexion(){
    }
    
    public static  Conexion getInstance(){
        if (conexion == null) {
            conexion = new Conexion();
        }
        return conexion;
    }
    
    public Connection getConexion(){
        if (connection == null) {
            String driver = "org.sqlite.JDBC";
            String cadenaConexion = "jdbc:sqlite:test.db";
            try {
                Class.forName(driver);
                Connection con = DriverManager.getConnection(cadenaConexion);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Conexion.class.getName())
                        .log(Level.SEVERE, null, ex);
                //TODO atender recuperacion a fallos
            }
        }
        return this.connection;
    }
}
