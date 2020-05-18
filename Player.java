// Player class
//import Medkit;
//import EnergyDrink;

public class Player{
	
	// Attributes
	private int hp;
	private int stamina;
	private int medkits;
	private int energyDrinks;
	private int score;
	private String name;
	private Medkit med = new Medkit();
	private EnergyDrink drink = new EnergyDrink();
	private int temp = 0;
	
	// Constructor/s
	public Player(){
		
		setHp(100);
		setStamina(100);
		setEnergyDrinks(0);
		setMedkits(0);
		setScore(0);
		setName("Player");
	}
	
	public Player(String nm){
		
		setHp(100);
		setStamina(100);
		setEnergyDrinks(0);
		setMedkits(0);
		setScore(0);
		setName(nm.substring(0, 1).toUpperCase() + nm.substring(1));
	}
	
	
	// Methods
	public void incrementHp(int pts){
		
		temp = getHp() + pts;
		
		if (temp > 100){
			setHp(100);
		}
		else{
			setHp(temp);
		}
	}
	
	public void reduceHp(int pts){
		
		temp = getHp() - pts;
		
		if (temp < 0){
			setHp(0);
		}
		else{
			setHp(temp);
		}
	}
	
	public void incrementStamina(int pts){
		
		temp = getStamina() + pts;
		
		if (temp > 100){
			setStamina(100);
		}
		else{
			setStamina(temp);
		}
	}
	
	public void reduceStamina(int pts){
		
		temp = getStamina() - pts;
		
		if (temp < 0){
			setStamina(0);
		}
		else{
			setStamina(temp);
		}
	}
	
	public void useMedkit(){
		temp = getMedkits();
		
		if (temp < 1){
			System.out.println("*You don't any more medkits!*");
		}
		else{
			incrementHp(med.getHpHeal());
			incrementStamina(med.getStamHeal());
			
			temp-=1;
			setMedkits(temp);
			moved();
			System.out.println("Vitals replenished.");
		}
		
	}
	
	public void useEnergyDrink(){
		temp = getEnergyDrinks();
		
		if (temp < 1){
			System.out.println("*You don't any more energy drinks!*");
		}
		else{
			incrementHp(drink.getHpHeal());
			incrementStamina(drink.getStamHeal());
			
			temp-=1;
			setEnergyDrinks(temp);
			moved();
			System.out.println("Vitals replenished.");
		}
		
	}
	
	public void useItem(String option){
		
		if(option.equals("drink")){
			useEnergyDrink();
		}
		else if(option.equals("medkit")){
			useMedkit();
		}
		else{
			System.out.println("*Invalid Option!*");
		}
	}
	
	public boolean useHatchet(){
		//Triggers the system of fighting in Game System
		if(getStamina()==0 || getHp()==0){
			return false;
		}
		moved();
		return true;
	}
	
	public boolean advanceFloor(String stry, int kill){
		//Can only advance if all enemies on current floor have been killed
		if(kill==0 || kill==1 || kill==4 || kill==7 || kill==10){
			System.out.println(stry);
			moved();
			return true;
		}
		else{
			return false;
		}
	}
	
	public void moved(){
		score +=20;
	}
	
	public void addItem(String option){
		
		temp = 0;
		
		if(option.equals("drink")){
			temp = getEnergyDrinks() + 1;
			setEnergyDrinks(temp);
			System.out.println("Energy drink obtained.");
		}
		else if(option.equals("medkit")){
			temp = getMedkits() + 1;
			setMedkits(temp);
			System.out.println("Medkit obtained.");
		}
		else{
			System.out.println("*Invalid Option!*");
		}
	}
	
	public void takeDamage(int damage){
		
		temp = getHp() - damage;
		
		if (temp < 0){
			setHp(0);
		}
		else{
			setHp(temp);
		}
	}
	
	
	// Getters and Setters
	// HP
	public int getHp(){
		return hp;
	}
	
	public void setHp(int pts){
		hp = pts;
	}
	
	// Stamina
	public int getStamina(){
		return stamina;
	}
	
	public void setStamina(int pts){
		stamina = pts;
	}
	
	// Medkit
	public int getMedkits(){
		return medkits;
	}
	
	public void setMedkits(int num){
		medkits = num;
	}
	
	// Energy Drink
	public int getEnergyDrinks(){
		return energyDrinks;
	}
	
	public void setEnergyDrinks(int num){
		energyDrinks = num;
	}
	
	// Score
	public int getScore(){
		return score;
	}
	
	public void setScore(int scr){
		score = scr;
	}
	
	// Name
	public String getName(){
		return name;
	}

	public void setName(String nm){
		name = nm;
	}
	

	//Tetsing
	// public static void main(String[] args){

	// 	Player p = new Player("Bombo");

	// 	p.addItem("drink");
	// 	p.addItem("drink");
	// 	p.addItem("medkit");

	// 	System.out.println("\t" + p.getEnergyDrinks() + "\n" + p.getMedkits());
	// 	p.reduceHp(40);
	// 	p.reduceStamina(80);
	// 	System.out.println(p.getHp());
	// 	System.out.println(p.getStamina());

	// 	p.useItem("drink");

	// 	System.out.println(p.getHp());
	// 	System.out.println(p.getStamina());

	// 	p.takeDamage(20);

	// 	System.out.println(p.getHp());
	// 	System.out.println(p.getStamina());

	// 	p.useItem("medkit");

	// 	System.out.println(p.getHp());
	// 	System.out.println(p.getStamina());

	// 	System.out.println(p.useHatchet());
	// 	System.out.println(p.advanceFloor("fuckery", 5));
	// 	System.out.println(p.advanceFloor("pussyBack", 7));

	// 	p.reduceStamina(10);
	// 	System.out.println(p.useHatchet());
	// }
	
}