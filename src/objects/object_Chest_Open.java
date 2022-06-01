package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Chest_Open extends SuperObject {

    public object_Chest_Open() {

        name = "Chest_Open";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Chest_Open.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
