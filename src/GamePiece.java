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
		if (a.Priority < b.getPriority())
		{
			return a; 
		}
		else 
		{
			return b;
		}
	}
	private int getPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	public abstract String toString();
}