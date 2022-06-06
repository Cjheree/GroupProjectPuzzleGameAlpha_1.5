package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Blue_Door_3 extends SuperObject {

    public object_Blue_Door_3() {

        name = "Blue_Door_3";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Blue_Door_Closed.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = true; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}