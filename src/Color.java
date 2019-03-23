enum ColorE{
	RED, GREEN, BLUE, YELLOW, CYAN, MAGENTA;
}

public class Color{
	
	public int r; 
	private int g; 
	private int b;	

	private Color (int r, int g, int b){
		this.r = r;
		this.g = g; 
		this.b = b; 
	}

	public int getR(){
		return r; 
	}

	public int getG(){
		return g;
	}

	public int getB(){
		return b;
	}
}