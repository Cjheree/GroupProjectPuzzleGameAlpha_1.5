package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Red_Door_1 extends SuperObject {

    public object_Red_Door_1() {

        name = "Door_Closed_In";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Red_Door_Closed.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = true; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
