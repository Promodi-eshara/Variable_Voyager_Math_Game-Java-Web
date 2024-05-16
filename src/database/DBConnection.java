/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * This class file establishes the connection between the application and MySQL database.
 * 
 * JavaPoint, (n.d.) Java database connectivity with mysql.
 * Available at: https://www.javatpoint.com/example-to-connect-to-the-mysql-database
 * [Accessed: 03 November 2023].
 *
 * @author Promodi
 */
public class DBConnection {

    /**
     * Creates a connection to the MySQL database.
     *
     * @return the connection to the database.
     */
    private static Connection DBConnection() {
        Connection connect = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/variablevoyager", "root", "");
            System.out.println("Connection Done");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Error: " + e);
        }
        return connect;
    }

    /**
     * Gets the database connection
     *
     * @return the database connection.
     */
    public static Connection getDBConnection() {
        return DBConnection();
    }

    /**
     * Creates a statement.
     *
     * @return an exception error.
     */
    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
