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
		setDamageThreshold(6);
		setDropThreshold(4);
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
		
		if (getDamageRate() > getDamageThreshold())
		{
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

	// 	LightEnemy l1 = new LightEnemy();

	// 	System.out.println(l1.dropItem());
	// 	System.out.println(l1.getDamageHp());
	// 	System.out.println(l1.getDamageRate());
	// 	System.out.println(l1.getDamageThreshold());
	// 	System.out.println(l1.getDropRate());
	// 	System.out.println(l1.getDropThreshold());
	// 	System.out.println(l1.getItemType());
	// 	System.out.println(l1.getName());
		
	// 	LightEnemy l2 = new LightEnemy();

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