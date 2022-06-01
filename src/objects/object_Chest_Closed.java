package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Chest_Closed extends SuperObject {

    public object_Chest_Closed() {

        name = "Chest_Closed";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Chest_Closed.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
