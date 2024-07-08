package main;

import object.OBJ_Coin;
import object.OBJ_Crown;
import object.OBJ_Door;
import object.OBJ_Key;

public class AssetSetter {
	GamePanel gp;
	
	public AssetSetter(GamePanel gp )
	{
		this.gp = gp;
	}

	public void setObject()
	{
		gp.obj[0] = new OBJ_Coin();
		gp.obj[0].worldX = 15 * gp.tileSize;
		gp.obj[0].worldY = 9 * gp.tileSize;
		
		gp.obj[1] = new OBJ_Coin();
		gp.obj[1].worldX = 35 * gp.tileSize;
		gp.obj[1].worldY = 9 * gp.tileSize;

		gp.obj[2] = new OBJ_Coin();
		gp.obj[2].worldX = 41 * gp.tileSize;
		gp.obj[2].worldY = 9 * gp.tileSize;
		
		gp.obj[3] = new OBJ_Door();
		gp.obj[3].worldX = 45 * gp.tileSize;
		gp.obj[3].worldY = 9 * gp.tileSize;
		
		gp.obj[4] = new OBJ_Key();
		gp.obj[4].worldX = 22 * gp.tileSize;
		gp.obj[4].worldY = 3 * gp.tileSize;
		
		gp.obj[5] = new OBJ_Coin();
		gp.obj[5].worldX = 21 * gp.tileSize;
		gp.obj[5].worldY = 3 * gp.tileSize;
		
		gp.obj[6] = new OBJ_Coin();
		gp.obj[6].worldX = 23 * gp.tileSize;
		gp.obj[6].worldY = 3 * gp.tileSize;
		
		gp.obj[7] = new OBJ_Key();
		gp.obj[7].worldX = 46 * gp.tileSize;
		gp.obj[7].worldY = 5 * gp.tileSize;
		
		gp.obj[8] = new OBJ_Door();
		gp.obj[8].worldX = 55 * gp.tileSize;
		gp.obj[8].worldY = 6 * gp.tileSize;
		
		gp.obj[9] = new OBJ_Key();
		gp.obj[9].worldX = 60 * gp.tileSize;
		gp.obj[9].worldY = 4 * gp.tileSize;
		
		gp.obj[10] = new OBJ_Coin();
		gp.obj[10].worldX = 61 * gp.tileSize;
		gp.obj[10].worldY = 4 * gp.tileSize;
		
		gp.obj[11] = new OBJ_Key();
		gp.obj[11].worldX = 62 * gp.tileSize;
		gp.obj[11].worldY = 4 * gp.tileSize;
		
		gp.obj[12] = new OBJ_Door();
		gp.obj[12].worldX = 63 * gp.tileSize;
		gp.obj[12].worldY = 4 * gp.tileSize;
		
		gp.obj[13] = new OBJ_Coin();
		gp.obj[13].worldX = 75 * gp.tileSize;
		gp.obj[13].worldY = 9 * gp.tileSize;
		
		gp.obj[14] = new OBJ_Key();
		gp.obj[14].worldX = 76 * gp.tileSize;
		gp.obj[14].worldY = 9 * gp.tileSize;
		
		gp.obj[15] = new OBJ_Coin();
		gp.obj[15].worldX = 77 * gp.tileSize;
		gp.obj[15].worldY = 9 * gp.tileSize;
		
		gp.obj[16] = new OBJ_Door();
		gp.obj[16].worldX = 84 * gp.tileSize;
		gp.obj[16].worldY = 7 * gp.tileSize;
		
		gp.obj[17] = new OBJ_Door();
		gp.obj[17].worldX = 86 * gp.tileSize;
		gp.obj[17].worldY = 7 * gp.tileSize;
		
		gp.obj[18] = new OBJ_Crown();
		gp.obj[18].worldX = 102 * gp.tileSize;
		gp.obj[18].worldY = 4 * gp.tileSize;
	}
}
