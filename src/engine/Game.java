/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package engine;

import java.awt.image.BufferedImage;

/**
 *
 * @author Promodi
 */
public class Game {

    BufferedImage image = null;
    int solution = -1;

    /**
     * Image of the game and what is the solution to the game.
     *
     * @param image
     * @param solution
     */
    public Game(BufferedImage image, int solution) {
        super();
        this.image = image;
        this.solution = solution;
    }

    /**
     * The image of the game.
     *
     * @return the location of the game.
     */
    public BufferedImage getImage() {
        return image;
    }

    /**
     * Gets the solution to the game.
     *
     * @return The solution of the game.
     */
    public int getSolution() {
        return solution;
    }

}
