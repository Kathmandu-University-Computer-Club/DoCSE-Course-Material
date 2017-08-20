package edutainment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.*;
import java.awt.geom.AffineTransform;
import java.net.*;
import java.io.File;
import java.sql.*;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;


public class MainScreen extends JFrame {
	
	private JButton play, start,option,about,toMenu,Tomenu, math, science, exit, goback, level2subject, play2level, gamepage2play; 
	private JButton l1, l2, l3, l4, l5, l6, l7, l8, l9;
	private JCheckBox sound;
	private JLabel abtTxt, b4game;
	private Icon startImg, playImg, optionImg, abtImg, backImg, mathImg, sciImg, exitImg, tohome, soundImg;
	private Icon li1, li2, li3, li4, li5, li6, li7, li8, li9;
	public Home home;
	public int level, questionid, highscore;
	public String section;
	public String sql;
	public ResultSet rs;
	public Database dbquestions;
	public Timer timer,timer1,timer2,timer3,timer4;
	private boolean imageShown;
	private int buttonsshown = 0;
	public int newScore = 0;
	public int soundIs;
	
	public MainScreen(){
		home = new Home();
		setTitle("Edutainment");
	    setResizable(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	    setSize(1370,730);
	    //pack();
		add(home);	
	}
	
	
	
	public void playClick() {
		if(soundIs==1){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("click.wav"));
            Clip clip = AudioSystem.getClip( );
            clip.open(audioInputStream);
            clip.start( );
        }
        catch(Exception e)  {
            e.printStackTrace( );
        }
		}
    }
	
	public void playRight() {
		if(soundIs==1){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("right.wav"));
            Clip clip = AudioSystem.getClip( );
            clip.open(audioInputStream);
            clip.start( );
        }
        catch(Exception e)  {
            e.printStackTrace( );
        }}
    }
	
	public void playWrong() {
		if(soundIs==1){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("wrong.wav"));
            Clip clip = AudioSystem.getClip( );
            clip.open(audioInputStream);
            clip.start( );
        }
        catch(Exception e)  {
            e.printStackTrace( );
        }
    }
	}
	
	public void playWarning() {
		if(soundIs==1){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("warning.wav"));
            Clip clip = AudioSystem.getClip( );
            clip.open(audioInputStream);
            clip.start( );
        }
        catch(Exception e)  {
            e.printStackTrace( );
        }
    }
	}
	
public class Home extends JPanel{
	
