package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Rainbow_Door extends SuperObject {

    public object_Rainbow_Door() {

        name = "Rainbow_Door";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Rainbow_Door.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = true; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
