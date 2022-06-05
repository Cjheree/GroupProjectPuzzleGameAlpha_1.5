package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Door_Closed_Lever extends SuperObject {

    public object_Door_Closed_Lever() {

        name = "Red_Door_Closed_1";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Door_Closed_In.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = true; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
