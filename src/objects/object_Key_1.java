package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Key_1 extends SuperObject {

    public object_Key_1() {

        name = "Key_1";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Key_1.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
