package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Red_Button_2 extends SuperObject {

    public object_Red_Button_2() {

        name = "Red_Button_2";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Red_Button.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = false; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
