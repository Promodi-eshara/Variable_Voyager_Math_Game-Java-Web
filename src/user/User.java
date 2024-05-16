/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 * User class handles all the information related to the play.
 *
 * @author Pramodi
 */
public class User {

    private String Name;
    private String Email;
    private String Password;

    /**
     * Constructor for user name, email and password.
     *
     * @param Name of the player.
     * @param Email of the player.
     * @param Password of the player.
     */
    public User(String Name, String Email, String Password) {
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
    }

    /**
     * Gets the name of the player.
     *
     * @return the name of the player.
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the name of the player.
     *
     * @param UserName of the player.
     */
    public void setName(String UserName) {
        this.Name = UserName;
    }

    /**
     * Gets the email of the player.
     *
     * @return the email of the player.
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Sets the email of the player.
     *
     * @param UserEmail of the player.
     */
    public void setEmail(String UserEmail) {
        this.Email = UserEmail;
    }

    /**
     * Gets the password of the player.
     *
     * @return the password of the player.
     */
    public String getPassword() {
        return Password;
    }

    /**
     * Sets the password of the player.
     *
     * @param UserPassword of the player.
     */
    public void setPassword(String UserPassword) {
        this.Password = UserPassword;
    }

}
