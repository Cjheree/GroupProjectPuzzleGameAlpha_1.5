package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Blue_Button extends SuperObject {

    public object_Blue_Button() {

        name = "Blue_Button";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Blue_Button.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = false; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
