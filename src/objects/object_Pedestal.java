package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Pedestal extends SuperObject {

    public object_Pedestal() {

        name = "Pedestal";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Pedestal.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = false; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
