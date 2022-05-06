/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pcs_grupo_jaj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Alfonso
 */
public class DBConexion {
    static String DRIVER = "com.mysql.cj.jdbc.Driver";
    static String USUARIO = "root";
    static String PASSWORD = "root";
    static String URL = "jdbc:mysql://localhost:3306/centrosdb?serverTimezone=UTC";
    
    static {
        try{
            Class.forName(DRIVER);
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "ERROR EN EL DRIVER: " +e);
        }
    }
    public Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conectado con éxito ");
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al conectar "+e);         
        }
        return con;
    }
}
