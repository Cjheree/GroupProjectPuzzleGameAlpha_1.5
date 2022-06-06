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
        gp.obj[0].worldY = 47 * gp.tileSize;

        gp.obj[1] = new object_Chest_Closed();
        gp.obj[1].worldX = 0 * gp.tileSize;
        gp.obj[1].worldY = 0 * gp.tileSize;

        gp.obj[2] = new object_Chest_Open();
        gp.obj[2].worldX = 0 * gp.tileSize;
        gp.obj[2].worldY = 0 * gp.tileSize;
        gp.obj[2].collision = true;

        gp.obj[3] = new object_Key_1(); // Beginning Maze Key
        gp.obj[3].worldX = 1 * gp.tileSize;
        gp.obj[3].worldY = 57 * gp.tileSize;

        gp.obj[4] = new object_Ladder_Up();
        gp.obj[4].worldX = 1 * gp.tileSize;
        gp.obj[4].worldY = 1 * gp.tileSize;

        gp.obj[5] = new object_Easter_Egg();
        gp.obj[5].worldX = 15 * gp.tileSize;
        gp.obj[5].worldY = 33 * gp.tileSize;

        gp.obj[6] = new object_Lock_Locked();
        gp.obj[6].worldX = 1 * gp.tileSize;
        gp.obj[6].worldY = 1 * gp.tileSize;

        gp.obj[7] = new object_Key_1(); // Starting Room Key
        gp.obj[7].worldX = 9 * gp.tileSize;
        gp.obj[7].worldY = 60 * gp.tileSize;

        gp.obj[8] = new object_Lever_Off_1();
        gp.obj[8].worldX = 7 * gp.tileSize;
        gp.obj[8].worldY = 41 * gp.tileSize;
        gp.obj[8].collision = true;

        gp.obj[9] = new object_Lever_On_1();
        gp.obj[9].worldX = 0 * gp.tileSize;
        gp.obj[9].worldY = 0 * gp.tileSize;
        gp.obj[9].collision = true;

        gp.obj[10] = new object_Lever_Off_2();
        gp.obj[10].worldX = 11 * gp.tileSize;
        gp.obj[10].worldY = 41 * gp.tileSize;
        gp.obj[10].collision = true;

        gp.obj[11] = new object_Lever_On_2();
        gp.obj[11].worldX = 0 * gp.tileSize;
        gp.obj[11].worldY = 0 * gp.tileSize;
        gp.obj[11].collision = true;

        gp.obj[12] = new object_Lever_Off_3();
        gp.obj[12].worldX = 11 * gp.tileSize;
        gp.obj[12].worldY = 45 * gp.tileSize;
        gp.obj[12].collision = true;

        gp.obj[13] = new object_Lever_On_3();
        gp.obj[13].worldX = 0 * gp.tileSize;
        gp.obj[13].worldY = 0 * gp.tileSize;
        gp.obj[13].collision = true;

        gp.obj[14] = new object_Lever_Off_4();
        gp.obj[14].worldX = 7 * gp.tileSize;
        gp.obj[14].worldY = 45 * gp.tileSize;
        gp.obj[14].collision = true;

        gp.obj[15] = new object_Lever_On_4();
        gp.obj[15].worldX = 0 * gp.tileSize;
        gp.obj[15].worldY = 0 * gp.tileSize;
        gp.obj[15].collision = true;

        gp.obj[16] = new object_Barrel_Closed();
        gp.obj[16].worldX = 7 * gp.tileSize;
        gp.obj[16].worldY = 60 * gp.tileSize;
        gp.obj[16].collision = true;

        gp.obj[17] = new object_Barrel_Closed();
        gp.obj[17].worldX = 11 * gp.tileSize;
        gp.obj[17].worldY = 60 * gp.tileSize;
        gp.obj[17].collision = true;

        gp.obj[18] = new object_Barrel_Closed();
        gp.obj[18].worldX = 11 * gp.tileSize;
        gp.obj[18].worldY = 64 * gp.tileSize;
        gp.obj[18].collision = true;

        gp.obj[19] = new object_Barrel_Closed();
        gp.obj[19].worldX = 7 * gp.tileSize;
        gp.obj[19].worldY = 64 * gp.tileSize;
        gp.obj[19].collision = true;

        gp.obj[20] = new object_Door_Closed_Lever();
        gp.obj[20].worldX = 9 * gp.tileSize;
        gp.obj[20].worldY = 39 * gp.tileSize;
        gp.obj[20].collision = true;

        gp.obj[21] = new object_Key_1(); // Lever Key
        gp.obj[21].worldX = 0 * gp.tileSize;
        gp.obj[21].worldY = 0 * gp.tileSize;
        gp.obj[21].collision = true;

        // Buttons and Key
        gp.obj[22] = new object_Red_Button();
        gp.obj[22].worldX = 15 * gp.tileSize;
        gp.obj[22].worldY = 38 * gp.tileSize;
        gp.obj[22].collision = true;

        gp.obj[23] = new object_Blue_Button();
        gp.obj[23].worldX = 1 * gp.tileSize;
        gp.obj[23].worldY = 35 * gp.tileSize;
        gp.obj[23].collision = true;

        gp.obj[24] = new object_Green_Button();
        gp.obj[24].worldX = 4 * gp.tileSize;
        gp.obj[24].worldY = 38 * gp.tileSize;
        gp.obj[24].collision = true;

        gp.obj[25] = new object_Purple_Button();
        gp.obj[25].worldX = 17 * gp.tileSize;
        gp.obj[25].worldY = 32 * gp.tileSize;
        gp.obj[25].collision = true;

        gp.obj[26] = new object_Key_1(); // Coloured Door Maze Key 1, Goes to door on right
        gp.obj[26].worldX = 1 * gp.tileSize;
        gp.obj[26].worldY = 38 * gp.tileSize;
        gp.obj[26].collision = true;

        // Lots of fucking doors
        gp.obj[27] = new object_Red_Door_1(); // Door in Maze
        gp.obj[27].worldX = 4 * gp.tileSize;
        gp.obj[27].worldY = 36 * gp.tileSize;
        gp.obj[27].collision = true;

        gp.obj[28] = new object_Red_Door_2(); // Correct Door after maze
        gp.obj[28].worldX = 4 * gp.tileSize;
        gp.obj[28].worldY = 19 * gp.tileSize;
        gp.obj[28].collision = true;

        gp.obj[29] = new object_Red_Door_3(); // Copy-paste door
        gp.obj[29].worldX = 6 * gp.tileSize;
        gp.obj[29].worldY = 19 * gp.tileSize;
        gp.obj[29].collision = true;

        gp.obj[30] = new object_Red_Door_3(); // Copy-paste door
        gp.obj[30].worldX = 8 * gp.tileSize;
        gp.obj[30].worldY = 19 * gp.tileSize;
        gp.obj[30].collision = true;

        gp.obj[31] = new object_Red_Door_3(); // Copy-paste door
        gp.obj[31].worldX = 10 * gp.tileSize;
        gp.obj[31].worldY = 19 * gp.tileSize;
        gp.obj[31].collision = true;

        gp.obj[32] = new object_Red_Door_3(); // Copy-paste door
        gp.obj[32].worldX = 12 * gp.tileSize;
        gp.obj[32].worldY = 19 * gp.tileSize;
        gp.obj[32].collision = true;

        gp.obj[33] = new object_Red_Door_3(); // Copy-paste door
        gp.obj[33].worldX = 14 * gp.tileSize;
        gp.obj[33].worldY = 19 * gp.tileSize;
        gp.obj[33].collision = true;

        gp.obj[34] = new object_Blue_Door_1(); // Door in Maze
        gp.obj[34].worldX = 13 * gp.tileSize;
        gp.obj[34].worldY = 35 * gp.tileSize;
        gp.obj[34].collision = true;

        gp.obj[35] = new object_Blue_Door_2(); // Correct Door after maze
        gp.obj[35].worldX = 10 * gp.tileSize;
        gp.obj[35].worldY = 25 * gp.tileSize;
        gp.obj[35].collision = true;

        gp.obj[36] = new object_Blue_Door_3(); // Copy-paste door
        gp.obj[36].worldX = 4 * gp.tileSize;
        gp.obj[36].worldY = 25 * gp.tileSize;
        gp.obj[36].collision = true;

        gp.obj[37] = new object_Blue_Door_3(); // Copy-paste door
        gp.obj[37].worldX = 6 * gp.tileSize;
        gp.obj[37].worldY = 25 * gp.tileSize;
        gp.obj[37].collision = true;

        gp.obj[38] = new object_Blue_Door_3(); // Copy-paste door
        gp.obj[38].worldX = 8 * gp.tileSize;
        gp.obj[38].worldY = 25 * gp.tileSize;
        gp.obj[38].collision = true;

        gp.obj[39] = new object_Blue_Door_3(); // Copy-paste door
        gp.obj[39].worldX = 12 * gp.tileSize;
        gp.obj[39].worldY = 25 * gp.tileSize;
        gp.obj[39].collision = true;

        gp.obj[40] = new object_Blue_Door_3(); // Copy-paste door
        gp.obj[40].worldX = 14 * gp.tileSize;
        gp.obj[40].worldY = 25 * gp.tileSize;
        gp.obj[40].collision = true;

        gp.obj[41] = new object_Green_Door_1(); // Door in Maze
        gp.obj[41].worldX = 16 * gp.tileSize;
        gp.obj[41].worldY = 35 * gp.tileSize;
        gp.obj[41].collision = true;

        gp.obj[42] = new object_Green_Door_2(); // Correct Door after maze
        gp.obj[42].worldX = 14 * gp.tileSize;
        gp.obj[42].worldY = 16 * gp.tileSize;
        gp.obj[42].collision = true;

        gp.obj[43] = new object_Green_Door_3(); // Copy-paste door
        gp.obj[43].worldX = 4 * gp.tileSize;
        gp.obj[43].worldY = 16 * gp.tileSize;
        gp.obj[43].collision = true;

        gp.obj[44] = new object_Green_Door_3(); // Copy-paste door
        gp.obj[44].worldX = 6 * gp.tileSize;
        gp.obj[44].worldY = 16 * gp.tileSize;
        gp.obj[44].collision = true;

        gp.obj[45] = new object_Green_Door_3(); // Copy-paste door
        gp.obj[45].worldX = 8 * gp.tileSize;
        gp.obj[45].worldY = 16 * gp.tileSize;
        gp.obj[45].collision = true;

        gp.obj[46] = new object_Green_Door_3(); // Copy-paste door
        gp.obj[46].worldX = 10 * gp.tileSize;
        gp.obj[46].worldY = 16 * gp.tileSize;
        gp.obj[46].collision = true;

        gp.obj[47] = new object_Green_Door_3(); // Copy-paste door
        gp.obj[47].worldX = 12 * gp.tileSize;
        gp.obj[47].worldY = 16 * gp.tileSize;
        gp.obj[47].collision = true;

        gp.obj[48] = new object_Purple_Door_1(); // Door in Maze
        gp.obj[48].worldX = 9 * gp.tileSize;
        gp.obj[48].worldY = 31 * gp.tileSize;
        gp.obj[48].collision = true;

        gp.obj[49] = new object_Purple_Door_2(); // Correct Door after maze
        gp.obj[49].worldX = 8 * gp.tileSize;
        gp.obj[49].worldY = 13 * gp.tileSize;
        gp.obj[49].collision = true;

        gp.obj[50] = new object_Purple_Door_3(); // Copy-paste door
        gp.obj[50].worldX = 4 * gp.tileSize;
        gp.obj[50].worldY = 13 * gp.tileSize;
        gp.obj[50].collision = true;

        gp.obj[51] = new object_Purple_Door_3(); // Copy-paste door
        gp.obj[51].worldX = 6 * gp.tileSize;
        gp.obj[51].worldY = 13 * gp.tileSize;
        gp.obj[51].collision = true;

        gp.obj[52] = new object_Purple_Door_3(); // Copy-paste door
        gp.obj[52].worldX = 10 * gp.tileSize;
        gp.obj[52].worldY = 13 * gp.tileSize;
        gp.obj[52].collision = true;

        gp.obj[53] = new object_Purple_Door_3(); // Copy-paste door
        gp.obj[53].worldX = 12 * gp.tileSize;
        gp.obj[53].worldY = 13 * gp.tileSize;
        gp.obj[53].collision = true;

        gp.obj[54] = new object_Purple_Door_3(); // Copy-paste door
        gp.obj[54].worldX = 14 * gp.tileSize;
        gp.obj[54].worldY = 13 * gp.tileSize;
        gp.obj[54].collision = true;

        gp.obj[55] = new object_Locked_Door_1(); // Door in Maze 1
        gp.obj[55].worldX = 5 * gp.tileSize;
        gp.obj[55].worldY = 35 * gp.tileSize;
        gp.obj[55].collision = true;

        gp.obj[56] = new object_Locked_Door_2(); // Door in Maze 2
        gp.obj[56].worldX = 15 * gp.tileSize;
        gp.obj[56].worldY = 36 * gp.tileSize;
        gp.obj[56].collision = true;

        gp.obj[57] = new object_Locked_Door_3(); // Correct door after maze 1
        gp.obj[57].worldX = 6 * gp.tileSize;
        gp.obj[57].worldY = 28 * gp.tileSize;
        gp.obj[57].collision =  true;

        gp.obj[58] = new object_Locked_Door_4(); // Correct door after maze 2
        gp.obj[58].worldX = 12 * gp.tileSize;
        gp.obj[58].worldY = 22 * gp.tileSize;
        gp.obj[58].collision = true;

        gp.obj[59] = new object_Locked_Door_5(); // Copy-paste door
        gp.obj[59].worldX = 4 * gp.tileSize;
        gp.obj[59].worldY = 28 * gp.tileSize;
        gp.obj[59].collision = true;

        gp.obj[60] = new object_Locked_Door_5(); // Copy-paste door
        gp.obj[60].worldX = 8 * gp.tileSize;
        gp.obj[60].worldY = 28 * gp.tileSize;
        gp.obj[60].collision = true;

        gp.obj[61] = new object_Locked_Door_5(); // Copy-paste door
        gp.obj[61].worldX = 10 * gp.tileSize;
        gp.obj[61].worldY = 28 * gp.tileSize;
        gp.obj[61].collision = true;

        gp.obj[62] = new object_Locked_Door_5(); // Copy-paste door
        gp.obj[62].worldX = 12 * gp.tileSize;
        gp.obj[62].worldY = 28 * gp.tileSize;
        gp.obj[62].collision = true;

        gp.obj[63] = new object_Locked_Door_5(); // Copy-paste door
        gp.obj[63].worldX = 14 * gp.tileSize;
        gp.obj[63].worldY = 28 * gp.tileSize;
        gp.obj[63].collision = true;

        gp.obj[64] = new object_Locked_Door_6(); // Copy-paste door
        gp.obj[64].worldX = 4 * gp.tileSize;
        gp.obj[64].worldY = 22 * gp.tileSize;
        gp.obj[64].collision = true;

        gp.obj[65] = new object_Locked_Door_6(); // Copy-paste door
        gp.obj[65].worldX = 6 * gp.tileSize;
        gp.obj[65].worldY = 22 * gp.tileSize;
        gp.obj[65].collision = true;

        gp.obj[66] = new object_Locked_Door_6(); // Copy-paste door
        gp.obj[66].worldX = 8 * gp.tileSize;
        gp.obj[66].worldY = 22 * gp.tileSize;
        gp.obj[66].collision = true;

        gp.obj[67] = new object_Locked_Door_6(); // Copy-paste door
        gp.obj[67].worldX = 10 * gp.tileSize;
        gp.obj[67].worldY = 22 * gp.tileSize;
        gp.obj[67].collision = true;

        gp.obj[68] = new object_Locked_Door_6(); // Copy-paste door
        gp.obj[68].worldX = 14 * gp.tileSize;
        gp.obj[68].worldY = 22 * gp.tileSize;
        gp.obj[68].collision = true;




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
