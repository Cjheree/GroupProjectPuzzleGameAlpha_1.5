package Main;

import entity.Player;
import objects.SuperObject;
import tile.TileManager;

import java.awt.*;

import javax.swing.*;

public class GamePanel extends JPanel implements Runnable {
    // Screen Settings

    // REORGANISE THIS SHIT ONCE FINAL ** Marked for Deletion **

    final int originalTileSize = 32; // Pixel dimensions of the sprites/graphics used
    final int scale = 4; // Scale of image dilation/enlargement

    public final int tileSize = originalTileSize * scale; // Makes the images larger so user can see them better
    public final int maxScreenCol = 8; // 16 columns of tiles across
    public final int maxScreenRow = 8; // 12 rows of tiles across. Keep a 4:3 aspect ratio

    public final int screenWidth = tileSize * maxScreenCol; // Width of window created
    public final int screenHeight = tileSize * maxScreenRow; // Height of window created

    // World Settings
    public final int maxWorldCol = 19; // Max tiles to draw under variable col
    public final int maxWorldRow = 39; // Max tiles to draw under variable row

    public int FPS = 60; // Frames per second (FPS)
    public CollisionHandler cChecker = new CollisionHandler(this); // Initialises CollisionHandler
    public ObjectHandler objectSetter = new ObjectHandler(this); // Initiates ObjectHandler
    public SuperObject obj[] = new SuperObject[100]; // Creates array to store objects on screen
    TileManager tileM = new TileManager(this); // Initiates Tile Manager in this GamePanel
    KeyHandler keyH = new KeyHandler();
    Thread gameThread; // Opens thread

    public Player player = new Player(this, keyH); // Creates player and allows access to this gp and this keyH

    public GamePanel() {

        // Constructor
        this.setPreferredSize(new Dimension(screenWidth, screenHeight)); // Determines size of window
        this.setBackground(Color.black); // Background Colour
        this.setDoubleBuffered(true); // Optimization of image pre-load state
        this.addKeyListener(keyH); // Initialises Key Handler keyH
        this.setFocusable(true); // Makes GamePanel specifically search for inputs from keyH

    }

    public void setObjects() { // Sets objects params upon initialization of game

        objectSetter.setObject();

    }

    public void startGamaThread() { // Starts game thread

        gameThread = new Thread(this); // Passes current class to the constructor (thread)
        gameThread.start(); // Initiates thread

    }

    /*
    ** Marked For Deletion **
    public void startGameThread() { // Starts the game thread

        gameThread = new Thread(this); // Declaration of thread
        gameThread.start(); // Initializes thread using start method

    }
    */

    // Unimplemented Methods
    @Override
    public void run() {

        double drawInterval = 1000000000/FPS; // Nanoseconds are measured in billions. Draws a frame every 1/60 seconds
        double nextDrawTime = System.nanoTime() + drawInterval; // Sets the time the thread must wait for

        while (gameThread != null) {

            update(); // Updates game data

            repaint(); // Repaints graphics based on update() data



            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime/1000000; // Converts to milliseconds

                if(remainingTime < 0) {
                    remainingTime = 0; // Resets remaining time if sleep is not necessary
                }

                Thread.sleep((long) remainingTime); // Pauses game loop until sleep time has passed

                nextDrawTime += drawInterval; // Sets new draw time

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void update() { // Updates object data (graphics characteristics and location)

        player.update(); //  Specifically updates player variables

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g); // Pulls from JPanel Class

        Graphics2D g2 = (Graphics2D)g; // Converts Graphics(g) to Graphics2D graph. Allows usage of Graphics2D(g2) Class

        // Tile must come first since they are behind everything
        tileM.draw(g2); // Draws tiles

        for (SuperObject superObject : obj) {
            if (superObject != null) {
                superObject.draw(g2, this); // Passes current Graphics Panel and retrieves draw from SuperObjects() Class
            }
        }

        player.draw(g2); // Draws the player

        g2.dispose(); // Dumps previously cached graphics. Graphic is changed any ways so no need for storage

    }
}
