// Medkit class

public class Medkit{
	
	private int hpHeal;
	private int stamHeal;
	
	
	// Contructor
	public void Medkit(){
		
		setHpHeal(80);
		setStamHeal(30);
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