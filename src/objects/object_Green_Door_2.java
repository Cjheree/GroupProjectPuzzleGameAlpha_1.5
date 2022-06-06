package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Green_Door_2 extends SuperObject {

    public object_Green_Door_2() {

        name = "Green_Door_2";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Green_Door_Closed.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = true; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
