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

        mapTile = new Tile[100]; // Set size of mapTile storage array
        objectTile = new Tile[100]; // Set size of object storage array
        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];

        getTileImage(); // Sets tile images according to specific data structure and tile type
        loadMap("maps/MapV4.txt"); // Loads map from specified txt file

    }

    public void getTileImage() { // Retrieves Tile images and assigns to corresponding Tile

        try { // Assigns image to each index specified

            // Map Tile Assignments
            mapTile[0] = new Tile();
            mapTile[0].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Stone_1.png"));
            mapTile[0].collision = true;

            mapTile[1] = new Tile();
            mapTile[1].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Soft_Black_Background.png"));
            mapTile[1].collision = true;

            mapTile[2] = new Tile();
            mapTile[2].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Dirt_2.png"));

            mapTile[3] = new Tile(); // Test Door
            mapTile[3].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("Door_Closed_In.png"));

            mapTile[4] = new Tile(); // Test Door (for 16 pixel width)
            mapTile[4].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Door_Closed_Out_Right_16W.png"));

            mapTile[5] = new Tile();
            mapTile[5].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Centre_1.png"));

            mapTile[6] = new Tile();
            mapTile[6].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Centre_2.png"));

            mapTile[7] = new Tile();
            mapTile[7].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Centre_3.png"));

            mapTile[8] = new Tile();
            mapTile[8].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Top_Left_Corner.png"));

            mapTile[9] = new Tile();
            mapTile[9].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Top_Right_Corner.png"));

            mapTile[10] = new Tile();
            mapTile[10].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Bottom_Right_Corner.png"));

            mapTile[11] = new Tile();
            mapTile[11].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Bottom_Left_Corner.png"));

            mapTile[12] = new Tile();
            mapTile[12].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Top_Border.png"));

            mapTile[13] = new Tile();
            mapTile[13].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Bottom_Border.png"));

            mapTile[14] = new Tile();
            mapTile[14].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Right_Border.png"));

            mapTile[15] = new Tile();
            mapTile[15].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Left_Border.png"));

            mapTile[16] = new Tile();
            mapTile[16].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Path_Up_Down.png"));

            mapTile[17] = new Tile();
            mapTile[17].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Path_Left_Right.png"));

            mapTile[18] = new Tile();
            mapTile[18].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Path_Up_Corners.png"));

            mapTile[19] = new Tile();
            mapTile[19].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Path_Bottom_Corners.png"));

            mapTile[20] = new Tile();
            mapTile[20].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Room_Top.png"));

            mapTile[21] = new Tile();
            mapTile[21].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Room_Bottom.png"));

            mapTile[22] = new Tile();
            mapTile[22].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Room_Right.png"));

            mapTile[23] = new Tile();
            mapTile[23].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Room_Left.png"));

            mapTile[24] = new Tile();
            mapTile[24].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Path_Four_Corners.png"));

            mapTile[25] = new Tile();
            mapTile[25].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Path_Three_Way_Up.png"));

            mapTile[26] = new Tile();
            mapTile[26].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Path_Three_Way_Down.png"));

            mapTile[27] = new Tile();
            mapTile[27].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Path_Three_Way_Right.png"));

            mapTile[28] = new Tile();
            mapTile[28].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Path_Three_Way_Left.png"));

            mapTile[29] = new Tile();
            mapTile[29].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Top_Left_Corner_WOC.png"));

            mapTile[30] = new Tile();
            mapTile[30].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Top_Right_Corner_WOC.png"));

            mapTile[31] = new Tile();
            mapTile[31].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Bottom_Right_Corner_WOC.png"));

            mapTile[32] = new Tile();
            mapTile[32].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Bottom_Left_Corner_WOC.png"));

            mapTile[33] = new Tile();
            mapTile[33].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Path_Left_Corners.png"));

            mapTile[34] = new Tile();
            mapTile[34].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Path_Right_Corners.png"));

            mapTile[35] = new Tile();
            mapTile[35].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Path_TheTileNoOneAskedFor.png"));

            mapTile[36] = new Tile();
            mapTile[36].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Top_Left_Corner_Inverted.png"));

            mapTile[37] = new Tile();
            mapTile[37].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/Floor_Tile_Top_Right_Corner_Inverted.png"));








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