	 private BufferedImage img;
	    public Home() {
	    	
	        // load the background image
	        try {
	            img = ImageIO.read(new File("menuscreen.jpg"));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
   //       setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	        setBorder(new EmptyBorder(new Insets(270, 625, 400, 600)));
	        startImg= new ImageIcon("start.png");
	        start = new JButton(startImg);	
	        start.setBorderPainted( false );
	        start.setFocusPainted(false);
	        start.setContentAreaFilled(false);
	        start.addActionListener(new startListener());
	        
	        playImg = new ImageIcon("play.png");
	        play = new JButton(playImg);
	        play.setContentAreaFilled(false);
	        play.setBorder(new EmptyBorder(0,0,0,0));
	        play.addActionListener(new playListener());
	        
	        backImg = new ImageIcon("back.png");
	        level2subject = new JButton(backImg);
	        level2subject.setContentAreaFilled(false);
	        level2subject.setBorder(new EmptyBorder(0,0,0,0));
	        level2subject.addActionListener(new level2subjectListener());
	        
	        play2level = new JButton(backImg);
	        play2level.setContentAreaFilled(false);
	        play2level.setBorder(new EmptyBorder(0,0,0,0));
	        play2level.addActionListener(new play2levelListener());
	        
	        gamepage2play = new JButton(playImg);
	        gamepage2play.setContentAreaFilled(false);
	        gamepage2play.setBorder(new EmptyBorder(0,0,0,0));
	        gamepage2play.addActionListener(new gamepage2playListener());
	        
	        li1=new ImageIcon("l1.png");
	        l1=new JButton(li1);
	        l1.setContentAreaFilled(false);
	        l1.setBorder(new EmptyBorder(0,0,0,0));
	        l1.addActionListener(new l1Listener());
	        li2=new ImageIcon("l2.png");
	        l2=new JButton(li2);
	        l2.setContentAreaFilled(false);
	        l2.setBorder(new EmptyBorder(0,0,0,0));
	        l2.addActionListener(new l2Listener());
	        li3=new ImageIcon("l3.png");
	        l3=new JButton(li3);
	        l3.setContentAreaFilled(false);
	        l3.setBorder(new EmptyBorder(0,0,0,0));
	        l3.addActionListener(new l3Listener());
	        li4=new ImageIcon("l4.png");
	        l4=new JButton(li4);
	        l4.setContentAreaFilled(false);
	        l4.setBorder(new EmptyBorder(0,0,0,0));
	        l4.addActionListener(new l4Listener());
	        li5=new ImageIcon("l5.png");
	        l5=new JButton(li5);
	        l5.setContentAreaFilled(false);
	        l5.setBorder(new EmptyBorder(0,0,0,0));
	        l5.addActionListener(new l5Listener());
	        li6=new ImageIcon("l6.png");
	        l6=new JButton(li6);
	        l6.setContentAreaFilled(false);
	        l6.setBorder(new EmptyBorder(0,0,0,0));
	        l6.addActionListener(new l6Listener());
	        li7=new ImageIcon("l7.png");
	        l7=new JButton(li7);
	        l7.setContentAreaFilled(false);
	        l7.setBorder(new EmptyBorder(0,0,0,0));
	        l7.addActionListener(new l7Listener());
	        li8=new ImageIcon("l8.png");
	        l8=new JButton(li8);
	        l8.setContentAreaFilled(false);
	        l8.setBorder(new EmptyBorder(0,0,0,0));
	        l8.addActionListener(new l8Listener());
	        li9=new ImageIcon("l9.png");
	        l9=new JButton(li9);
	        l9.setContentAreaFilled(false);
	        l9.setBorder(new EmptyBorder(0,0,0,0));
	        l9.addActionListener(new l9Listener());
	        
	        mathImg= new ImageIcon("math.png");
	        math = new JButton(mathImg);
	        math.setBorder(new EmptyBorder(0,0,0,0));
	        math.addActionListener(new mathListener());
	        
	        sciImg= new ImageIcon("science.png");
	        science = new JButton(sciImg);	 
	        science.setBorder(new EmptyBorder(0,0,0,0));
	        science.addActionListener(new scienceListener());
	        
	        exitImg = new ImageIcon("exit.png");
	        exit = new JButton(exitImg);
	        exit.setBorder(new EmptyBorder(0,0,0,0));
	        exit.setBorderPainted( false );
	        exit.setFocusPainted(false);
	        exit.setContentAreaFilled(false);
	        exit.addActionListener(new exitListener());
	        
	        optionImg = new ImageIcon("options.png");
	        option= new JButton(optionImg);	      
	        option.setBorderPainted( false );
	        option.setFocusPainted(false);
	        option.setContentAreaFilled(false);
	        option.addActionListener(new optionListener());
	        
	        abtImg = new ImageIcon("abtUs.png");
	        about= new JButton(abtImg);
	        about.setContentAreaFilled(false);
	        about.setBorder(new EmptyBorder(0,0,0,0));
	        about.addActionListener(new aboutListener());
	        
	        abtTxt = new JLabel("<html>We're working on it, alright!!!"+"&nbsp;&nbsp;&nbsp;&nbsp;</html>");
	        abtTxt.setFont(new Font("Chiller",3,40));
	        
	        b4game = new JLabel("Click 'Play' to Start");
	        b4game.setFont(new Font("Chiller",3, 40));
	        
	        toMenu = new JButton(backImg);
	        toMenu.setContentAreaFilled(false);
	        toMenu.setBorder(new EmptyBorder(0,0,0,0));
        	toMenu.addActionListener(new toMenuListener());
        	
        	Tomenu = new JButton(backImg);
        	Tomenu.setContentAreaFilled(false);
        	Tomenu.setBorder(new EmptyBorder(0,0,0,0));
        	Tomenu.addActionListener(new toMenuListener());
        	
        	
        	sound = new JCheckBox("Sound Effects");
        	sound.setFont(new Font("Times New Roman",0,15));
        	sound.addItemListener(new soundListener());
        	
	        MainMenu(); 
	        
	        dbquestions = new Database();
	        
	    }
	    
	    private void MainMenu(){
	    	setBorder(new EmptyBorder(new Insets(270, 625, 400, 600)));
			 add(start);
			 add(option);
	         add(about);
	         add(exit);
		}
	    
	    
	    
	    private void Play(){
	    	
	    	setBorder(new EmptyBorder(new Insets(270, 470,500, 470)));
	    	add(math);
	    	add(science);
	    	add(toMenu);
	    	
	    }
	    
	    private void Options(){
	    	setBorder(new EmptyBorder(new Insets(270, 625, 400, 600)));
	    	add(sound);
	    	add(Box.createRigidArea(new Dimension(0, 50)));
	    	add(toMenu);
	    	
	    }
	    
	    private void About(){
	    	setBorder(new EmptyBorder(new Insets(270, 625, 400, 600)));
	    	add(abtTxt);
	    	add(Box.createRigidArea(new Dimension(0, 150)));
	    	add(toMenu);
	    	
	    }

	    private void level(){
	    	setBorder(new EmptyBorder(new Insets(270, 470,500, 470)));
	    	add(l1);
	    	add(l2);
	    	add(l3);
	    	add(l4);
	    	add(l5);
	    	add(l6);
	    	add(l7);
	    	add(l8);
	    	add(l9);
	    	add(level2subject);
	    	
	    }
	    
	    private void b4game(){
	    	setBorder(new EmptyBorder(new Insets(270, 470,500, 470)));
	    	add(b4game);
	    	add(play);
	    	add(play2level);
	    }
	    
	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        // paint the background image and scale it to fill the entire space
	        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	    }
	    
