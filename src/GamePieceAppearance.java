public class GamePieceAppearance {

	/**
	 *Private Variables that call on the class enums of color and shape to be applied into the constructor
	 */
	private Color color; 
	private Shape shape; 
	
	/**
	 * Constructor using now local variables
	 */
	public GamePieceAppearance(Color color, Shape shape){
		this.color = color; 
		this.shape = shape; 
	}
	
	/**
	 * method to return the shape of an object
	 */
	public Shape getShape(){
		return shape; 
	}

	/**
	 * method to return the color of an object
	 */
	public Color getColor() {
		return color; 
	}
}
