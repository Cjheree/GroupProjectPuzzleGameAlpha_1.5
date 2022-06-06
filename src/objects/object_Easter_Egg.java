package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Easter_Egg extends SuperObject {

    public object_Easter_Egg() {

        name = "Easter_Egg";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Easter_Egg.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
