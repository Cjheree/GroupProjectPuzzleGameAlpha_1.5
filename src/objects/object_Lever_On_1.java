package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Lever_On_1 extends SuperObject {

    public object_Lever_On_1() {

        name = "Lever_On_1";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Lever_On.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}