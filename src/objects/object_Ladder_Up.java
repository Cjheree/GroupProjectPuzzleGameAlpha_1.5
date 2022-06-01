package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Ladder_Up extends SuperObject {

    public object_Ladder_Up() {

        name = "Ladder_Up";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Ladder_Up.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
