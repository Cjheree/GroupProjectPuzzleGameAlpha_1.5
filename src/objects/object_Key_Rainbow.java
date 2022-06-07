package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Key_Rainbow extends SuperObject {

    public object_Key_Rainbow() {

        name = "Key_Rainbow";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Key_Rainbow.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
