/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.gjt.mm.mysql.Driver;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author fabio
 */

public class DbConnection {
    private final String conURL = "jdbc:mysql://localhost:3306/dbpizzerias"; 
    private final String conDriver = "org.gjt.mm.mysql.Driver";    
    private final String conUser = "fabio";    
    private final String conPassword = "mysql2021"; 
    private static Connection Con;
    
    public DbConnection() {
        
        try {
            Con = DriverManager.getConnection(conURL, conUser,conPassword);
             //JOptionPane.showMessageDialog(null, "Conectado com Sucesso", "Conectado", 1);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Conectar com o Banco", "Error", 0);
        }
        
    }
    
    public static Connection getConnection() {
        if(Con == null) {
            new DbConnection();
        }
        return Con;
    }
    
    public static void CloseDbConnection() {
        try {
            if(!Con.isClosed()) {
                Con.close();
            }            
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String arg[]) {
        DbConnection.getConnection();        
    }
}