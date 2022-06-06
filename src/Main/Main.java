package Main;

import javax.swing.*;

public class Main {

    public static boolean titleState;
    private static String ver = "Alpha 2.0";

    public static void main(String[] args) {

            // Opening arguments to create the visual elements of the game
            JFrame window = new JFrame();
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Makes the close button work
            window.setResizable(false); // Disables resizing of the window
            window.setTitle("Spooky Puzzle Game (" + ver + ")");

            GamePanel gamePanel = new GamePanel();
            window.add(gamePanel); // Calls initializer

            window.pack(); // Resolves preferred size error

            window.setLocationRelativeTo(null); // Ensures window is created in centre

            window.setVisible(true); // Displays game window

            gamePanel.setObjects(); // Sets objects
            gamePanel.startGamaThread(); // Starts the Game
        }
    }
