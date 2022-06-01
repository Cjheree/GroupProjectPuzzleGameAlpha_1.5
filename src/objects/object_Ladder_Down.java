package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Ladder_Down extends SuperObject {

    public object_Ladder_Down() {

        name = "Ladder_Down";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Ladder_Down.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
