public enum Shape {
	THIMBLE, BOOT, RACECAR;

	//@Override
	public String toString(){
		switch(this) {
		case THIMBLE : return "Thimble";
		case BOOT : return "Boot";
		case RACECAR : return "Race Car";  
		default : return "Error";					//NEED TO TEST DEFAULT CASE
		}
	}
}

