
// System Class
import java.util.*;
import java.io.FileReader;
import java.io.*;
//import LightEnemy;
//import HeavyEnemy;
//import Player;

public class GameSystem {

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
	public void generateEnvironment(Player player) {

	}

	public Object generateEnemy(int option) {
		if (option == 1) {
			return generateLightEnemy();
		} else {
			return generateHeavyEnemy();
		}
	}

	public LightEnemy generateLightEnemy() {
		lightEnemy = new LightEnemy();
		return lightEnemy;
	}

	public HeavyEnemy generateHeavyEnemy() {
		heavyEnemy = new HeavyEnemy();
		return heavyEnemy;
	}

	// public void startMessage() {
	// System.out.println("***********************\t
	// C-Virus\t***************************");
	// System.out.println("***********************\t Game
	// \t***************************");
	// System.out.println("***\t\t\t\t\t\t\t\t***");
	// System.out.println("***\t It's the year 2023 and there has been a \t\t***");
	// System.out.println("***\t a pandemic outbreak scientists call The C-Virus.
	// \t***");
	// System.out.println("***\t It began in Thania to the East where it quickly
	// \t***");
	// System.out.println("***\t spread via physical contact or bodily fluids.
	// \t\t***");
	// System.out.println("***\t The specific cause of the virus is still unknown,
	// \t***");
	// System.out.println("***\t but one thing is for sure, a mutation is \t\t***");
	// System.out.println("***\t the virus’s genetic structure that turns \t\t***");
	// System.out.println("***\t the infected into crazed, flesh-eating zombies.
	// \t***");
	// System.out.println("***\t\t\t\t\t\t\t\t***");
	// System.out.println("***\t You’re a 20 year old male named Kim. You were
	// \t\t***");
	// System.out.println("***\t searching a hotel complex for supplies. When
	// \t\t***");
	// System.out.println("***\t you got to the roof of the building, you looked
	// \t***");
	// System.out.println("***\t over the edge and saw a horde of zombies attacking
	// \t***");
	// System.out.println("***\t your company on the ground floor. The zombies start
	// \t***");
	// System.out.println("***\t to enter the building. You must fight your way out
	// \t***");
	// System.out.println("***\t and return to the Safe House 2 blocks away!
	// \t\t***");
	// System.out.println("***\t\t\t\t\t\t\t\t***");
	// System.out.println("*******************************************************************");
	// System.out.println("*******************************************************************");
	// }

	public void startMessage() {
		String message = "***********************\t C-Virus\t***************************\n"
				+ "***********************\t   Game \t***************************\n" 
				+ "***\t\t\t\t\t\t\t\t***\n"
				+ "***\t It's the year 2023 and there has been a \t\t***\n"
				+ "***\t a pandemic outbreak scientists call The C-Virus. \t***\n"
				+ "***\t It began in Thania to the East where it quickly \t***\n"
				+ "***\t spread via physical contact or bodily fluids. \t\t***\n"
				+ "***\t The specific cause of the virus is still unknown, \t***\n"
				+ "***\t but one thing is for sure, a mutation is \t\t***\n"
				+ "***\t the virus’s genetic structure that turns \t\t***\n"
				+ "***\t the infected into crazed, flesh-eating zombies. \t***\n" 
				+ "***\t\t\t\t\t\t\t\t***\n"
				+ "***\t You’re a 20 year old male named Kim. You were \t\t***\n"
				+ "***\t searching a hotel complex for supplies. When \t\t***\n"
				+ "***\t you got to the roof of the building, you looked \t***\n"
				+ "***\t over the edge and saw a horde of zombies attacking \t***\n"
				+ "***\t your company on the ground floor. The zombies start \t***\n"
				+ "***\t to enter the building. You must fight  your way out \t***\n"
				+ "***\t and return to the Safe House 2 blocks away! \t\t***\n" + "***\t\t\t\t\t\t\t\t***\n"
				+ "*******************************************************************\n"
				+ "*******************************************************************\n\n";

		char[] chars = message.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '*') {
				System.out.print(chars[i]);
				try {
					Thread.sleep(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.print(chars[i]);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	// Getters and Setters
	public LightEnemy[] getLightEnemies(){
		return lightEnemies;
	}
	
	public void setLightEnemies(LightEnemy[] arr){}
	
	public HeavyEnemy[] getHeavyEnemies(){
		return heavyEnemies;
	}
	
	public void setHeavyEnemies(HeavyEnemy[] arr){}
	
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
	public static void main(String[] args){

		// Variables
		Player p1;
		Scanner optn = new Scanner(System.in);
		GameSystem cVirus = new GameSystem();


		
		cVirus.startMessage();
		
		System.out.println("Enter a preferred name or type 'N' to proceed.");
		String name = optn.nextLine();
		if(name.equalsIgnoreCase("N")){
			p1 = new Player();
		}
		else{
			p1 = new Player(name);
		}

		System.out.println(p1.getStamina());
		System.out.println("Hello " + p1.getName());
	}
	
}