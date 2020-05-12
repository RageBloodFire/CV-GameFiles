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
		setDamageRate( random.nextInt(10) );
		setDropRate( random.nextInt(10) );
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
	public int getDropThreshold(){
		return dropThreshold;
	}
	
	public void setDropThreshold(int dp){
		dropThreshold = dp;
	}
	
	public int getDamageThreshold(){
		return damageThreshold;
	}
	
	public void setDamageThreshold(int dm){
		damageThreshold = dm;
	}
	
	public int getDamageRate(){
		return damageRate;
	}
	
	public void setDamageRate(int dmr){
		damageRate = dmr;
	}
	
	public int getDropRate(){
		return dropRate;
	}
	
	public void setDropRate(int drp){
		dropRate = drp;
	}
	
	public int getDamageHp(){
		return damageHp;
	}
	
	public void setDamageHp(int dhp){
		damageHp = dhp;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String nm){
		name = nm;
	}
	
	public String getItemType(){
		return itemType;
	}
	
	public void setItemType(String it){
		itemType = it;
	}
	
	
}