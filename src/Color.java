/**
 * an enum of the type of color
 */
public enum Color{
	RED (255, 0, 0), GREEN (0, 255, 0), BLUE (0, 0, 255), YELLOW (255, 255, 0), CYAN (0, 255, 255), MAGENTA (255, 0, 255);

	/**
	 * private variables to be returned later in the Get methods
	 */
	private int r; 
	private int g; 
	private int b;	

	/**
	 * empty constructor
	 */
	private Color(){
		return;				// Wrong Constructor being used
	}

	/**
	 * 
	 * Configured constructor with the private variables
	 */
	private Color (int r, int g, int b){
		this.r = r;
		this.g = g; 
		this.b = b; 
	}
/**
 * returns the red component of a color - for red it would be 255 which is the 
 * max while blue would return 0 as it has no red in its mixture of color but
 * magenta would return a value between 0 and 255 of red as well as a return
 * from green or blue  
 * 
 */
	public int getR(){
		return r; 
	}

	/**
	 * returns the green component of a color 
	 */
	public int getG(){
		return g;
	}

	/**
	 * returns the blue component of a color 
	 */
	public int getB(){
		return b;
	}
}