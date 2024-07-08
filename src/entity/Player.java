package entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import main.GamePanel;
import main.KeyHandler;

public class Player extends Entity{
	GamePanel gp;
	KeyHandler keyH;
	
	public final int screenX;
	
	int hasCoin = 0;
	int hasKey = 0;
	int death = 0;
	int score = 0;
	String grade = " ";
	boolean dying = false;
	boolean gameWon = false;
	
	public Player(GamePanel gp, KeyHandler keyH)
	{
		this.gp = gp;
		this.keyH = keyH;
		
		screenX = gp.screenWidth/2 - (gp.tileSize / 2);

		solidArea = new Rectangle();
		solidArea.x = 14;
		solidArea.y = 16;
		solidAreaDefaultX = solidArea.x;
		solidAreaDefaultY = solidArea.y;
		solidArea.width = 20;
		solidArea.height = 32;
		
		setDefaultValues();
		getPlayerImage();
	}
	public void setDefaultValues()
	{
		worldX = gp.tileSize * 5;
		worldY = gp.tileSize * 9;
		speed = 1;
		direction = "idleRight";
	}
	
	public void getPlayerImage()
	{
		try {
			left1 = ImageIO.read(getClass().getResourceAsStream("/player/tile008flip.png"));
			left2 = ImageIO.read(getClass().getResourceAsStream("/player/tile009flip.png"));
			left3 = ImageIO.read(getClass().getResourceAsStream("/player/tile010flip.png"));
			left4 = ImageIO.read(getClass().getResourceAsStream("/player/tile011flip.png"));
			
		    right1 = ImageIO.read(getClass().getResourceAsStream("/player/tile008.png"));
		    right2 = ImageIO.read(getClass().getResourceAsStream("/player/tile009.png"));
		    right3 = ImageIO.read(getClass().getResourceAsStream("/player/tile010.png"));
		    right4 = ImageIO.read(getClass().getResourceAsStream("/player/tile011.png"));
			
			idleLeft1 = ImageIO.read(getClass().getResourceAsStream("/player/tile000flip.png"));
			idleLeft2 = ImageIO.read(getClass().getResourceAsStream("/player/tile001flip.png"));
			
			idleRight1 = ImageIO.read(getClass().getResourceAsStream("/player/tile000.png"));
			idleRight2 = ImageIO.read(getClass().getResourceAsStream("/player/tile001.png"));
			
			runLeft1 = ImageIO.read(getClass().getResourceAsStream("/player/tile012flip.png"));
			runLeft2 = ImageIO.read(getClass().getResourceAsStream("/player/tile013flip.png"));
			runLeft3 = ImageIO.read(getClass().getResourceAsStream("/player/tile014flip.png"));
			runLeft4 = ImageIO.read(getClass().getResourceAsStream("/player/tile015flip.png"));
			
			runRight1 = ImageIO.read(getClass().getResourceAsStream("/player/tile012.png"));
			runRight2 = ImageIO.read(getClass().getResourceAsStream("/player/tile013.png"));
			runRight3 = ImageIO.read(getClass().getResourceAsStream("/player/tile014.png"));
			runRight4 = ImageIO.read(getClass().getResourceAsStream("/player/tile015.png"));
			
			jumpLeft1 = ImageIO.read(getClass().getResourceAsStream("/player/tile024flip.png"));
			jumpLeft2 = ImageIO.read(getClass().getResourceAsStream("/player/tile025flip.png"));
			jumpLeft3 = ImageIO.read(getClass().getResourceAsStream("/player/tile026flip.png"));
			jumpLeft4 = ImageIO.read(getClass().getResourceAsStream("/player/tile027flip.png"));
			jumpLeft5 = ImageIO.read(getClass().getResourceAsStream("/player/tile028flip.png"));
			jumpLeft6 = ImageIO.read(getClass().getResourceAsStream("/player/tile029flip.png"));
			jumpLeft7 = ImageIO.read(getClass().getResourceAsStream("/player/tile030flip.png"));
			jumpLeft8 = ImageIO.read(getClass().getResourceAsStream("/player/tile031flip.png"));

			jumpRight1 = ImageIO.read(getClass().getResourceAsStream("/player/tile024.png"));
			jumpRight2 = ImageIO.read(getClass().getResourceAsStream("/player/tile025.png"));
			jumpRight3 = ImageIO.read(getClass().getResourceAsStream("/player/tile026.png"));
			jumpRight4 = ImageIO.read(getClass().getResourceAsStream("/player/tile027.png"));
			jumpRight5 = ImageIO.read(getClass().getResourceAsStream("/player/tile028.png"));
			jumpRight6 = ImageIO.read(getClass().getResourceAsStream("/player/tile029.png"));
			jumpRight7 = ImageIO.read(getClass().getResourceAsStream("/player/tile030.png"));
			jumpRight8 = ImageIO.read(getClass().getResourceAsStream("/player/tile031.png"));
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public void update()
	{
		
		
		if(keyH.leftPressed == true || keyH.rightPressed == true)
			{
			
		spriteCounter++;
			if(spriteCounter > 12)
			{
				if(spriteNum == 1)
				{	
					spriteNum = 2;			
				}
				else if(spriteNum == 2)
				{
					spriteNum = 3;
				}
				else if(spriteNum == 3)
				{
					spriteNum = 4;
				}
				else if(spriteNum == 4)
				{
					spriteNum = 1;
				}
				spriteCounter = 0;
			}
		}
		
		
		
		if(spriteRunLeft == true || spriteRunRight == true)
		{
	spriteRunCounter++;
		if(spriteRunCounter > 5)
		{
			if(spriteRunNum == 1)
			{	
				spriteRunNum = 2;			
			}
			else if(spriteRunNum == 2)
			{
				spriteRunNum = 3;
			}
			else if(spriteRunNum == 3)
			{
				spriteRunNum = 4;
			}
			else if(spriteRunNum == 4)
			{
				spriteRunNum = 1;
			}
			spriteRunCounter = 0;
		}
	}
		if (spriteJumpPutter == true)
		{
			spriteJumpCounter++;
			if(spriteJumpCounter > 5d)
			{
				if(spriteJumpNum == 1)
				{
					spriteJumpNum = 2;
				}
				if(spriteJumpNum == 2)
				{
					spriteJumpNum = 3;
				}
				if(spriteJumpNum == 3)
				{
					spriteJumpNum = 4;
				}
				if(spriteJumpNum == 4)
				{
					spriteJumpNum = 5;
				}
				if(spriteJumpNum == 5)
				{
					spriteJumpNum = 6;
				}
				if(spriteJumpNum == 6)
				{
					spriteJumpNum = 7;
				}
				if(spriteJumpNum == 7)
				{
					spriteJumpNum = 8;
				}
				if(spriteJumpNum == 8)
				{
					spriteJumpNum = 1;
				}
				
			}
		}

		if (spriteIdlePutter = true)
		{
			spriteIdleCounter++;
			if(spriteIdleCounter > 15)
			{
				if(spriteIdleNum == 1)
				{
					spriteIdleNum = 2;			
				}
				else if(spriteIdleNum == 2)
				{
					spriteIdleNum = 1;
				}
				spriteIdleCounter = 0;
			}
		}

		
		
		
		
		if (keyH.shiftPressed == true) {
		    spriteRun = true;
		} else {
		    spriteRun = false;
		}

		// Handle movement
		if (keyH.leftPressed == true) {
		    if (spriteRun == true) {
		        direction = "runLeft";
		        spriteRunLeft = true;
			    if (keyH.jumpPressed == true)
			    {
			    	direction = "jumpLeft";
			    	worldY -= 8;
			    	worldX -= speed*4;
			    	spriteJumpPutter = true;
			    }
		    } 
		    else if (keyH.jumpPressed == true)
		    {
		    	direction = "jumpLeft";
		    	worldY -= 8;
		    	worldX -= speed*4;
		    	spriteJumpPutter = true;
		    }
		    else {
		        direction = "left";
		    }
		} 
		else if (keyH.rightPressed == true) {
		    if (spriteRun == true) {
		        direction = "runRight";

		        spriteRunRight = true; 
			    if (keyH.jumpPressed == true)
			    {
			    	direction = "jumpRight";
			    	worldY -= 8;
			    	worldX += speed*4;
			    	spriteJumpPutter = true;
			    }
		    } 
		    else if (keyH.jumpPressed == true)
		    {
		    	direction = "jumpRight";
		    	worldY -= 8;
		    	worldX += speed*4;
		    	spriteJumpPutter = true;
		    }
		    else {
		        direction = "right";
		    }
		} 
		else {
		    // If not moving, set idle direction
		    if (direction.equals("left") || direction.equals("runLeft")) {
		        direction = "idleLeft";
		        spriteIdlePutter = true;
		    } else if (direction.equals("right") || direction.equals("runRight")) {
		        direction = "idleRight";
		        spriteIdlePutter = true;
		    }
		}

		//check tile collision
		collisionOn = false;
		gp.cChecker.checkTile(this);
		//if collision is false, player can move
		
		int objIndex = gp.cChecker.checkObject(this, true);
		pickUpObject(objIndex);

		if(collisionOn == false && gameWon == false)
		{
			switch(direction)
			{
			case "left":
		        worldX -= speed;
				break;
			case "right":
		        worldX += speed;
				break;
			case "runLeft":
		        worldX -= speed*2;
		        break;
			case "runRight":
		        worldX += speed*2;
		        break;
			}
			
		}


		//gravity
		onGround = false;
		gp.cChecker.checkTile(this);
		
		if(onGround == false)
		{
		    switch(direction)
		    {
		    
			case "idleLeft":
				velocity+= 0.5;
				worldY += velocity;
				acceleration += velocity;
				break;
			case "idleRight":
				velocity+= 0.5;
				worldY += velocity;
				acceleration += velocity;
				break;
			case "left":
				velocity+= 0.5;
				worldY += velocity;
				acceleration += velocity;
				break;
			case "right":
				velocity+= 0.5;
				worldY += velocity;
				acceleration += velocity;
				break;
			case "runLeft":
				velocity+= 0.5;
				worldY += velocity;
				acceleration += velocity;
				break;
			case "runRight":
				velocity+= 0.5;
				worldY += velocity;
				acceleration += velocity;
				break;
			case "jumpLeft":
				velocity+= 0.5;
				worldY += velocity;
				acceleration += velocity;
		    	spriteJumpPutter = false;
				break;
			case "jumpRight":
				velocity+= 0.5;
				worldY += velocity;
				acceleration += velocity;
		    	spriteJumpPutter = false;
				break;
		    }

	    }
		
		else
		{
			velocity = 0;
			acceleration = 0;
		}
		
		collisionOn = false;
		gp.cChecker.checkTile(this);
		//if collision is false, player can move

		if(collisionOn == true)
		{
			switch (direction)
			{
			case "jumpLeft":
				dying = true;
				break;
			case "jumpRight":
				dying = true;
				break;
			}
		}
		
		
		if(worldY > gp.tileSize * 12)
		{
			dying = true;
		}
		
		
		if (dying == true && worldX < gp.tileSize * 46)
		{
			worldX = gp.tileSize * 5;
			worldY = gp.tileSize * 9;
			dying = false;
			death++;
		}
		else if (dying == true && worldX > gp.tileSize * 46)
		{
			worldX = gp.tileSize * 46;
			worldY = gp.tileSize * 9;
			dying = false;
			death++;
		}
		
		score = hasCoin - death;
		if(score >= 8)
		{
			grade = "S";
		}
		else if(score < 8 && score >= 6)
		{
			grade = "A";
		}
		else if(score < 6 && score >= 4)
		{
			grade = "B";
		}
		else
		{
			grade = "C";
		}
	}
	
	public void pickUpObject(int i)
	{
		if(i != 999)
		{
			String objectName = gp.obj[i].name;
			
			switch(objectName)
			{
			case "Key":
				hasKey++;
				gp.obj[i] = null;
			case "Coin":
				hasCoin++;
				gp.obj[i] = null;
				break;
			case "Door":
				if(hasKey > 0)
				{
					gp.obj[i] = null;
					hasKey--;
				}
				break;
			case "Crown":
				gp.obj[i] = null;
				gameWon = true;
				break;
			}
			
		}
	}
	
	public void draw(Graphics2D g2)
	{
		BufferedImage image = null;
		
		switch(direction)
		{
		case "left":
			if(spriteNum == 1)
			{
				image = left1;
			}
			if(spriteNum == 2)
			{
				image = left2;
			}
			if(spriteNum == 3)
			{
				image = left3;
			}
			if(spriteNum == 4)
			{
				image = left4;
			}
			break;
		case "right":
			if(spriteNum == 1)
			{
				image = right1;
			}
			if(spriteNum == 2)
			{
				image = right2;
			}
			if(spriteNum == 3)
			{
				image = right3;
			}
			if(spriteNum == 4)
			{
				image = right4;
			}
			break;
		case "idleLeft":
			if(spriteIdleNum == 1)
			{
				image = idleLeft1;
			}
			if(spriteIdleNum == 2)
			{
				image = idleLeft2;
			}
			break;
			
		case "idleRight":
			if(spriteIdleNum == 1)
			{
				image = idleRight1;
			}
			if(spriteIdleNum == 2)
			{
				image = idleRight2;
			}
			break;
		case "runLeft":
			if(spriteRunNum == 1)
			{
				image = runLeft1;
			}
			if(spriteRunNum == 2)
			{
				image = runLeft2;
			}
			if(spriteRunNum == 3)
			{
				image = runLeft3;
			}
			if(spriteRunNum == 4)
			{
				image = runLeft4;
			}
			break;
		case "runRight":
			if(spriteRunNum == 1)
			{
				image = runRight1;
			}
			if(spriteRunNum == 2)
			{
				image = runRight2;
			}
			if(spriteRunNum == 3)
			{
				image = runRight3;
			}
			if(spriteRunNum == 4)
			{
				image = runRight4;
			}
			break;


			
			
			
			
			
		
			
		case "jumpLeft":
			if(spriteJumpNum == 1)
			{
				image = jumpLeft1;
			}
			if(spriteJumpNum == 2)
			{
				image = jumpLeft2;
			}
			if(spriteJumpNum == 3)
			{
				image = jumpLeft3;
			}
			if(spriteJumpNum == 4)
			{
				image = jumpLeft4;
			}
			if(spriteJumpNum == 5)
			{
				image = jumpLeft5;
			}
			if(spriteJumpNum == 6)
			{
				image = jumpLeft6;
			}
			if(spriteJumpNum == 7)
			{
				image = jumpLeft7;
			}
			if(spriteJumpNum == 8)
			{
				image = jumpLeft8;
			}
			
			break;
			
		case "jumpRight":
			if(spriteJumpNum == 1)
			{
				image = jumpRight1;
			}
			if(spriteJumpNum == 2)
			{
				image = jumpRight2;
			}
			if(spriteJumpNum == 3)
			{
				image = jumpRight3;
			}
			if(spriteJumpNum == 4)
			{
				image = jumpRight4;
			}
			if(spriteJumpNum == 5)
			{
				image = jumpRight5;
			}
			if(spriteJumpNum == 6)
			{
				image = jumpRight6;
			}
			if(spriteJumpNum == 7)
			{
				image = jumpRight7;
			}
			if(spriteJumpNum == 8)
			{
				image = jumpRight8;
			}
			
			break;
		

			

		}
		

		
		g2.drawImage(image, screenX, worldY, gp.tileSize, gp.tileSize, null);


		g2.setColor(Color.RED);
		g2.drawString("Deaths: " + death, screenX, worldY - 10);
		g2.drawString("Score: " + hasCoin, screenX, worldY + 5);
		
		if (worldX >= gp.tileSize * 53 && worldX < gp.tileSize * 85)
		{
			g2.drawString("Beware! Your actions have consequences", screenX - 60, worldY - 25);
		}
		
		if (gameWon == true)
		{
			g2.drawString("Grade Earned: " + grade, screenX - 20, worldY - 25);
		}



		
	}
}
