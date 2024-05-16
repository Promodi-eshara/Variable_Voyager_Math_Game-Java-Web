/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import engine.Game;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class handles the database connection for adding scores.
 *
 * JavaPoint, (n.d.) PreparedStatement interface. Available at:
 * https://www.javatpoint.com/PreparedStatement-interface * [Accessed: 03
 * November 2023].
 *
 * @author Promodi
 *
 */
public class AddScore {

    /**
     * Adds Player score to the database.
     *
     * @param email of the player.
     * @param score of the player.
     */
    public void addScore(String email, int score) {

        try {
            PreparedStatement insertScore = DBConnection.getDBConnection().prepareStatement("insert into gamescore(Email,Score)values(?,?)");
            insertScore.setString(1, email);
            insertScore.setInt(2, score);
            insertScore.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
