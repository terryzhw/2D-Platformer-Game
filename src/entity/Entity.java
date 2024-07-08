package entity;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Entity {
	
	public int worldX, worldY;
	public int speed;
	
	public BufferedImage idleLeft1, idleLeft2, idleRight1, idleRight2, left1, left2, left3, left4, right1, right2, right3, right4, runLeft1, runLeft2, runLeft3, runLeft4, runRight1, runRight2, runRight3, runRight4, jumpLeft1,jumpLeft2,jumpLeft3,jumpLeft4,jumpLeft5,jumpLeft6,jumpLeft7,jumpLeft8, jumpRight1,jumpRight2,jumpRight3,jumpRight4,jumpRight5,jumpRight6,jumpRight7,jumpRight8;
	public String direction;
	
	//walk
	public int spriteCounter = 0;
	public int spriteNum = 1;
	
	//idle
	public int spriteIdleCounter = 0;
	public int spriteIdleNum = 1;
	public boolean spriteIdle = true;
	public boolean spriteIdlePutter = false;
	//run
	public int spriteRunCounter = 0;
	public int spriteRunNum = 1;
	public boolean spriteRun = false;
	public boolean spriteRunLeft = false;
	public boolean spriteRunRight = false;

	//jump
	public int spriteJumpNum = 1;
	public boolean spriteJump = false;
	public int spriteJumpCounter = 0;
	public boolean spriteJumpPutter = false;
	
	public Rectangle solidArea;
	public int solidAreaDefaultX, solidAreaDefaultY;
	
	public boolean collisionOn = false;
	public boolean onGround = false;
	//physic
	public double velocity = 0; 
	public double acceleration = 0;
	
}