	    class startListener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent ae) 
	        {
	        	playClick();
	        	removeAll();
	            Play();
	            repaint();
	            validate();
	        }
	    }
	    
	    class mathListener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent ae) 
	        {   
	        	playClick();
	        	section = "math";
	        	removeAll();
	        	level();
	        	repaint();
	        	validate();
	        }
	    }
	    
	    class scienceListener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent ae) 
	        {   
	        	playClick();
	        	section = "science";
	        	removeAll();
	        	level();
	        	repaint();
	        	validate();
	        }
	    }
	    
	    class exitListener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent ae) 
	        {
	        	playClick();
	        	dispose();
	        }
	    }
	    
	    class aboutListener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent ae) 
	        {
	        	playClick();
	        	removeAll();
	            About();
	            repaint();
	            validate();
	        }
	    }
	    
	    class playListener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent ae) 
	        {
	        	playClick();
	        	Game();
	        }
	    }
	    
	    class level2subjectListener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent ae) 
	        {
	        	playClick();
	        	removeAll();
	            Play();
	            repaint();
	            validate();
	        }
	    }
	    
	    class play2levelListener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent ae) 
	        {
	        	playClick();
	        	removeAll();
	            level();
	            repaint();
	            validate();
	        }
	    }
	    
	    class gamepage2playListener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent ae) 
	        {
	        	playClick();
//888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888
	        }
	    }
	    
	    class soundListener implements ItemListener
	    {
	    	public void itemStateChanged(ItemEvent ae)
	    	{
	    		if(soundIs==0)
	    		soundIs=1;
	    		else
	    			soundIs=0;
	    		
	    	}
	    }
	    
	    class l1Listener implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent ae)
	    	{
	    		playClick();
	    		level=1;
	    		removeAll();
	    		b4game();
	    		repaint();
	    		validate();
	    		//Game();
	    	}
	    }
	    
	    class l2Listener implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent ae)
	    	{playClick();
	    		level=2;
	    		removeAll();
	    		b4game();
	    		repaint();
	    		validate();
	    	//	Game();
	    	}
	    }
	    
	    class l3Listener implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent ae)
	    	{playClick();
	    		level=3;
	    		removeAll();
	    		b4game();
	    		repaint();
	    		validate();
	    	//	Game();
	    	}
	    }
	    
	    class l4Listener implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent ae)
	    	{playClick();
	    		level=4;
	    		removeAll();
	    		b4game();
	    		repaint();
	    		validate();
	    	//	Game();
	    	}
	    }
	    
	    class l5Listener implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent ae)
	    	{playClick();
	    		level=5;
	    		removeAll();
	    		b4game();
	    		repaint();
	    		validate();
	    	//	Game();
	    	}
	    }
	    
	    class l6Listener implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent ae)
	    	{playClick();
	    		level=6;
	    		removeAll();
	    		b4game();
	    		repaint();
	    		validate();
	    	//	Game();
	    	}
	    }
	    
	    class l7Listener implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent ae)
	    	{playClick();
	    		level=7;
	    		removeAll();
	    		b4game();
	    		repaint();
	    		validate();
	    	//	Game();
	    	}
	    }
	    
	    class l8Listener implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent ae)
	    	{playClick();
	    		level=8;
	    		removeAll();
	    		b4game();
	    		repaint();
	    		validate();
	    	//	Game();
	    	}
	    }
	    
	    class l9Listener implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent ae)
	    	{playClick();
	    		level=9;
	    		removeAll();
	    		b4game();
	    		repaint();
	    		validate();
	    	//	Game();
	    	}
	    }
	    
	    
	    public class toMenuListener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent ae) 
	        {playClick();
	        	removeAll();
	            MainMenu();
	            repaint();
	            validate();
	        }
	    }

	    public class optionListener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent ae) 
	        {playClick();
	        	removeAll();
	            Options();
	            repaint();
	            validate();
	        }
	    }
}
public void Game(){
	 getContentPane().removeAll();
     getContentPane().add(new GamePage());//Adding to content pane, not to Frame
	 repaint();
     printAll(getGraphics());//Extort print all content
}

