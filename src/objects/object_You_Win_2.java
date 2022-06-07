package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_You_Win_2 extends SuperObject {

    public object_You_Win_2() {

        name = "You_Win_2";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/You_Win_2.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = false; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
