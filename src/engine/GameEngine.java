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
public class GameEngine {

    private static GameEngine instance = null;

    /**
     * Constructing a singleton to make sure only one instance is created.
     *
     * @return
     */
    public GameEngine getInstance() {
        if (instance != null) {
            instance = new GameEngine();
        }
        return instance;
    }

    String thePlayer = null;

    public GameEngine() {

    }

    /**
     * Each player has their own game engine.
     *
     * @param player
     */
    public GameEngine(String player) {
        thePlayer = player;
    }

    int counter = 0;
    int score = 0;
    GameServer theGames = new GameServer();
    Game current = null;

    /**
     * Retrieves a game. This basic version only has two games that alternate.
     *
     * @return
     */
    public BufferedImage nextgamescreen() {
        current = theGames.getRandomGame();
        return current.getImage();
    }

    /**
     * Checks if the parameter i is a solution to the game URL. If so, score is
     * increased by one.
     *
     * @param game
     * @param i
     * @return
     */
    public boolean checkSolution(int i) {
        if (i == current.getSolution()) {
            score += 5;
            return true;
        } else {
            return false;
        }
    }

    public int checkSolutionReturn() {
        return current.getSolution();
    }

    /**
     * Retrieves the score.
     *
     * @param player
     * @return
     */
    public int getScore() {
        return score;
    }

    public void reductScore() {
        score -= 5;
    }

}
