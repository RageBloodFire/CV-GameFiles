// Energy Drink class
package cvirus.items;

public class EnergyDrink{
	
	private int hpHeal;
	private int stamHeal;
	
	
	// Contructor
	public EnergyDrink(){
		
		setHpHeal(20);
		setStamHeal(80);
	}
	
	
	// Getters/Setters
	public int getHpHeal(){
		
		return hpHeal;
	}
	
	public void setHpHeal(int amt){
		
		hpHeal = amt;	
	}
	
	public int getStamHeal(){
		
		return stamHeal;
	}
	
	public void setStamHeal(int amt){
		
		stamHeal = amt;
	}
	
	
}
