package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Locked_Door_1 extends SuperObject {

    public object_Locked_Door_1() {

        name = "Locked_Door_1";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Door_Closed_Locked.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = true; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
