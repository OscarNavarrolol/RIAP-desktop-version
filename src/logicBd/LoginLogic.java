/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicBd;

import entities.UserData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class LoginLogic {

    public LoginResult verifyCredentials(String userText, String passWordText) {
        ArrayList<UserData> credentials = getCredentials();

        for (UserData userProfile : credentials) {
            if (userProfile.getDocument().equals(userText) && userProfile.getPassword().equals(passWordText) && userProfile.getRole().equals("admin")) {
                return new LoginResult(true, userProfile.getId()); // Devuelve el resultado de la verificación junto con el ID del usuario
            }
        }

        return new LoginResult(false, -1l);
    }

    private ArrayList<UserData> getCredentials() {
        ArrayList<UserData> listUsers = new ArrayList<>();

        try (Connection connection = ConnectionDB.getConnectionBD(); PreparedStatement query = connection.prepareStatement("SELECT id_user, document_number, password_user, role_user FROM user_data"); ResultSet result = query.executeQuery()) {

            while (result.next()) {
                UserData objUsers = new UserData();
                objUsers.setId(result.getLong("id_user"));
                objUsers.setDocument(result.getString("document_number"));
                objUsers.setPassword(result.getString("password_user"));
                objUsers.setRole(result.getString("role_user"));
                listUsers.add(objUsers);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginLogic.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listUsers;
    }
}
