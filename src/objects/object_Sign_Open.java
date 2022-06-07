package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Sign_Open extends SuperObject {

    public object_Sign_Open() {

        name = "Sign_Open";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Sign_Open.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = false; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
