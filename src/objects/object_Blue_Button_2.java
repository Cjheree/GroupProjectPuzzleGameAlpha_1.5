package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Blue_Button_2 extends SuperObject {

    public object_Blue_Button_2() {

        name = "Blue_Button_2";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Blue_Button.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = false; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
