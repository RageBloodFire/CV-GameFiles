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
		setName(nm.substring(0, 1).toUpperCase() + nm.substring(1).toLowerCase());
	}
	
	
	// Methods
	public void incrementHp(int pts){
		int inc = 0;
		inc = getHp() + pts;
		
		if (inc > 100){
			setHp(100);
		}
		else{
			setHp(inc);
		}
	}
	
	public void reduceHp(int pts){
		int re = 0;
		re = getHp() - pts;
		
		if (re < 0){
			setHp(0);
		}
		else{
			setHp(re);
		}
	}
	
	public void incrementStamina(int pts){
		int in = 0;
		in = getStamina() + pts;
		
		if (in > 100){
			setStamina(100);
		}
		else{
			setStamina(in);
		}
	}
	
	public void reduceStamina(int pts){
		int st = 0;
		st = getStamina() - pts;
		
		if (st < 0){
			setStamina(0);
		}
		else{
			setStamina(st);
		}
	}
	
	public void useMedkit(){
		int t = 0;
		t = getMedkits();
		
		if (t < 1){
			System.out.println("\n*You don't any more medkits!*");
		}
		else if(t >= 1){
			moved();
			incrementHp(med.getHpHeal());
			incrementStamina(med.getStamHeal());
			
			t--;
			setMedkits(t);
			System.out.println("\nVitals replenished.");
			System.out.println(getHp() + ":HP\t" + getStamina() + ":Stamina");
		}
		
	}
	
	public void useEnergyDrink(){
		int t = 0;
		t = getEnergyDrinks();
		
		if (t < 1){
			System.out.println("\n*You don't any more energy drinks!*");
		}
		else if(t >= 1){
			moved();
			incrementHp(drink.getHpHeal());
			incrementStamina(drink.getStamHeal());
			
			t--;
			setEnergyDrinks(t);
			System.out.println("\nVitals replenished.");
			System.out.println(getHp() + ":HP\t" + getStamina() + ":Stamina");
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
			System.out.println("\n*Invalid Option!*");
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
	
	public boolean advanceFloor(int kill){
		//Can only advance if all enemies on current floor have been killed
		if(kill==0 || kill==1 || kill==4 || kill==7 || kill==10){
			moved();
			return true;
		}
		else{
			System.out.println("\nSomething isn't right.");
			return false;
		}
	}
	
	public void moved(){
		reduceStamina(10);
		score +=20;
	}
	
	public void addItem(String option){
		
		temp = 0;
		
		if(option.equals("drink")){
			temp = getEnergyDrinks() + 1;
			setEnergyDrinks(temp);
			System.out.println("\nEnergy drink obtained.");
		}
		else if(option.equals("medkit")){
			temp = getMedkits() + 1;
			setMedkits(temp);
			System.out.println("\nMedkit obtained.");
		}
		else{
			System.out.println("\n*Something isn't right.*");
		}
	}
	
	public void takeDamage(int damage){
		int take = 0;
		take = getHp() - damage;
		
		if (take < 0){
			moved();
			setHp(0);
		}
		else{
			moved();
			setHp(take);
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