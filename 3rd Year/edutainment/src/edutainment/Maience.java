package edutainment;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Maience {

	public static void main(String[] args) {
		WcScreen Welcome = new WcScreen();
	    MainScreen menu = new MainScreen();
	}

}
/*
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;


public class Maience {
  Toolkit toolkit;

  Timer timer;

  public  Maience(int seconds) {
    toolkit = Toolkit.getDefaultToolkit();
    timer = new Timer();
    timer.schedule(new RemindTask(), seconds * 1000);
  }

  class RemindTask extends TimerTask {
    public void run() {
      System.out.println("Time's up!");
      toolkit.beep();
      //timer.cancel(); //Not necessary because we call System.exit
      System.exit(0); //Stops the AWT thread (and everything else)
    }
  }

  public static void main(String args[]) {
    System.out.println("About to schedule task.");
    new Maience(5);
    System.out.println("Task scheduled.");
  }
}
      */ 