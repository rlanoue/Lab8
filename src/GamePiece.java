public enum GamePiece {
	RED_RACER, BLUE_RACER, MAGENTA_RACER, RED_THIMBLE, 
	BLUE_BOOT, GREEN_BOOT, YELLOW_BOOT;

	private GamePieceAppearance appearance; 
	private int priority;

	//Shape sh; 
	Shape shapeeTRansferred; 

	private GamePiece() {
		return; 
	}

	private GamePiece (GamePieceAppearance appearance, int priority){
		this.appearance = appearance;
		this.priority = priority; 
	}

	public Color getColor(){
		if inputpost = RACER
				if inputpre switches for colors
				else if = BOOT
					if switches for colors
					else
						swictches for colors
						
		switch(this) {
		case THIMBLE : return RED;
		case BOOT : return "Boot";
		case RACECAR : return "Race Car";  
		default : return "Error";
		return appearance.getColor(); 
	}

	public Shape getShape(){
		return ((Enum<Shape>) appearance).valueOf(shapeeTRansferred, "BOOT"); 
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
	
	public int getPriority() {
		return priority; 
	}

	public String toString() {
		return null; 
	}
}