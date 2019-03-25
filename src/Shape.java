/**
 * 
 * An enum of type shapes
 *
 */
public enum Shape {
	THIMBLE, BOOT, RACECAR;

	/**
	 * Overriden toString of the enum class made with a switch to return specific of the shape type
	 */
	@Override
	public String toString(){
		switch(this) {
		case THIMBLE : return "Thimble";
		case BOOT : return "Boot";
		case RACECAR : return "Race Car";  
		default : return "Error";					//NEED TO TEST DEFAULT CASE
		}
	}
}

