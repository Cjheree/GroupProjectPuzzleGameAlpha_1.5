package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Lock_Locked extends SuperObject {

    public object_Lock_Locked() {

        name = "Lock_Locked";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Lock_Locked.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
