public enum GamePiece {
	RED_RACER (new GamePieceAppearance(Color.GREEN, Shape.BOOT), 0), 
	BLUE_RACER(new GamePieceAppearance(Color.GREEN, Shape.BOOT), 2),
	MAGENTA_RACER (new GamePieceAppearance(Color.GREEN, Shape.BOOT), 1), 
	RED_THIMBLE (new GamePieceAppearance(Color.GREEN, Shape.BOOT), 10), 
	BLUE_BOOT (new GamePieceAppearance(Color.BLUE, Shape.BOOT), 5),
	GREEN_BOOT (new GamePieceAppearance(Color.GREEN, Shape.BOOT), 8),
	YELLOW_BOOT (new GamePieceAppearance(Color.YELLOW, Shape.BOOT), 7);

	private GamePieceAppearance appearance; 
	private int priority;

	//Shape sh; 
	//Shape shapeeTRansferred; 

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
		if (a.priority < b.priority)
		{
			return a; 
		}
		else 
		{
			return b;
		}
	}

	public String toString() {
		return String.format("%s: a %s %s with priority %d",  name(), appearance.getColor(), appearance.getShape(), priority); 
	}
}