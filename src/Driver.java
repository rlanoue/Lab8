import java.util.LinkedList;
import java.util.Scanner;

public class Driver {

	//final String name = null; 
	//static Scanner input = new Scanner(System.in);

	public static void main (String[] args)
	{
		BoardGame newGame = new BoardGame(); 

		//String[] players = new String[7]; 
		newGame.addPlayer("Queen-of-Hearts", GamePiece.RED_RACER, Location.BALLROOM); 
		newGame.addPlayer("Alice", GamePiece.YELLOW_BOOT, Location.CONSERVATORY); 
		newGame.addPlayer("Mad_Hatter", GamePiece.GREEN_BOOT, Location.STUDY);
		newGame.addPlayer("Cheshire-Cat", GamePiece.MAGENTA_RACER, Location.KITCHEN); 
		
		newGame.movePlayer("Alice", Location.DINING_ROOM);

		System.out.println();
		
		System.out.println(newGame.getPlayers());
		System.out.println(newGame.getPlayerLocations());
		System.out.println(newGame.getPlayerPieces());
	}
}