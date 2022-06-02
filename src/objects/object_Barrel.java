package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Barrel extends SuperObject {

    public object_Barrel() {

        name = "Barrel";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("Barrel.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = false; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
