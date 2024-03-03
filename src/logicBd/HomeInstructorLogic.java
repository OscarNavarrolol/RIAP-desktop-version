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
 * @author Oscar
 */
public class HomeInstructorLogic {
    
    
    public ArrayList<UserData> getUserData(Long userId) {
        ArrayList<UserData> listUsers = new ArrayList<>();

        try (Connection connection = ConnectionDB.getConnectionBD();
             PreparedStatement query = connection.prepareStatement("SELECT full_name, profile_picture FROM user_data WHERE id_user = ?");
        ) {
            query.setLong(1, userId); 
            try (ResultSet result = query.executeQuery()) {
                while (result.next()) {
                    UserData objUsers = new UserData();
                    objUsers.setNameUser(result.getString("full_name"));
                    objUsers.setProfilePicture(result.getString("profile_picture"));
                    listUsers.add(objUsers);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomeInstructorLogic.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listUsers;
    }
    
    
    
}
