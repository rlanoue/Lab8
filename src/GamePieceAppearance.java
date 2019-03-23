
public class GamePieceAppearance extends Color extends Shape  {

	private Color color; 
	private Shape shape; 
	
	public GamePieceAppearance(Color color, Shape shape)
	{
		this.color = color; 
		this.shape = shape; 
	}
	
	public Color getColor()
	{
		return color; 
	}
	
	public Shape getShape()
	{
		return shape; 
	}
}
