package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Purple_Button extends SuperObject {

    public object_Purple_Button() {

        name = "Purple_Button";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Purple_Button.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = false; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
