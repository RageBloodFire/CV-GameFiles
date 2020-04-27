// Light Enemy class which implements Enemy class
import java.util.*;

public class LightEnemy implements Enemy{
	
	private int dropThreshold;
	private int damageThreshold;
	private int damageRate;
	private int dropRate;
	private int damageHp;
	private String name;
	private String itemType;
	
	
	// Constructor
	public void LightEnemy(String nm){
		
		setName(nm);
		setItemType("drink");
		setDamageHp(30);
		setDamageThreshold(4);
		setDropThreshold(4);
		setDamageRate( /*random integer between 1 and 10*/ );
		setDropRate( /*random integer between 1 and 10*/ );
	}
	
	
	// Methods
	public boolean dropItem(){
		
		if (getDropRate() > getDropThreshold){
			return true;
		}
		
		return false;
	}
	
	public void inflictDamage(Player player){
		
		if (getDamageRate() > getDamageThreshold){
			player.takeDamage(get)
		}
		
		return false;
	}
	
	
	
	// Getters/Setters
	
	
	
}