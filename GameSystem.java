
// System Class
import java.util.*;
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
	private Scanner optn = new Scanner(System.in);
	private boolean x = false;

	// Constructor

	// Methods
	public void generateEnvironment() {
		
		String op = "";
		boolean y;

		for(int i=0;i<5;i++){
			heavyEnemies.add(generateEnemy(2));
		}

		for(int i=0;i<4;i++){
			lightEnemies.add(generateEnemy(1));
		}

		tutLight.setDamageRate(10);
		tutLight.setDropRate(10);
		
		System.out.println("\nEnter a preferred name or type 'N' to proceed.");
		String name = optn.nextLine();
		if(name.equalsIgnoreCase("N")){
			player = new Player();
		}
		else{
			player = new Player(name);
		}

		sleep();
		startMessage();
		sleep();
		
		try{
			
			//ROOF ADVANCE
			while(x==false){
				x = menu.advanceMenu();
			}
			player.advanceFloor(killCount);
			deathMessage(player);
			slowType(story.getlevel0());
			sleep();


			//FOOR 1
			slowType("\nThere is a light zombie ahead.\n");
			while(!op.equalsIgnoreCase("fight")){
				op = menu.fightMenu();

				if(op.equalsIgnoreCase("drink") || op.equalsIgnoreCase("medkit")){
					player.useItem(op);
				}
			}
			y = player.useHatchet();
			if(!y){
				deathMessage(player);
			}
			matchResults(tutLight, player);
			deathMessage(player);
			slowType("\nYou can use items obtained from fighting to heal yourself.\n");


			//ADVANCE TO NEXT FLOOR
			advanceHelper();
			slowType(story.getlevel1());
			sleep();


			//FLOOR 2
			floorHelper();


			//ADVANCE TO NEXT FLOOR
			advanceHelper();
			slowType(story.getlevel2());
			sleep();


			//FLOOR 3
			floorHelper();


			//ADVANCE TO NEXT FLOOR
			advanceHelper();
			slowType(story.getlevel3());
			sleep();


			//FLOOR 4
			floorHelper();


			//ADVANCE TO NEXT FLOOR
			advanceHelper();
			slowType(story.getlevel4());
			sleep();


			// ENDGAME STORY
			slowType(story.getEnd());
			sleep();
			if(player.getScore()<260){
				slowType(story.getEndGood());
			}
			else if(player.getScore()>=260){
				slowType(story.getEndBad());
			}


			// SAVE SCORE AND EXIT
			store.writeScore(player.getName(), player.getScore());
			store.getScores();

			System.exit(0);
	
		}
		catch(Exception e){
			e.getMessage();
			e.printStackTrace();
		}
		

		optn.close();
	}

	public void advanceHelper(){
		//ADVANCE TO NEXT FLOOR
		String op = "";
		boolean y;
		while(!op.equalsIgnoreCase("adv")){
			op = menu.nextMenu();

			if(op.equalsIgnoreCase("drink") || op.equalsIgnoreCase("medkit")){
				player.useItem(op);
			}
		}
		y = player.advanceFloor(killCount);
		if(!y){
			System.exit(0);
		}
		deathMessage(player);
	}

	public void floorHelper(){
		//FLOOR PLAY
		for(int i=0;i<3;i++){
			Random ran = new Random();
			String op = "";
			boolean y;			
			if(ran.nextInt(2)==0){
				if(!lightEnemies.isEmpty()){
					Enemy enemy = lightEnemies.get(0);

					slowType("\nThere is a light zombie ahead.\n");
					while(!op.equalsIgnoreCase("fight")){
						op = menu.fightMenu();

						if(op.equalsIgnoreCase("drink") || op.equalsIgnoreCase("medkit")){
							player.useItem(op);
						}
					}
					y = player.useHatchet();
					if(!y){
						deathMessage(player);
					}
					matchResults(enemy, player);
					deathMessage(player);

					lightEnemies.remove(0);
				}
				else{
					Enemy enemy2 = heavyEnemies.get(0);

					slowType("\nThere is a heavy zombie ahead.\n");
					while(!op.equalsIgnoreCase("fight")){
						op = menu.fightMenu();

						if(op.equalsIgnoreCase("drink") || op.equalsIgnoreCase("medkit")){
							player.useItem(op);
						}
					}
					y = player.useHatchet();
					if(!y){
						deathMessage(player);
					}
					matchResults(enemy2, player);
					deathMessage(player);

					heavyEnemies.remove(0);
				}
			}
			else{
				if(!heavyEnemies.isEmpty()){
					Enemy enemy2 = heavyEnemies.get(0);

					slowType("\nThere is a heavy zombie ahead.\n");
					while(!op.equalsIgnoreCase("fight")){
						op = menu.fightMenu();

						if(op.equalsIgnoreCase("drink") || op.equalsIgnoreCase("medkit")){
							player.useItem(op);
						}
					}
					y = player.useHatchet();
					if(!y){
						deathMessage(player);
					}
					matchResults(enemy2, player);
					deathMessage(player);

					heavyEnemies.remove(0);

				}
				else{
					Enemy enemy = lightEnemies.get(0);

					slowType("\nThere is a light zombie ahead.\n");
					while(!op.equalsIgnoreCase("fight")){
						op = menu.fightMenu();

						if(op.equalsIgnoreCase("drink") || op.equalsIgnoreCase("medkit")){
							player.useItem(op);
						}
					}
					y = player.useHatchet();
					if(!y){
						deathMessage(player);
					}
					matchResults(enemy, player);
					deathMessage(player);

					lightEnemies.remove(0);
				}
			}
		}
	}

	public Enemy generateEnemy(int option) {
		if (option == 1) {
			return generateLightEnemy();
		} 
		else {
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
		

		slowType("\nWelcome to the Game " + player.getName());
		slowType("\nYou will start with 100:HP and 100:Stamina.");
		slowType("\nYou will progressively lose 10:stamina with each option choice.");
		slowType("\nPLAN YOUR MOVES CAREFULLY TO REDUCE UNNECESSARY NAVIGATION.");
		slowType("\nYou can press 'Ctrl + C' to quit at any time.\n\n");
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
		slowType("\nOtherwise there isn't anything interesting here.\n");
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
					Thread.sleep(55);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}

	}

	public void matchResults(Enemy en, Player ply){

		slowType("\nYou faught the " + en.getName() + " enemy.");

		if(en.inflictDamage(ply)){
			slowType("\nYou took " + en.getDamageHp() + ":damage, you now have " + ply.getHp() + ":HP and " 
			+ ply.getStamina() + ":Stamina left.");
		}
		else{
			slowType("\nYou didn't take any damage");
		}


		if(en.dropItem()){
			slowType("\nYou obtained an item.\n");
			ply.addItem(en.getItemType());
		}
		else{
			slowType("\nThe zombie did not drop anything.\n");
		}
		
	}

	public boolean checkHealth(Player ply){
		
		if(ply.getHp()==0 || ply.getStamina()==0){
			return false;
		}
		return true;
	}

	public void deathMessage(Player ply){

		if(ply.getHp()==0){
			slowType("\n*******************************************************************\n"
            + "*******************************************************************\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t GAME OVER \t\t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t You died from an infection. \t\t\t\t***\n" 
            + "***\t\t\t\t\t\t\t\t***\n"
            + "*******************************************************************\n"
			+ "*******************************************************************\n\n");
			store.writeScore(ply.getName(), ply.getScore());
			store.getScores();

			System.exit(0);
		}
		else if(ply.getStamina()==0){
			slowType("\n*******************************************************************\n"
            + "*******************************************************************\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t GAME OVER \t\t\t\t\t\t***\n"
            + "***\t\t\t\t\t\t\t\t***\n"
            + "***\t You died from extreme exhaustion. \t\t\t***\n" 
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

		GameSystem cVirus = new GameSystem();
		cVirus.generateEnvironment();
		
	}
	
}