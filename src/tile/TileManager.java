package tile;

import Main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TileManager {
    // ** Come back and find the best implementation of storage method **
    // Set would probably work better
    GamePanel gp;
    public Tile[] mapTile; // Array storing mapTile images
    public Tile[] objectTile; // Array storing objectTile images
    public int mapTileNum [][]; // Array storing tile values to map from txt file

    public TileManager(GamePanel gp) { // Stores each type of tile and associated images

        this.gp = gp;

        mapTile = new Tile[10]; // Set size of mapTile storage array
        objectTile = new Tile[10]; // Set size of object storage array
        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];

        getTileImage(); // Sets tile images according to specific data structure and tile type
        loadMap("maps/MapV2.txt"); // Loads map from specified txt file

    }

    public void getTileImage() { // Retrieves Tile images and assigns to corresponding Tile

        try { // Assigns image to each index specified

            // Map Tile Assignments
            mapTile[0] = new Tile();
            mapTile[0].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Stone_1.png"));
            mapTile[0].collision = true;
            mapTile[1] = new Tile();
            mapTile[1].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Dirt_1.png"));


            mapTile[2] = new Tile();
            mapTile[2].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Dirt_2.png"));

            mapTile[3] = new Tile();
            mapTile[3].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("Door_Closed_In.png"));

            mapTile[4] = new Tile();
            mapTile[4].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Door_Closed_Out_Right_16W.png"));

            // Testing Methods ** Marked for Deletion **
            // System.out.println(getClass());
            // System.out.println(getClass().getClassLoader());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadMap(String filePath) {

        try {
            InputStream is = getClass().getClassLoader().getResourceAsStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is)); // Reads txt file

            int col = 0;
            int row = 0;

            while(col < gp.maxWorldCol && row < gp.maxWorldRow) {

                String line = br.readLine(); // converts each read line to String

                while (col < gp.maxWorldCol) {

                    String numbers[] = line.split(" "); // Stores each "index" individually into a string array
                                                            // from txt file Spaces in the text file denote next tile

                    int num = Integer.parseInt(numbers[col]); // Converts string to int

                    mapTileNum[col][row] = num; // Stores num to assigned position
                    col++; // Iterates column to traverse the txt file

                }
                if (col == gp.maxWorldCol) { // Once all columns are stored, move over row
                    col = 0; // Back to top of txt file
                    row++; // Over one row

                }
            }
            br.close();

        } catch (Exception e) {

        }
    }

    public void draw(Graphics2D g2) { // Draws specified tiles at specified locations

        int worldCol = 0;
        int worldRow = 0;

        while(worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) { // Draws the background from top left down

            int tileNum = mapTileNum[worldCol][worldRow]; // Stores numeric value of tile at specified col/row on world map

            int worldX = worldCol * gp.tileSize; // Returns X position of the tile on the world map
            int worldY = worldRow * gp.tileSize; // Returns Y position of the tile on the world map
            int screenX = worldX - gp.player.worldX + gp.player.screenX; // Returns the X coordinate of the tile
            // in relation to the player's X coordinate
            int screenY = worldY - gp.player.worldY + gp.player.screenY; // Returns the Y coordinate of the tile
            // in relation to the player's Y coordinate.

        /*
        Notes on screenX and screenY math
        We want to draw each tile in relation to the player. The worldX determines where the tile is on the world map.
        screenX and screenY are independent of the map. Hence, why it is local within the while loop. screenX/screenY is
        taking the worldX/worldY and subtracting the player's X/Y coordinate on the world map because we are drawing based
        off the player being at the centre of the screen. We want to "move" that tile in relation to the player.
        If we want to draw to the left, this takes the X position of that tile, subtracts the player's position on the
        world map ( this is to move it however far away it needs to be ), then re-centres everything by adding the
        player's X position on the screen.
        ( worldX/Y - gp.player.worldX/Y ) find how far away the player is. ( + gp.player.screenX/Y ) draws it however many
        pixels/tiles it had to be offset from the axis in order to be centred.
        I know how it works. It's hard to explain. Sorry if this explanation sucks. Think of it as two separate maps.
        The world map is zoomed out, the draw method zooms in and creates a new map. Mapping in relation to the player.
        It then draws that map based on the world map.
        */

            if (worldX + (gp.tileSize * 2) > gp.player.worldX - gp.player.screenX &&
                worldX - (gp.tileSize * 2)< gp.player.worldX + gp.player.screenX &&
                worldY + (gp.tileSize * 2)> gp.player.worldY - gp.player.screenY &&
                worldY - (gp.tileSize * 2)< gp.player.worldY + gp.player.screenY)
            { // Determines if the tile is in frame relative to centre (player)
                g2.drawImage(mapTile[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
            }

            worldCol++;

            if(worldCol == gp.maxWorldCol) { // Once the column is at the max, it will reset x to 0 and move down one row
                worldCol = 0;
                worldRow++; // Going down one row from the top left

            }
        }
        // Test Method ** Marked for Deletion **
        // g2.drawImage(mapTile[4].image, (gp.tileSize + 50), 0, gp.tileSize/2, gp.tileSize, null);
    }
}
