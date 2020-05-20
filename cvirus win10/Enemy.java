// Enemy class

public class Enemy{
	
	private int dropThreshold;
	private int damageThreshold;
	private int damageRate;
	private int dropRate;
	private int damageHp;
	private String name;
	private String itemType;
	
	
	// Methods
	public boolean dropItem(){
		
		if (getDropRate() > getDropThreshold()){
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
	public int getDropThreshold() {
		return this.dropThreshold;
	}

	public void setDropThreshold(int dropThreshold) {
		this.dropThreshold = dropThreshold;
	}

	public int getDamageThreshold() {
		return this.damageThreshold;
	}

	public void setDamageThreshold(int damageThreshold) {
		this.damageThreshold = damageThreshold;
	}

	public int getDamageRate() {
		return this.damageRate;
	}

	public void setDamageRate(int damageRate) {
		this.damageRate = damageRate;
	}

	public int getDropRate() {
		return this.dropRate;
	}

	public void setDropRate(int dropRate) {
		this.dropRate = dropRate;
	}

	public int getDamageHp() {
		return this.damageHp;
	}

	public void setDamageHp(int damageHp) {
		this.damageHp = damageHp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	
	
}