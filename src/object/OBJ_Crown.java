package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Crown extends SuperObject{
	public OBJ_Crown()
	{
		name = "Crown";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/crown.png"));
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	

}
