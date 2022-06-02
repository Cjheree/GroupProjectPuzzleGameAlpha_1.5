package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Lever_Off_3 extends SuperObject {

    public object_Lever_Off_3() {

        name = "Lever_Off_3";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Lever_Off.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