public class GamePage extends JPanel{
	private ImageIcon imgicon, rectangle, line, line2, quitImg, replayImg;
	private Icon tohome;
	public Home home;
	public MainScreen back;
	private BufferedImage gameScreen; 
	private JLabel mcq, prevAns, nowScore, Answered, levelUp, box, lineup, linedown, showHigh, displevel;
	private JButton opt1, opt2, opt3, opt4, nxtlevel, quit, goback, replay;
	private Icon b1, b2, b3, b4, nxtlevelImg;
	private int i, j, k, l,m, n;
	public String ans,ans1,ans2,ans3,ans4, prevans, prevChoice;
	public int answered;
	public HiScore hi = new HiScore();
	
	public GamePage(){
		answered = 0;
		
		try {
            gameScreen = ImageIO.read(new File("gameScreen.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		setLayout(null);
		
/*		b1= new ImageIcon("a.png");
        opt1 = new JButton(b1);
         
        opt1.setContentAreaFilled(false);
        opt1.setBorder(new EmptyBorder(0,0,0,0));
        
        b2= new ImageIcon("b.png");
        opt2 = new JButton(b2);	
       
        opt2.setContentAreaFilled(false);
        opt2.setBorder(new EmptyBorder(0,0,0,0));
        
        b3= new ImageIcon("c.png");
        opt3 = new JButton(b3);	
         
        opt3.setContentAreaFilled(false);
        opt3.setBorder(new EmptyBorder(0,0,0,0));
        
        b4= new ImageIcon("d.png");
        opt4 = new JButton(b4);	
         
        opt4.setContentAreaFilled(false);
        opt4.setBorder(new EmptyBorder(0,0,0,0));
     */   
      //  tohome = new ImageIcon("back.png");
		quitImg = new ImageIcon("quit.png");
        quit = new JButton(quitImg);
        quit.addActionListener(new quitListener());
        quit.setContentAreaFilled(false);
        quit.setBorder(new EmptyBorder(0,0,0,0));
        quit.setBounds(1230,0, 115, 115);
        
		
		   getId();
	       addoptions();
	       addquestion();
	       showScore(newScore);
	       showAnswered();
	}
	
	
	 public void getId(){
		 if(section=="math")
				questionid=randInt(1,252);
			else if(section =="science")
				questionid=randInt(1,196);
		 
		 try{
	    		sql = "SELECT * FROM " + section + " WHERE question_id=" + questionid;
	    		//	rs=dbquestions.st.getResultSet();
					rs= dbquestions.st.executeQuery(sql);
					rs.next();	
					ans = rs.getString(3);
				 	ans1 = rs.getString(4);
					ans2 = rs.getString(5);
					ans3 = rs.getString(6);
					ans4 = rs.getString(7);
				}
			catch(Exception ex){	 ex.printStackTrace();	}

	 } 
	 
	public void addquestion(){
		
		line= new ImageIcon("line.png");
		line2=new ImageIcon("line2.png");
		lineup=new JLabel(line);
		linedown=new JLabel(line2);
		lineup.setBounds(-15,400,1350,30);
		linedown.setBounds(15,640,1350,30);
		
		try
        {
        	//while((rs!=null) && (rs.next()))
        	{	mcq = new JLabel("<html>Q . "+rs.getString("question")+"<br>a. "+ans1
        			+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;b. "
        			+ans2+"<br> c. "+ans3
        			+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;d. "
        			+ans4+"</html>");
	        mcq.setFont(new Font("Times New Roman",3,30));
	        answered++;
        	}
        }
        catch(Exception e )
        {
        	mcq = new JLabel(e.toString());
	        mcq.setFont(new Font("Times New Roman",1,30));
        }
		mcq.setBounds(300, 400, 900, 250);
		add(mcq);
		add(lineup);
		add(linedown);
	}
	
	public void showScore(int sc){
		nowScore = new JLabel("<html>Score : " + sc + "</html>");
		nowScore.setFont(new Font("Times New Roman",3,20));
		nowScore.setBounds(50, 20, 150, 25);
		add(nowScore);
		
		hi.openToRead();
		highscore = hi.readFile();
		hi.closeRead();
		
		if (newScore > highscore){
			highscore = newScore;
			showHigh = new JLabel("<html>Level : "+level+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
					+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Highscore : "+newScore+"</html>");
			
		}
		
		showHigh = new JLabel("<html>Level : "+level+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Highscore : "+highscore+"</html>");
		showHigh.setFont(new Font("Times New Roman",3,20));
		showHigh.setBounds(600, 20, 400, 25);
		add(showHigh);
		
	}
	
	public void prevResult(String pr, String cr){
		prevAns = new JLabel("<html>Previous Answer: "+ cr+"<br>(You answered " + pr + "ly)</html>");
		prevAns.setFont(new Font("Times New Roman",3,20));
		prevAns.setBounds(250, 20, 500, 50);
		add(prevAns);
	}
	
	public void showAnswered(){
		Answered = new JLabel("<html>"+answered+"/10</html>");
		Answered.setFont(new Font("Times New Roman",3,20));
		Answered.setBounds(1050, 20, 50, 25);
		add(Answered);
	}
	
	public void newLevel(){
		add(quit);

		rectangle = new ImageIcon("rectangle.png");
		box = new JLabel(rectangle);
		box.setBounds(220,80,900, 500);
		add(box);
		
		if(level<9){
		levelUp = new JLabel("<html>You have completed Level "+level+"<br>&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Your Score : "+ newScore +"</html>");
		levelUp.setFont(new Font("Times New Roman",3,30));
		levelUp.setBounds(500,250,500, 100);
		add(levelUp);
		level++;
		
		 nxtlevelImg= new ImageIcon("next.png");
	        nxtlevel = new JButton(nxtlevelImg);	
	        nxtlevel.addActionListener(new nxtlevelListener());
	        nxtlevel.setContentAreaFilled(false);
	        nxtlevel.setBorder(new EmptyBorder(0,0,0,0));
	        nxtlevel.setBounds( 590, 350, 150, 50);
	        add(nxtlevel);
		}
		else{
			//checking for Highscore
			hi.openToRead();
			highscore = hi.readFile();
			hi.closeRead();
			if (newScore > highscore){
				hi.openToWrite();
				hi.addScore(newScore);
				hi.closeWrite();
				levelUp = new JLabel("<html>CONGRATULATIONS!!!<br>You have a new Highscore!!!<br> HIGHSCORE : "+ newScore +"</html>");
				levelUp.setBounds(500,280,500, 125);
				newScore=0;
			}
			else {
			levelUp = new JLabel("<html>You have completed all the Levels. <br> Your final Score is "+ newScore +"</html>");
			levelUp.setBounds(480,280,500, 75);
			newScore=0;
			}
			
			levelUp.setFont(new Font("Times New Roman",3,30));
			add(levelUp);
			replayImg = new ImageIcon("replay.png");
			replay = new JButton(replayImg);
			replay.setContentAreaFilled(false);
	        replay.setBorder(new EmptyBorder(0,0,0,0));
			replay.setBounds(550, 360, 128, 128);
			replay.addActionListener(new replayListener());
			add(replay);
			add(exit);
		}
		
	}
	
	public void addoptions(){
		
		 
		add(quit);
		
		buttonsshown = 0;
	    i = randInt(1,4);
        if(i==1){
        	b1= new ImageIcon("a.png");
            opt1 = new JButton(b1);
           
    imageShown = true;
    buttonsshown = buttonsshown + 1;
           
             
            opt1.setContentAreaFilled(false);
            opt1.setBorder(new EmptyBorder(0,0,0,0));
            opt1.setBounds(100, 220, 200, 200);
        add(opt1);
        
        }
        else if(i==2){
        	 b2= new ImageIcon("b.png");
             opt2 = new JButton(b2);	
     imageShown = true;
     buttonsshown = buttonsshown + 1;
             
            
             opt2.setContentAreaFilled(false);
             opt2.setBorder(new EmptyBorder(0,0,0,0));        	
            opt2.setBounds(130, 200, 200, 200);
        add(opt2);
        }
        else if(i==3){
        	 b3= new ImageIcon("c.png");
             opt3 = new JButton(b3);	
     imageShown = true;
     buttonsshown = buttonsshown + 1;
             
             	
              
             opt3.setContentAreaFilled(false);
             opt3.setBorder(new EmptyBorder(0,0,0,0));
             opt3.setBounds(160, 180, 200, 200);
        add(opt3);
        }
        else if(i==4){
        	 b4= new ImageIcon("d.png");
             opt4 = new JButton(b4);	
     imageShown = true;
     buttonsshown = buttonsshown + 1;	
              
             opt4.setContentAreaFilled(false);
             opt4.setBorder(new EmptyBorder(0,0,0,0));
            opt4.setBounds(190, 160, 200, 200);
        add(opt4);
        }
        
        do
        	j=randInt(1,4);
        while(j==i);
    
        if(j!=i && j==1) {
        	b1= new ImageIcon("a.png");
            opt1 = new JButton(b1);
            imageShown = true;
            buttonsshown = buttonsshown + 1;	
       
            opt1.setContentAreaFilled(false);
            opt1.setBorder(new EmptyBorder(0,0,0,0));
            opt1.setBounds(430, 160, 200, 200);
        add(opt1);
        }
        else if(j!=i && j==2){
        	 b2= new ImageIcon("b.png");
             opt2 = new JButton(b2);	
     imageShown = true;
     buttonsshown = buttonsshown + 1;	       
            
             opt2.setContentAreaFilled(false);
             opt2.setBorder(new EmptyBorder(0,0,0,0));
            opt2.setBounds(460, 220, 200, 200);
        add(opt2);
        }
        else if(j!=i && j==3){
        	 b3= new ImageIcon("c.png");
             opt3 = new JButton(b3);	
     imageShown = true;
     buttonsshown = buttonsshown + 1;	      
              
             opt3.setContentAreaFilled(false);
             opt3.setBorder(new EmptyBorder(0,0,0,0)); 	 
             opt3.setBounds(490, 200, 200, 200);
        add(opt3);
        }
        else if(j!=i && j==4){
        	 b4= new ImageIcon("d.png");
             opt4 = new JButton(b4);	
     imageShown = true;
     buttonsshown = buttonsshown + 1;	       
           
             opt4.setContentAreaFilled(false);
             opt4.setBorder(new EmptyBorder(0,0,0,0));
            opt4.setBounds(400, 180, 200, 200);
        add(opt4);
        }
        
        do
        k=randInt(1,4);
        while(k==i || k==j);
        if(k!=i && k!=j && k==1) {
        	b1= new ImageIcon("a.png");
            opt1 = new JButton(b1);
    imageShown = true;
    buttonsshown = buttonsshown + 1;	
            
             
            opt1.setContentAreaFilled(false);
            opt1.setBorder(new EmptyBorder(0,0,0,0)); 
            opt1.setBounds(760, 180, 200, 200);
        add(opt1);
        }
        else if(k!=i && k!=j && k==2){
        	 b2= new ImageIcon("b.png");
             opt2 = new JButton(b2);	
     imageShown = true;
     buttonsshown = buttonsshown + 1;	        
            
             opt2.setContentAreaFilled(false);
             opt2.setBorder(new EmptyBorder(0,0,0,0));
            opt2.setBounds(790, 160, 200, 200);
        add(opt2);
        }
        else if(k!=i && k!=j && k==3){
        	 b3= new ImageIcon("c.png");
             opt3 = new JButton(b3);	
     imageShown = true;
     buttonsshown = buttonsshown + 1;	    
             
              
             opt3.setContentAreaFilled(false);
             opt3.setBorder(new EmptyBorder(0,0,0,0));
             opt3.setBounds(700, 220, 200, 200);
        add(opt3);
        }
        else if(k!=i && k!=j && k==4){
        	 b4= new ImageIcon("d.png");
             opt4 = new JButton(b4);	
     imageShown = true;
     buttonsshown = buttonsshown + 1;	       
            // timer3.start();	
              
             opt4.setContentAreaFilled(false);
             opt4.setBorder(new EmptyBorder(0,0,0,0));
            opt4.setBounds(730, 200, 200, 200);
        add(opt4);
        }
        
        do
        l=randInt(1,4);
        while(l==i || l==j || l==k);
        if(l!=i && l!=j && l!=k && l==1) {
        	b1= new ImageIcon("a.png");
            opt1 = new JButton(b1);
    imageShown = true;
    buttonsshown = buttonsshown + 1;	      
            
             
            opt1.setContentAreaFilled(false);
            opt1.setBorder(new EmptyBorder(0,0,0,0));
            opt1.setBounds(1090, 200, 200, 200);
        add(opt1);
        }
        else if(l!=i && l!=j && l!=k && l==2){ b2= new ImageIcon("b.png");
        opt2 = new JButton(b2);	
imageShown = true;
buttonsshown = buttonsshown + 1;	 
        
       
       
        opt2.setContentAreaFilled(false);
        opt2.setBorder(new EmptyBorder(0,0,0,0));
            opt2.setBounds(1000, 180, 200, 200);
        add(opt2);
        }
        else if(l!=i && l!=j && l!=k && l==3){
        	 b3= new ImageIcon("c.png");
             opt3 = new JButton(b3);	
     imageShown = true;
     buttonsshown = buttonsshown + 1;	 
             	
              
             opt3.setContentAreaFilled(false);
             opt3.setBorder(new EmptyBorder(0,0,0,0));
             opt3.setBounds(1030, 160, 200, 200);
        add(opt3);
        }
        else if(l!=i && l!=j && l!=k && l==4){
        	 b4= new ImageIcon("d.png");
             opt4 = new JButton(b4);	
     imageShown = true;
     buttonsshown = buttonsshown + 1;	    
             
            
              
             opt4.setContentAreaFilled(false);
             opt4.setBorder(new EmptyBorder(0,0,0,0));
            opt4.setBounds(1060, 220, 200, 200);
        add(opt4);
        }
        
       
        timer1 = new Timer(2500-level*200, new ActionListener(){
         	@Override
         	public void actionPerformed(ActionEvent e) {
                 if(imageShown && buttonsshown == 4) {
                     opt1.setIcon(new ImageIcon("a.png"));
                     opt2.setIcon(new ImageIcon("b.png"));
                     opt3.setIcon(new ImageIcon("c.png"));
                     opt4.setIcon(new ImageIcon("d.png"));
                     imageShown = false;
                     buttonsshown = 0; 
                 } else {
                     opt1.setIcon(new ImageIcon("blank.png"));
                     opt1.addActionListener(new opt1Listener());
                     opt2.setIcon(new ImageIcon("blank.png"));
                     opt2.addActionListener(new opt2Listener());
                     opt3.setIcon(new ImageIcon("blank.png"));
                     opt3.addActionListener(new opt3Listener());
                     opt4.setIcon(new ImageIcon("blank.png"));
                     opt4.addActionListener(new opt4Listener());
                     imageShown = true;
                     buttonsshown = 4;
                     timer1.stop();
                 }
             }
         });
        timer1.start();
	}

//public void optionmanager(Timer ttime, JButton bbutt, ImageIcon iimage){}

	class quitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae) 
        {
        	playWarning();
        //	JOptionPane.showMessageDialog(null,"Are you sure?","What?", JOptionPane.YES_NO_OPTION);
        	   //int dialogButton = JOptionPane.YES_NO_OPTION;
           int exitoption =    JOptionPane.showConfirmDialog (null, "Are you sure you want to quit? "
           		+ "All your progress will be lost.","Warning!" ,JOptionPane.YES_NO_OPTION);

               if(exitoption==0){ 
            	   playClick();
        	       backHome();
        	       newScore = 0;
        	}
               else{
            	   playClick();
            	   exitoption=1;
               }
          }
    }
	
	class replayListener implements ActionListener
	{
		public void actionPerformed(ActionEvent ae){
			playClick();
			replay();
		}
	}
	
	  class nxtlevelListener implements ActionListener
	    {
	        public void actionPerformed(ActionEvent ae) 
	        {   
	        	playClick();
	        	Game();
	        }
	    }
	
	public class opt1Listener implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent ae1)
	    	{
	    		prevans=ans;
	    	if(answered>9){
	    		removeAll();
	    		showScore(newScore);
	    		prevResult(prevChoice,prevans);	
	    		newLevel();
	    		repaint();
	    		validate();
	    	}
	    	else{
	    		if(ans.equals(ans1)){
	    			newScore = newScore + level;
	    			prevChoice = "Correct";
	    			playRight();
	    		///	showScore(newScore);
	    			
	    		}
	    		else
	    		{	
	    	//		showScore(newScore);
	    			prevChoice="Incorrect";
	    			playWrong();
	    		}
	    		//newScore++;
	    		prevans=ans;
	    			removeAll();
	    			getId();
	    			addoptions();
	    			addquestion();
	    			//assignOptions();
	    			showScore(newScore);
	    			prevResult(prevChoice,prevans);
	    			showAnswered();
	    			repaint();
	    			validate();
	    			//dispose();
	    	//	Game();
	    			}
	    	}
	    }
	public class opt2Listener implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent ae2)
	    	{
	    		prevans=ans;
	    		if(answered>9){
		    		removeAll();
		    		showScore(newScore);
		    		prevResult(prevChoice,prevans);
		    		newLevel();
		    		repaint();
		    		validate();
		    	}
	    		else{
		    		if(ans.equals(ans2)){
		    			newScore=newScore+level;
		    			prevChoice="Correct";
		    			playRight();
		    		}
		    		else
		    		{	
		    			prevChoice="Incorrect";//showScore(newScore);
		    			playWrong();
		    		}
		    		prevans=ans;
	    			removeAll();
	    			getId();
	    			addoptions();
	    			addquestion();
	    			//assignOptions();
	    			showScore(newScore);
	    			prevResult(prevChoice,prevans);
	    			showAnswered();
	    			repaint();
	    			validate();
	    		}
	    	}
	    }
	public class opt3Listener implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent ae3)
	    	{
	    		prevans=ans;
	    		if(answered>9){
		    		removeAll();
		    		showScore(newScore);
		    		prevResult(prevChoice,prevans);	
		    		newLevel();
		    		repaint();
		    		validate();
		    	}
	    		else{
		    		if(ans.equals(ans3)){
		    			newScore=newScore+level;
		    			prevChoice="Correct";
		    			playRight();
		    		}
		    		else
		    		{	
		    			prevChoice="Incorrect";//showScore(newScore);
		    			playWrong();
		    		}
		    		prevans=ans;
	    		//newScore++;
	    			removeAll();
	    			getId();
	    			addoptions();
	    			addquestion();		
	    			//assignOptions();
	    			showScore(newScore);
	    			prevResult(prevChoice,prevans);
	    			showAnswered();
	    			repaint();
	    			validate();
	    		}
	    	}
	    }
	public class opt4Listener implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent ae4)
	    	{
	    		prevans=ans;
	    		if(answered>9){
		    		removeAll();
		    		showScore(newScore);
		    		prevResult(prevChoice,prevans);	
		    		newLevel();
		    		repaint();
		    		validate();
		    	}
	    		else{
		    		if(ans.equals(ans4)){
		    			newScore=newScore+level;
		    			prevChoice="Correct";
		    			playRight();
		    		//	showScore(newScore);
		    		}
		    		else
		    		{	
		    			prevChoice="Incorrect";//showScore(newScore);
		    			playWrong();
		    		}
		    		prevans=ans;
	    			removeAll();
	    			getId();
	    			addoptions();
	    			addquestion();
	    			//assignOptions();
	    			showScore(newScore);
	    			prevResult(prevChoice,prevans);
	    			showAnswered();
	    			repaint();
	    			validate();
	    	}
	    }
	 }
		
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(gameScreen, 0, 0, getWidth(), getHeight(), this);
	} 
	
}

public static int randInt(int min, int max) {

    // Usually this should be a field rather than a method variable so
    // that it is not re-seeded every call.
    Random rand = new Random();

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}

public void backHome(){	
	 getContentPane().removeAll();
	 getContentPane().add(new Home());
  	 repaint();
  	 printAll(getGraphics());	 
}
public void replay(){
	backHome();
	home.removeAll();
 	home.Play();
 	repaint();
 	validate();
}
}
