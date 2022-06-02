package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Red_Door_2 extends SuperObject {

    public object_Red_Door_2() {

        name = "Red_Door_Closed_2";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Red_Door_Closed.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = true; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}