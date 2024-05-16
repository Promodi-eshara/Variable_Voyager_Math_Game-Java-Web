/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class file handles the user input validatison.
 *
 * JavaPoint, (n.d.) Statement interface. Available at:
 * https://www.javatpoint.com/Statement-interface 
 * [Accessed: 03 November 2023].
 *
 * @author Pramodi
 */
public class ValidateUser {

    /**
     * Validates player email and password.
     *
     * @param email input of the player
     * @param password input of the player.
     * @return
     */
    public boolean userValidate(String email, String password) {

        try {
            Statement insertData = DBConnection.getDBConnection().createStatement();
            ResultSet getData = insertData.executeQuery("select * from user where Email = '" + email + "' and Password = '" + password + "'");

            //<user.user>
            if (getData.next()) {

                return true;
            } else {

                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(loginscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private static class loginscreen {

        public loginscreen() {
        }
    }
}
