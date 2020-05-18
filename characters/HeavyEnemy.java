// Heavy Enemy class which extends Enemy class
package cvirus.characters;

import java.util.*;

public class HeavyEnemy extends Enemy{
	
	private int dropThreshold;
	private int damageThreshold;
	private int damageRate;
	private int dropRate;
	private int damageHp;
	private String name;
	private String itemType;
	
	
	// Constructor
	public HeavyEnemy(){
		Random rand = new Random();
      
		setName("Heavy");
		setItemType("medkit");
		setDamageHp(60);
		setDamageThreshold(5);
		setDropThreshold(7);
		setDamageRate( rand.nextInt(10) );
		setDropRate( rand.nextInt(10) );
	}
	
	
	// Methods
	public boolean dropItem(){
		
		if (getDropRate() >= getDropThreshold()){
			return true;
		}
		
		return false;
	}
	
	public boolean inflictDamage(Player player){
		
		if (getDamageRate() > getDamageThreshold()){
			player.takeDamage(getDamageHp());
			return true;
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


	//Testing
	// public static void main(String[] args){

	// 	HeavyEnemy l1 = new HeavyEnemy();

	// 	System.out.println(l1.dropItem());
	// 	System.out.println(l1.getDamageHp());
	// 	System.out.println(l1.getDamageRate());
	// 	System.out.println(l1.getDamageThreshold());
	// 	System.out.println(l1.getDropRate());
	// 	System.out.println(l1.getDropThreshold());
	// 	System.out.println(l1.getItemType());
	// 	System.out.println(l1.getName());
		
	// 	HeavyEnemy l2 = new HeavyEnemy();

	// 	System.out.println(l2.dropItem());
	// 	System.out.println(l2.getDamageHp());
	// 	System.out.println(l2.getDamageRate());
	// 	System.out.println(l2.getDamageThreshold());
	// 	System.out.println(l2.getDropRate());
	// 	System.out.println(l2.getDropThreshold());
	// 	System.out.println(l2.getItemType());
	// 	System.out.println(l2.getName());

	// }
	
}
