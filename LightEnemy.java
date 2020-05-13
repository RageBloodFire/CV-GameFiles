// Light Enemy class which extends Enemy class
import java.util.*;

public class LightEnemy extends Enemy{
	
	private int dropThreshold;
	private int damageThreshold;
	private int damageRate;
	private int dropRate;
	private int damageHp;
	private String name;
	private String itemType;
	
	
	// Constructor
	public LightEnemy(){
		Random rand = new Random();
		
		setName("Light");
		setItemType("drink");
		setDamageHp(30);
		setDamageThreshold(4);
		setDropThreshold(4);
		setDamageRate( rand.nextInt(10) );
		setDropRate( rand.nextInt(10) );
	}
	
	
	// Methods
	public boolean dropItem(){
		
		if (getDropRate() > getDropThreshold()){
			return true;
		}
		
		return false;
	}
	
	public void inflictDamage(Player player){
		
		if (getDamageRate() > getDamageThreshold())
		{
			player.takeDamage(getDamageHp());
		}
		
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