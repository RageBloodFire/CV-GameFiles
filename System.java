// System Class
import java.util.*;
import java.io.FileReader;
import java.io.*;
import LightEnemy;
import HeavyEnemy;
import Player;


public class System{
	
	// Attributes
	private LightEnemy[] lightEnemies;
	private HeavyEnemy[] heavyEnemies;
	private LightEnemy lightEnemy;
	private HeavyEnemy heavyEnemy;
	private Player player;
	private int score = 0;
	private int floorCount = 0;
	
	
	// Constructor
	
	
	// Methods
	public void generateEnvironment(Player player){
		
	}
	
	public Object generateEnemy(int option){
		if(option == 1){
			return generateLightEnemy();
		}
		else{
			return generateHeavyEnemy();
		}
	}
	
	public LightEnemy generateLightEnemy(){
		lightEnemy = new LightEnemy();
		return lightEnemy;
	}
	
	public HeavyEnemy generateHeavyEnemy(){
		heavyEnemy = new HeavyEnemy();
		return heavyEnemy;
	}
	
	public void startMessage(){
		System.out.println("***************\t C-Virus \t***************");
		System.out.println("***************\t Game \t***************");
		System.out.println("***\t\t\t\t\t\t\t\t***");
		System.out.println("***\t It's the year 2023 and there has been a \t***");
		System.out.println("***\t a pandemic outbreak scientists call The C-Virus. \t***");
		System.out.println("***\t It began in Thania to the East where it quickly \t***");
		System.out.println("***\t spread via physical contact or bodily fluids. \t***");
		System.out.println("***\t The specific cause of the virus is still unknown, \t***");
		System.out.println("***\t but one thing is for sure, a mutation is \t***");
		System.out.println("***\t the virus’s genetic structure that turns \t***");
		System.out.println("***\t the infected into crazed, flesh-eating zombies. \t***");
		System.out.println("***\t\t\t\t\t\t\t\t***");
		System.out.println("***\t You’re a 20 year old male named Kim. You were \t***");
		System.out.println("***\t searching a hotel complex for supplies. When \t***");
		System.out.println("***\t you got to the roof of the building, you looked \t***");
		System.out.println("***\t over the edge and saw a horde of zombies attacking \t***");
		System.out.println("***\t your company on the ground floor. The zombies start \t***");
		System.out.println("***\t to enter the building. You must fight  your way out \t***");
		System.out.println("***\t and return to the Safe House 2 blocks away! \t***");
	}
	
	
	// Getters and Setters
	public LightEnemy[] getLightEnemies(){
		return lightEnemies[];
	}
	
	public void setLightEnemies(Array arr){}
	
	public HeavyEnemy[] getHeavyEnemies(){
		return heavyEnemies[];
	}
	
	public void setHeavyEnemies(Array arr){}
	
	public LightEnemy getLightEnemy(){
		return lightEnemy;
	}
	
	public void setLightEnemy(LightEnemy le){
		lightEnemy = le;
	}
	
	public HeavyEnemy getHeavyEnemy(){
		return heavyEnemy;
	}
	
	public void setHeavyEnemy(HeavyEnemy he){
		heavyEnemy = he;
	}
	
	public Player getPlayer(){
		return player;
	}
	
	public void setPlayer(Player ply){
		player = ply;
	}
	
	public int getScore(){
		return score;
	}
	
	public void setScore(int scr){
		score = scr;
	}
	
	public int getFloorCount(){
		return floorCount;
	}
	
	public void setFloorCount(int flr){
		floorCount = flr;
	}
	
	
	// Main Execution Area
	public static void main(Strnig[] args){
		
		
	}
	
}