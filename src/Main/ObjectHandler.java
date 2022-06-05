package Main;

import objects.*;

import java.util.HashMap;
import java.util.Map;

public class ObjectHandler {

    GamePanel gp;
    public static final int rng = (int) (Math.random() * 14); // Maximum of 14 combinations, -1 for indexing of array
    public static int leverCount;
    public static Map<Integer, int[]> leverCombo = new HashMap<Integer, int[]>(); // Hashmap constructors

    public ObjectHandler(GamePanel gp) { // Constructor

        this.gp = gp;

    }

    public void setObject() { // Sets objects and their parameters to indexes in the obj array for recall

        // Current Array Size = 100, change if needed

        gp.obj[0] = new object_Door_Closed_In();
        gp.obj[0].worldX = 9 * gp.tileSize;
        gp.obj[0].worldY = 19 * gp.tileSize;

        gp.obj[1] = new object_Chest_Closed();
        gp.obj[1].worldX = 11 * gp.tileSize;
        gp.obj[1].worldY = 32 * gp.tileSize;

        gp.obj[2] = new object_Chest_Open();
        gp.obj[2].worldX = 1 * gp.tileSize;
        gp.obj[2].worldY = 1 * gp.tileSize;
        gp.obj[2].collision = true;

        gp.obj[3] = new object_Key_1();
        gp.obj[3].worldX = 1 * gp.tileSize;
        gp.obj[3].worldY = 29 * gp.tileSize;

        gp.obj[4] = new object_Ladder_Up();
        gp.obj[4].worldX = 1 * gp.tileSize;
        gp.obj[4].worldY = 1 * gp.tileSize;

        gp.obj[5] = new object_Ladder_Down();
        gp.obj[5].worldX = 1 * gp.tileSize;
        gp.obj[5].worldY = 1 * gp.tileSize;

        gp.obj[6] = new object_Lock_Locked();
        gp.obj[6].worldX = 1 * gp.tileSize;
        gp.obj[6].worldY = 1 * gp.tileSize;

        gp.obj[7] = new object_Key_1();
        gp.obj[7].worldX = 9 * gp.tileSize;
        gp.obj[7].worldY = 32 * gp.tileSize;

        gp.obj[8] = new object_Lever_Off_1();
        gp.obj[8].worldX = 7 * gp.tileSize;
        gp.obj[8].worldY = 13 * gp.tileSize;
        gp.obj[8].collision = true;

        gp.obj[9] = new object_Lever_On_1();
        gp.obj[9].worldX = 1 * gp.tileSize;
        gp.obj[9].worldY = 13 * gp.tileSize;
        gp.obj[9].collision = true;

        gp.obj[10] = new object_Lever_Off_2();
        gp.obj[10].worldX = 11 * gp.tileSize;
        gp.obj[10].worldY = 13 * gp.tileSize;
        gp.obj[10].collision = true;

        gp.obj[11] = new object_Lever_On_2();
        gp.obj[11].worldX = 1 * gp.tileSize;
        gp.obj[11].worldY = 13 * gp.tileSize;
        gp.obj[11].collision = true;

        gp.obj[12] = new object_Lever_Off_3();
        gp.obj[12].worldX = 11 * gp.tileSize;
        gp.obj[12].worldY = 17 * gp.tileSize;
        gp.obj[12].collision = true;

        gp.obj[13] = new object_Lever_On_3();
        gp.obj[13].worldX = 1 * gp.tileSize;
        gp.obj[13].worldY = 17 * gp.tileSize;
        gp.obj[13].collision = true;

        gp.obj[14] = new object_Lever_Off_4();
        gp.obj[14].worldX = 7 * gp.tileSize;
        gp.obj[14].worldY = 17 * gp.tileSize;
        gp.obj[14].collision = true;

        gp.obj[15] = new object_Lever_On_4();
        gp.obj[15].worldX = 1 * gp.tileSize;
        gp.obj[15].worldY = 17 * gp.tileSize;
        gp.obj[15].collision = true;

        gp.obj[16] = new object_Red_Door_1();
        gp.obj[16].worldX = 6 * gp.tileSize;
        gp.obj[16].worldY = 8 * gp.tileSize;

        gp.obj[17] = new object_Blue_Door_1();
        gp.obj[17].worldX = 12 * gp.tileSize;
        gp.obj[17].worldY = 5 * gp.tileSize;

        gp.obj[18] = new object_Red_Door_2();
        gp.obj[18].worldX = 7 * gp.tileSize;
        gp.obj[18].worldY = 4 * gp.tileSize;

        gp.obj[19] = new object_Blue_Door_2();
        gp.obj[19].worldX = 9 * gp.tileSize;
        gp.obj[19].worldY = 2 * gp.tileSize;

        gp.obj[20] = new object_Red_Door_2();
        gp.obj[20].worldX = 9 * gp.tileSize;
        gp.obj[20].worldY = 0 * gp.tileSize;

        gp.obj[21] = new object_Red_Button_1();
        gp.obj[21].worldX = 8 * gp.tileSize;
        gp.obj[21].worldY = 9 * gp.tileSize;

        gp.obj[22] = new object_Red_Button_2();
        gp.obj[22].worldX = 9 * gp.tileSize;
        gp.obj[22].worldY = 6 * gp.tileSize;

        gp.obj[23] = new object_Blue_Button_1();
        gp.obj[23].worldX = 10 * gp.tileSize;
        gp.obj[23].worldY = 9 * gp.tileSize;

        gp.obj[24] = new object_Blue_Button_2();
        gp.obj[24].worldX = 6 * gp.tileSize;
        gp.obj[24].worldY = 3 * gp.tileSize;

        gp.obj[25] = new object_Barrel();
        gp.obj[25].worldX = 11 * gp.tileSize;
        gp.obj[25].worldY = 33 * gp.tileSize;





    }

    public void setLeverCombination() { // Sets lever combo to corresponding array via a random number generator

        // List of combinations for levers, {1 = on, 0 = off, 1 = topLeft, 2 = topRight, 3 bottomRight, 4 = bottomLeft}
        leverCombo.put(0, new int[]{1, 0, 0, 0});
        leverCombo.put(1, new int[]{0, 1, 0, 0});
        leverCombo.put(2, new int[]{0, 0, 1, 0});
        leverCombo.put(3, new int[]{0, 0, 0, 1});
        leverCombo.put(4, new int[]{1, 1, 0, 0});
        leverCombo.put(5, new int[]{1, 0, 1, 0});
        leverCombo.put(6, new int[]{1, 0, 0, 1});
        leverCombo.put(7, new int[]{1, 1, 1, 0});
        leverCombo.put(8, new int[]{1, 1, 0, 1});
        leverCombo.put(9, new int[]{0, 1, 1, 0});
        leverCombo.put(10, new int[]{0, 1, 0, 1});
        leverCombo.put(11, new int[]{0, 1, 1, 1});
        leverCombo.put(12, new int[]{0, 0, 1, 1});
        leverCombo.put(13, new int[]{1, 0, 1, 1});
    }
}
