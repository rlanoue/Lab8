/**
 * 
 * An enum of type shapes
 *
 */
public enum Shape {
	THIMBLE, BOOT, RACECAR;

	/**
	 * Overriden toString of the enum class with returning the name set to be only lowercase
	 */
	@Override
	public String toString(){
		
		return this.name().toLowerCase(); 
	
}
}
