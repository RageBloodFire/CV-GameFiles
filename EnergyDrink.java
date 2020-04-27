// Energy Drink class

public class EnergyDrink{
	
	private int hpHeal;
	private int stamHeal;
	
	
	// Contructor
	public void EnergyDrink(){
		
		setHpHeal( /*amount*/ );
		setStamHeal( /*amount*/ );
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