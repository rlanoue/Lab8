
public class GamePiece {

	public enum gamePiece {
		RED_RACER, BLUE_RACER, MAGENTA_RACER, RED_THIMBLE, 
		BLUE_BOOT, GREEN_BOOT, YELLOW_BOOT
	}
	
	private GamePieceAppearance appearance; 
	private int priority; 
	
	private GamePiece (GamePieceAppearance appearance, int priority)
	{
		this.appearance = appearance;
		this.priority = priority; 
	}
	
	public Color getColor()
	{
		GamePieceAppearance.getColor();
	}
	
	public Shape getShape()
	{
		GamePieceAppearance.getShape();
	}
	
	public GamePiece movesFirst(GamePiece a, GamePiece b)
	{
		if (a.getPriority < b.getPriority)
		{
			return b; 
		}
		else 
		{
			return a;
		}
	}
	public String toString()
	{
		
	}
}
