package edutainment;
import java.io.*;
import java.lang.*;
import java.util.*;

public class HiScore {
		private Formatter scoreFile;
		private Scanner readScore;
		public void openToWrite(){
			try{
				scoreFile = new Formatter("highscore.txt");
			}
			catch(Exception e){
				
			}
		}
		public void openToRead(){
			try{
				readScore = new Scanner(new File("highscore.txt"));
			}
			catch(Exception e){
		//		System.out.println("u hav n error");
			}
		}
		
		 public int readFile(){
			 int tall = 0;
			 while(readScore.hasNextInt()){
				tall = readScore.nextInt();
			}
			return tall;
		}
		
		public void addScore(int score){
			scoreFile.format("%s",score);
		}
		
		public void closeWrite(){
			scoreFile.close();
		}
		
		public void closeRead(){
			readScore.close();
		}
		
	}