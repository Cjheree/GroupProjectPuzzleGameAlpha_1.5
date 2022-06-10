package Main;

import entity.Entity;

public class CollisionHandler {

    GamePanel gp;

    public CollisionHandler(GamePanel gp) { // Allows Collision Handler to interact with Game Panel

        this.gp = gp;

    }

    public void checkTile (Entity entity) { // Determines if entity will/has collided with a non-traversable tile

        int entityLeftBoundX = entity.worldX + entity.solidArea.x; // Left boundary of solidArea
        int entityRightBoundX = entity.worldX + entity.solidArea.x + entity.solidArea.width; // Right boundary of solidArea
        int entityUpperBoundY = entity.worldY + entity.solidArea.y; // Upper/Top boundary of solidArea
        int entityLowerBoundY = entity.worldY + entity.solidArea.y + entity.solidArea.height; // Lower/bottom boundary of solidArea

        int entityLeftCol = entityLeftBoundX/gp.tileSize;
        int entityRightCol = entityRightBoundX/gp.tileSize;
        int entityUpperRow = entityUpperBoundY/gp.tileSize;
        int entityLowerRow = entityLowerBoundY/gp.tileSize;

        int tile1, tile2;

        switch (entity.direction) {
            case "up":
                entityUpperRow = (entityUpperBoundY - entity.speed)/gp.tileSize;
                tile1 = gp.tileM.mapTileNum[entityLeftCol][entityUpperRow]; // Stores the tile above (left)
                tile2 = gp.tileM.mapTileNum[entityRightCol][entityUpperRow]; // Stores the tile above (right)
                if (gp.tileM.mapTile[tile1].collision == true || gp.tileM.mapTile[tile2].collision == true) {
                    // Checks to see if it is not a traversable tile
                    entity.collisionState = true;
                }
                break;
            case "down":
                entityLowerRow = (entityLowerBoundY + entity.speed)/gp.tileSize;
                tile1 = gp.tileM.mapTileNum[entityLeftCol][entityLowerRow]; // Stores the tile below (left)
                tile2 = gp.tileM.mapTileNum[entityRightCol][entityLowerRow]; // Stores the tile below (right)
                if (gp.tileM.mapTile[tile1].collision == true || gp.tileM.mapTile[tile2].collision == true) {
                    // Checks to see if it is not a traversable tile
                    entity.collisionState = true;
                }
                break;
            case "left":
                entityLeftCol = (entityLeftBoundX - entity.speed)/gp.tileSize;
                tile1 = gp.tileM.mapTileNum[entityLeftCol][entityUpperRow]; // Stores the tile left (above player)
                tile2 = gp.tileM.mapTileNum[entityLeftCol][entityLowerRow]; // Stores the tile left (below player)
                if (gp.tileM.mapTile[tile1].collision == true || gp.tileM.mapTile[tile2].collision == true) {
                    // Checks to see if it is not a traversable tile
                    entity.collisionState = true;
                }
                break;
            case "right":
                entityRightCol = (entityRightBoundX + entity.speed)/gp.tileSize;
                tile1 = gp.tileM.mapTileNum[entityRightCol][entityUpperRow]; // Stores the tile right (above player)
                tile2 = gp.tileM.mapTileNum[entityRightCol][entityLowerRow]; // Stores the tile above (below player)
                if (gp.tileM.mapTile[tile1].collision == true || gp.tileM.mapTile[tile2].collision == true) {
                    // Checks to see if it is not a traversable tile
                    entity.collisionState = true;
                }
                break;
        }

    }

    public int checkObject (Entity entity, boolean player) { // Determines if object collision is true and handles accordingly

        int index = 999;

        for (int i = 0; i < gp.obj.length; i++) {

            if (gp.obj[i] != null) { // If no object, then ignore

                // Entity = Player, returns player X/Y solid areas
                entity.solidArea.x = entity.worldX + entity.solidArea.x;
                entity.solidArea.y = entity.worldY + entity.solidArea.y;

                // Obj = Object, returns objects X/Y solid areas
                gp.obj[i].solidArea.x = gp.obj[i].worldX + gp.obj[i].solidArea.x;
                gp.obj[i].solidArea.y = gp.obj[i].worldY + gp.obj[i].solidArea.y;

                switch (entity.direction) {
                    case "up":
                        entity.solidArea.y -= entity.speed;
                        if (entity.solidArea.intersects(gp.obj[i].solidArea)) {
                            if (gp.obj[i].collision == true) { // Returns logic of collision (object specific)
                                entity.collisionState = true; // Turns Collision on
                            }
                            if (player == true) { // Only allows player entity interaction
                                index = i;
                            }
                        }
                        break;
                    case "down":
                        entity.solidArea.y += entity.speed;
                        if (entity.solidArea.intersects(gp.obj[i].solidArea)) {
                            if (gp.obj[i].collision == true) { // Returns logic of collision (object specific)
                                entity.collisionState = true; // Turns Collision on
                            }
                            if (player == true) { // Only allows player entity interaction
                                index = i;
                            }
                        }
                        break;
                    case "left":
                        entity.solidArea.x -= entity.speed;
                        if (entity.solidArea.intersects(gp.obj[i].solidArea)) {
                            if (gp.obj[i].collision == true) { // Returns logic of collision (object specific)
                                entity.collisionState = true; // Turns Collision on
                            }
                            if (player == true) { // Only allows player entity interaction
                                index = i;
                            }
                        }
                        break;
                    case "right":
                        entity.solidArea.x += entity.speed;
                        if (entity.solidArea.intersects(gp.obj[i].solidArea)) {
                            if (gp.obj[i].collision == true) { // Returns logic of collision (object specific)
                                entity.collisionState = true; // Turns Collision on
                            }
                            if (player == true) { // Only allows player entity interaction
                                index = i;
                            }
                        }
                        break;
                }
                entity.solidArea.x = entity.solidAreaDefaultX;
                entity.solidArea.y = entity.solidAreaDefaultY;
                gp.obj[i].solidArea.x = gp.obj[i].solidAreaDefaultX;
                gp.obj[i].solidArea.y = gp.obj[i].solidAreaDefaultY;
            }
        }

        return index;

    }

}

