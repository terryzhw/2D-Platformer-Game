package main;

import entity.Entity;

public class CollisionChecker {

	GamePanel gp;
	
	public CollisionChecker(GamePanel gp)
	{
		this.gp = gp;
	}
	
	public void checkTile(Entity entity)
	{
		int entityLeftWorldX = entity.worldX + entity.solidArea.x;
		int entityRightWorldX = entity.worldX + entity.solidArea.x + entity.solidArea.width;
		int entityTopWorldY = entity.worldY + entity.solidArea.y;
		int entityBottomWorldY = entity.worldY + entity.solidArea.y + entity.solidArea.height;
		
		int entityLeftCol = entityLeftWorldX/gp.tileSize;
		int entityRightCol = entityRightWorldX/gp.tileSize;
		int entityTopRow = entityTopWorldY/gp.tileSize;
		int entityBottomRow = entityBottomWorldY/gp.tileSize;
		
		int tileNum1;
		int tileNum2;
		
		switch(entity.direction){
		case "left":
			entityLeftCol = (entityLeftWorldX - entity.speed)/gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
			tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityTopRow];
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true)
			{
				entity.collisionOn = true;
			}
			break;
		case "runLeft":
			entityLeftCol = (entityLeftWorldX - entity.speed*2)/gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
			tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityTopRow];
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true)
			{
				entity.collisionOn = true;
			}
			break;
		case "right":
			entityRightCol = (entityRightWorldX + entity.speed)/gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
			tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityTopRow];
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true)
			{
				entity.collisionOn = true;
			}
			break;
		case "runRight":
			entityRightCol = (entityRightWorldX + entity.speed*2)/gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
			tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityTopRow];
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true)
			{
				entity.collisionOn = true;
			}
			break;
		case "jumpLeft":
			entityBottomRow = (entityLeftWorldX - entity.speed*5)/gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
			tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityTopRow];
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true)
			{
				entity.collisionOn = true;
			}
		case "jumpRight":
			entityBottomRow = (entityRightWorldX + entity.speed*5)/gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
			tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityTopRow];
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true)
			{
				entity.collisionOn = true;
			}
		}
		
		
		
		
		//gravity
		switch(entity.direction)
		{
		
		case "idleLeft":
			entityBottomRow = (entityBottomWorldY + entity.speed)/gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
			tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow];
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true)
			{
				entity.onGround = true;
			}
		case "idleRight":
			entityBottomRow = (entityBottomWorldY + entity.speed)/gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
			tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow];
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true)
			{
				entity.onGround = true;
			}
		case "left":
			entityBottomRow = (entityBottomWorldY + entity.speed)/gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
			tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow];
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true)
			{
				entity.onGround = true;
			}
		case "right":
			entityBottomRow = (entityBottomWorldY + entity.speed)/gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
			tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow];
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true)
			{
				entity.onGround = true;
			}
		case "runLeft":
			entityBottomRow = (entityBottomWorldY + entity.speed)/gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
			tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow];
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true)
			{
				entity.onGround = true;
			}
		case "runRight":
			entityBottomRow = (entityBottomWorldY + entity.speed)/gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
			tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow];
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true)
			{
				entity.onGround = true;
			}
		case "jumpLeft":
			entityBottomRow = (entityBottomWorldY + entity.speed*7)/gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
			tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow];
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true)
			{
				entity.onGround = true;
			}
		case "jumpRight":
			entityBottomRow = (entityBottomWorldY + entity.speed*7)/gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
			tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow];
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true)
			{
				entity.onGround = true;
			}
		}
		
	}
	
	public int checkObject(Entity entity, boolean player)
	{
		int index = 999;
		
		for(int i = 0; i < gp.obj.length; i++)
		{
			if(gp.obj[i] != null)
			{
				//get entity's solid area position
				entity.solidArea.x = entity.worldX + entity.solidArea.x;
				entity.solidArea.y = entity.worldY + entity.solidArea.y;
				
				//get the object's solid area position
				gp.obj[i].solidArea.x = gp.obj[i].worldX + gp.obj[i].solidArea.x;
				gp.obj[i].solidArea.y = gp.obj[i].worldY + gp.obj[i].solidArea.y;
				
				switch(entity.direction) {
				case "left":
					entity.solidArea.x -= entity.speed;
					if(entity.solidArea.intersects(gp.obj[i].solidArea))
					{
						if(gp.obj[i].collision == true)
						{
							entity.collisionOn = true;
						}
						if(player == true)
						{
							index = i;
						}
					}
					break;
				case "right":
					entity.solidArea.x += entity.speed;
					if(entity.solidArea.intersects(gp.obj[i].solidArea))
					{
						if(gp.obj[i].collision == true)
						{
							entity.collisionOn = true;
						}
						if(player == true)
						{
							index = i;
						}
					}
					break;
				case "runLeft":
					entity.solidArea.x -= entity.speed * 2;
					if(entity.solidArea.intersects(gp.obj[i].solidArea))
					{
						if(gp.obj[i].collision == true)
						{
							entity.collisionOn = true;
						}
						if(player == true)
						{
							index = i;
						}
					}
					break;
				case "runRight":
					entity.solidArea.x += entity.speed * 2;
					if(entity.solidArea.intersects(gp.obj[i].solidArea))
					{
						if(gp.obj[i].collision == true)
						{
							entity.collisionOn = true;
						}
						if(player == true)
						{
							index = i;
						}
					}
					break;
				case "jumpLeft":
					entity.solidArea.x -= entity.speed * 5;
					if(entity.solidArea.intersects(gp.obj[i].solidArea))
					{
						if(gp.obj[i].collision == true)
						{
							entity.collisionOn = true;
						}
						if(player == true)
						{
							index = i;
						}
					}
					break;
				case "jumpRight":
					entity.solidArea.x += entity.speed * 5;
					if(entity.solidArea.intersects(gp.obj[i].solidArea))
					{
						if(gp.obj[i].collision == true)
						{
							entity.collisionOn = true;
						}
						if(player == true)
						{
							index = i;
						}
					}
					break;
				}
				entity.solidArea.x = entity.solidAreaDefaultX;
				entity.solidArea.y = entity.solidAreaDefaultY;
				gp.obj[i].solidArea.x = gp.obj[i].solidAreaDefaultX;
				gp.obj[i].solidArea.y = gp.obj[i].solidAreaDefaultY;
			}
		}
		return index;
	}
}
