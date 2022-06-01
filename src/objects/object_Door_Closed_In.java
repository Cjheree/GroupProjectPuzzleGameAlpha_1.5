package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Door_Closed_In extends SuperObject {

    public object_Door_Closed_In() {

        name = "Door_Closed_In";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Door_Closed_In.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = true; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
