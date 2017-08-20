package edutainment;

import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.ImageIcon;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
//import javax.swing.JFrame;

public class WcScreen extends JWindow {
	Image img=Toolkit.getDefaultToolkit().getImage("splash.png");
	ImageIcon imgicon= new ImageIcon(img);
	public WcScreen(){
		try{
			setSize(800,500);
			setLocationRelativeTo(null);
			show();
			Thread.sleep(500);
			dispose();
		//	MainScreen menu = new MainScreen();
		//javax.swing.JOptionPane.showMessageDialog((java.awt.Component)null,"Welcome","Welcome Screen:",javax.swing.JOptionPane.DEFAULT_OPTION);
		}
		catch(Exception exception){
			javax.swing.JOptionPane.showMessageDialog((java.awt.Component)null,"Error"+exception.getMessage(),"Error:",javax.swing.JOptionPane.DEFAULT_OPTION);
			
		}
	}

	
	public void paint(Graphics g){
		g.drawImage(img, 00, 00, this);
	}

}
