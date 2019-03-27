/**
 * 
 * @author Jordan Lanoue
 *Enum for game pieces including color, shape, and priority
 */
public enum GamePiece {
	RED_RACER (new GamePieceAppearance(Color.RED, Shape.RACECAR), 0), 
	BLUE_RACER(new GamePieceAppearance(Color.BLUE, Shape.RACECAR), 2),
	MAGENTA_RACER (new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR), 1), 
	RED_THIMBLE (new GamePieceAppearance(Color.RED, Shape.THIMBLE), 10), 
	BLUE_BOOT (new GamePieceAppearance(Color.BLUE, Shape.BOOT), 5),
	GREEN_BOOT (new GamePieceAppearance(Color.GREEN, Shape.BOOT), 8),
	YELLOW_BOOT (new GamePieceAppearance(Color.YELLOW, Shape.BOOT), 7);


	//private instance variables 
	private GamePieceAppearance appearance; 
	private int priority;
	
	//constructor
	private GamePiece (GamePieceAppearance appearance, int priority){
		this.appearance = appearance;
		this.priority = priority; 
	}
	/**
	 * Returns the color of a gamePiece
	 * @return
	 */
	public Color getColor(){
		return appearance.getColor(); 
	}
	/**
	 * Returns the shape of a gamePiece
	 * @return
	 */
	public Shape getShape(){
		return appearance.getShape();  
	}
/**
 * Settles the priority of two different gamePieces
 * @param a
 * @param b
 * @return
 */
	public static GamePiece movesFirst(GamePiece a, GamePiece b){
		if (a.priority < b.priority)
		{
			return a; 
		}
		else 
		{
			return b;
		}
	}
/**
 * Returns the proper toString calling the appearance of color and shape and priority
 */
	public String toString() {
		return String.format("%s: a %s %s with priority %d",  name(), appearance.getColor(), appearance.getShape(), priority); 
	}
}