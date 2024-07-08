package main;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import entity.Entity;
import entity.Player;
import object.SuperObject;
import tile.TileManager;

public class GamePanel extends JPanel implements Runnable{
	//Screen Settings
	
	final int originalTileSize = 16; //16x16 tiles
	final int scale = 3;
	
	public final int tileSize = originalTileSize * scale; //48x48 tile
	public final int maxScreenCol = 16;
	public final int maxScreenRow = 12;
	public final int screenWidth = tileSize * maxScreenCol; //768 pixels
	public final int screenHeight = tileSize * maxScreenRow; //576 pixels
	
	//World Settings
	public final int maxWorldCol = 107;
	public final int maxWorldRow = 14;
	public final int worldWidth = tileSize * maxWorldCol;
	public final int worldHeight = tileSize * maxWorldRow;
	
	//FPS
	int FPS = 60;
	
	KeyHandler keyH  = new KeyHandler();
	Thread gameThread;
	
	public CollisionChecker cChecker = new CollisionChecker(this);
	public AssetSetter aSetter = new AssetSetter(this);
	public Player player = new Player(this,keyH);
	TileManager tileM = new TileManager(this);
	public SuperObject obj[] = new SuperObject[20];
	
	
	//set player default position
	int playerX = 100;
	int playerY = 100;
	int playerSpeed = 4;
	
	public GamePanel()
	{
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyH);
		this.setFocusable(true);
	}
	
	public void setupGame()
	{
		aSetter.setObject();
	}
	
	public void startGameThread()
	{
		gameThread = new Thread(this);
		gameThread.start();
	}

	@Override
	public void run() {
		
		double drawInterval = 1000000000/FPS; // 0.01666 seconds
		double delta = 0;
		long lastTime = System.nanoTime();
		long currentTime;
		long timer = 0;
		int drawCount = 0;

		while (gameThread != null)
		{
			
			currentTime = System.nanoTime();

			delta +=(currentTime - lastTime) / drawInterval;
			lastTime = currentTime;
			
			if (delta>= 1)
			{
				// update information such as character position
				
				update();
				// draw the screen with the updated information
				repaint();
				delta--;
				drawCount++;
			}
			if (timer>= 1000000000)
			{
				System.out.println("FPS:" + drawCount);
				drawCount = 0;
				timer = 0;
			}


			
			
			
		}
			
	}
	
	public void update()
	{
		player.update();

	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		//Tile
		tileM.draw(g2);
		//Object
		for(int i = 0 ; i < obj.length; i++)
		{
			if(obj[i] != null)
			{
				obj[i].draw(g2, this);
			}
		}
		//Player
		player.draw(g2);

		g2.dispose();
		
	}
	
	
	
}
