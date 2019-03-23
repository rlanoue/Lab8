public enum GamePiece {
	RED_RACER, BLUE_RACER, MAGENTA_RACER, RED_THIMBLE, 
	BLUE_BOOT, GREEN_BOOT, YELLOW_BOOT;

	private GamePieceAppearance appearance; 
	private int priority;

	Shape sh; 
	Color co; 

	private GamePiece() {
		return; 
	}

	private GamePiece (GamePieceAppearance appearance, int priority){
		this.appearance = appearance;
		this.priority = priority; 
	}

	public Color getColor(){
		return appearance.getColor();
	}

	public Shape getShape(){
		return appearance.getShape();
	}

	public static GamePiece movesFirst(GamePiece a, GamePiece b){
		if (a.getPriority() < b.getPriority())
		{
			return a; 
		}
		else 
		{
			return b;
		}
	}
	
	private int getPriority() {
		return priority; 
	}

	public String toString() {
		return null; 
	}
}