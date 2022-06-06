package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Green_Button extends SuperObject {

    public object_Green_Button() {

        name = "Green_Button";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Green_Button.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = false; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
