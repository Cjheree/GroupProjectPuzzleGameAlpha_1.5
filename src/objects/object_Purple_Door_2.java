package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Purple_Door_2 extends SuperObject {

    public object_Purple_Door_2() {

        name = "Purple_Door_2";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Purple_Door_Closed.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = true; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
