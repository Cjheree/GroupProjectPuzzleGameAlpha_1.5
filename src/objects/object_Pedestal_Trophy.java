package objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class object_Pedestal_Trophy extends SuperObject {

    public object_Pedestal_Trophy() {

        name = "Pedestal_Trophy";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/Pedestal_Trophy.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        collision = false; // Door will be solid until it is unlocked ** GOING TO CHANGE **

    }

}
