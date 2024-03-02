/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ConnectionDB {
     public ConnectionDB() {
    }

    public static Connection getConnectionBD() {
        Connection connection = null;
        String db = "general_contacts";
        String url = "jdbc:mysql://localhost:3306/" + db;
        String user = "root";
        String password = "1234"; // password of workbecnh

        try {
            // Charge sql driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connecetion to BD
            connection = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e, "Error en la conexión a la base de datos: " + e.getMessage(), JOptionPane.ERROR_MESSAGE);
            connection = null;
        }

        return connection;
    }
    
}
