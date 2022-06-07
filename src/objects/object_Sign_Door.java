package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Sign_Door extends SuperObject {

    public object_Sign_Door() {

        name = "Sign_Door";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Sign_Door.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = false; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
