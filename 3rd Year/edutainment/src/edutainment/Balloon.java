package edutainment;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.*;


public class Balloon{
//	Timer t= new Timer(10, this);
	public int x;
	public int y;
	private int speed;
	public int score;
	private static BufferedImage balloon, balloon2, balloon3, balloon4;
	
	
	public Balloon()
    {
        this.x = x;
        this.y = y;
        
        this.speed = speed;
        
        this.score = score;
        
        this.balloon = balloon;        
    }
	
	public void Update()
    {
        y -= speed;
    }
	
	public void Draw(Graphics2D g2d)
    {
        g2d.drawImage(balloon, x, y, null);
    }


}


