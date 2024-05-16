/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import gui.RegisterGUI;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class handles the database connection for adding user.
 *
 * JavaPoint, (n.d.) PreparedStatement interface. Available at:
 * https://www.javatpoint.com/PreparedStatement-interface * [Accessed: 03
 * November 2023].
 *
 * @author Promodi
 */
public class AddUser {

    /**
     * Adds a new player to the database.
     *
     * @param name of the player.
     * @param email of the player.
     * @param password of the player.
     * @param confirmPassword of the player.
     * @return
     */
    public boolean newUserAdd(String name, String email, String password, String confirmPassword) {

        try {
            PreparedStatement insertData = DBConnection.getDBConnection().prepareStatement("insert into user(Name,Email,Password)values(?,?,?)");
            insertData.setString(1, name);
            insertData.setString(2, email);
            insertData.setString(3, password);
            if (password.equals(confirmPassword)) {
                insertData.executeUpdate();
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegisterGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
