
// System Class
import java.util.*;
//import java.util.concurrent.TimeUnit;
//import LightEnemy;
//import HeavyEnemy;
//import Player;

public class GameSystem {

	// Attributes
	private ArrayList<Enemy> lightEnemies = new ArrayList<Enemy>();
	private ArrayList<Enemy> heavyEnemies = new ArrayList<Enemy>();
	private LightEnemy tutLight = new LightEnemy();
	private LightEnemy lightEnemy;
	private HeavyEnemy heavyEnemy;
	private Player player;
	private Story story = new Story();
	private Storage store = new Storage();
	private Menu menu = new Menu();
	private int score = 0;
	private int floorCount = 0;
	private int killCount = 0;

	// Constructor

	// Methods
	public void generateEnvironment() {
		
		for(int i=0;i<5;i++){
			heavyEnemies.add(generateEnemy(2));
		}

		for(int i=0;i<4;i++){
			lightEnemies.add(generateEnemy(1));
		}

		tutLight.setDamageRate(10);
		tutLight.setDropRate(10);
	}

	public Enemy generateEnemy(int option) {
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


	public void startMessage() {
		String message = "***********************\t C-Virus\t***************************\n"
				+ "***********************\t   Game \t***************************\n" 
				+ "***\t\t\t\t\t\t\t\t***\n"
				+ "***\t It's the year 2023 and there has been a \t\t***\n"
				+ "***\t a pandemic outbreak scientists call The C-Virus. \t***\n"
				+ "***\t It began in Thania to the East where it quickly \t***\n"
				+ "***\t spread via physical contact or bodily fluids. \t\t***\n"
				+ "***\t The specific cause of the virus is still unknown, \t***\n"
				+ "***\t but one thing is for sure, a mutation is in \t\t***\n"
				+ "***\t the virus's genetic structure that is turning \t\t***\n"
				+ "***\t the infected into crazed, flesh-eating zombies. \t***\n" 
				+ "***\t\t\t\t\t\t\t\t***\n"
				+ "***\t You're a 20 year old male named Kim. You were \t\t***\n"
				+ "***\t searching a hotel complex for supplies. When \t\t***\n"
				+ "***\t you got to the roof of the building, you looked \t***\n"
				+ "***\t over the edge and saw a horde of zombies attacking \t***\n"
				+ "***\t your company on the ground floor. The zombies start \t***\n"
				+ "***\t to flood the building. You must fight your way out \t***\n"
				+ "***\t and return to the Safe House 2 blocks away! \t\t***\n" + "***\t\t\t\t\t\t\t\t***\n"
				+ "*******************************************************************\n"
				+ "*******************************************************************\n\n";
		

		slowType("\nWelcome to the Game " + player.getName() + "\n" + "You can press 'Ctrl + C' to quit at any time.\n\n");
		sleep();

		slowType(message);

		slowType("GENERATING GAME ENVIRONMENT");
		sleep();
		System.out.print(".");
		sleep();
		System.out.print(".");
		sleep();
		System.out.print(".");

		slowType("\n\nYou're on the roof.");
		sleep();
		slowType("\nYou found a hatchet you can use as a weapon.");
		sleep();
		slowType("\nOtherwise there isn't anything interesting here.");
	}
	
	public static void slowType(String message){

		char[] chars = message.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '*') {
				System.out.print(chars[i]);
				try {
					Thread.sleep(0);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			} else {
				System.out.print(chars[i]);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}

	}

	public void matchResults(Enemy en, Player ply){

		System.out.println("\tYou just faught the " + en.getName() + "enemy.");

		if(en.dropItem() && en.inflictDamage(ply)){
			System.out.println("\t You took " + en.getDamageHp() + "damage, you now have " + ply.getHp() + "HP and " 
			+ ply.getStamina() + " Stamina left.");
			System.out.println("\t You obtained an item: " + en.getItemType());
		}
		else if(!en.dropItem() && en.inflictDamage(ply)){
			System.out.println("\t You took " + en.getDamageHp() + "damage, you now have " + ply.getHp() + "HP and " 
			+ ply.getStamina() + " Stamina left.");
			System.out.println("\t The zombie did not drop anything.");
		}
		else if(en.dropItem() && !en.inflictDamage(ply)){
			System.out.println("\t You didn't take any damage");
			System.out.println("\t You obtained an item: " + en.getItemType());
		}
		else{
			System.out.println("\t You didn't take any damage");
			System.out.println("\t The zombie did not drop anything.");
		}
		
	}

	public boolean checkHealth(Player ply){
		
		if(ply.getHp()==0 || ply.getStamina()==0){
			return false;
		}
		return true;
	}

	public void deathMessage(Player ply){

		if(!checkHealth(ply) && ply.getHp()==0){
			System.out.println("*******************************************************************\n"
            + "*******************************************************************\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t GAME OVER \t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t You died from an infection. \t\t\t\t***\n" 
            + "***\t\t\t\t\t\t\t\t***\n"
            + "*******************************************************************\n"
			+ "*******************************************************************\n\n");
			store.writeScore(ply.getName(), ply.getScore());
			store.getScores();

			System.exit(0);
		}
		else if(!checkHealth(ply) && ply.getStamina()==0){
			System.out.println("*******************************************************************\n"
            + "*******************************************************************\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t GAME OVER \t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t You died from extreme exhaustion. \t\t\t\t***\n" 
            + "***\t\t\t\t\t\t\t\t***\n"
            + "*******************************************************************\n"
			+ "*******************************************************************\n\n");
			store.writeScore(ply.getName(), ply.getScore());
			store.getScores();

			System.exit(0);
		}
	}

	public static void sleep(){
		try        
			{
				Thread.sleep(1500);
			} 
		catch(InterruptedException ex) 
			{
				Thread.currentThread().interrupt();
			}
	}
	

	// Getters and Setters
	public ArrayList<Enemy> getLightEnemies(){
		return lightEnemies;
	}
	
	public void setLightEnemies(LightEnemy[] arr){}
	
	public ArrayList<Enemy> getHeavyEnemies(){
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
		Scanner optn = new Scanner(System.in);
		GameSystem cVirus = new GameSystem();
		boolean x = false;
	
		
		System.out.println("\nEnter a preferred name or type 'N' to proceed.");
		String name = optn.nextLine();
		if(name.equalsIgnoreCase("N")){
			cVirus.player = new Player();
		}
		else{
			cVirus.player = new Player(name);
		}

		sleep();
		cVirus.startMessage();
		sleep();

		while(x=false){
			x = cVirus.menu.advanceMenu();
		}

		

		optn.close();
	}
	
}