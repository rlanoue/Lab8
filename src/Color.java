
public class Color {

	private int r; 
	private int g; 
	private int b; 

	public enum color
	{
		RED, GREEN, BLUE, YELLOW, CYAN, MAGENTA 
	}

	private Color (int r, int g, int b)
	{
		this.r = r; 
		this.g = g; 
		this.b = b; 
	}
	
	public int getR()
	{
		return .get(r); 
	}
	
	public int getG()
	{
		return .get(g);
	}
	
	public int getB()
	{
		return .get(b);
	}
}
