package Main;

import objects.*;

public class ObjectHandler {

    GamePanel gp;

    public ObjectHandler(GamePanel gp) { // Constructor

        this.gp = gp;

    }

    public void setObject() { // Sets objects and their parameters to indexes in the obj array for recall

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
        gp.obj[12].worldX = 7 * gp.tileSize;
        gp.obj[12].worldY = 17 * gp.tileSize;
        gp.obj[12].collision = true;

        gp.obj[13] = new object_Lever_On_3();
        gp.obj[13].worldX = 1 * gp.tileSize;
        gp.obj[13].worldY = 17 * gp.tileSize;
        gp.obj[13].collision = true;

        gp.obj[14] = new object_Lever_Off_4();
        gp.obj[14].worldX = 11 * gp.tileSize;
        gp.obj[14].worldY = 17 * gp.tileSize;
        gp.obj[14].collision = true;

        gp.obj[15] = new object_Lever_On_4();
        gp.obj[15].worldX = 1 * gp.tileSize;
        gp.obj[15].worldY = 17 * gp.tileSize;
        gp.obj[15].collision = true;




    }
}
