import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest {
	/**
	 * Unassigned variables of color, shape, and gamepiece and some
	 * Predetermined variables of the types game piece, color, and shape
	 */

	Color colorTest;  
	Shape shapeTest; 
	GamePiece getColor;
	GamePiece getShape; 
	GamePiece toString; 

	Color Bat = Color.GREEN; 
	Shape Cat = Shape.THIMBLE;
	GamePiece Fat = GamePiece.BLUE_BOOT; 
	GamePiece Hat = GamePiece.YELLOW_BOOT; 
	Location Pat = Location.BALLROOM; 

	/**
	 * Tests the return of the colors using the rgb counts 
	 * Also tests an already assigned color variable
	 */
	@Test
	public void ColorTest()
	{
		colorTest = Color.BLUE;
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 255, colorTest.getB());
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 0, colorTest.getG());
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 0, colorTest.getR());

		colorTest = Color.CYAN;
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 255, colorTest.getB());
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 255, colorTest.getG());
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 0, colorTest.getR());

		colorTest = Color.GREEN;
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 0, colorTest.getB());
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 255, colorTest.getG());
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 0, colorTest.getR());

		colorTest = Color.MAGENTA;
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 255, colorTest.getB());
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 0, colorTest.getG());
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 255, colorTest.getR());

		colorTest = Color.RED;
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 0, colorTest.getB());
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 0, colorTest.getG());
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 255, colorTest.getR());

		colorTest = Color.YELLOW;
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 0, colorTest.getB());
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 255, colorTest.getG());
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 255, colorTest.getR());

		//BAT COLOR TEST
		Assert.assertEquals("Incorrect rgb value " + Bat.name(), 0, Bat.getB());
		Assert.assertEquals("Incorrect rgb value " + Bat.name(), 255, Bat.getG());
		Assert.assertEquals("Incorrect rgb value " + Bat.name(), 0, Bat.getR());
	}

	/**
	 * Tests the return of the location enums
	 */
	@Test
	public void LocationTest(){
		Assert.assertEquals("Incorrect location found", Location.BALLROOM, Location.valueOf("BALLROOM"));

		Assert.assertEquals("Incorrect location found", Location.BILLIARD_ROOM, Location.valueOf("BILLIARD_ROOM"));

		Assert.assertEquals("Incorrect location found", Location.CONSERVATORY, Location.valueOf("CONSERVATORY"));

		Assert.assertEquals("Incorrect location found", Location.DINING_ROOM, Location.valueOf("DINING_ROOM"));

		Assert.assertEquals("Incorrect location found", Location.HALL, Location.valueOf("HALL"));

		Assert.assertEquals("Incorrect location found", Location.KITCHEN, Location.valueOf("KITCHEN"));

		Assert.assertEquals("Incorrect location found", Location.LIBRARY, Location.valueOf("LIBRARY"));

		Assert.assertEquals("Incorrect location found", Location.LOUNGE, Location.valueOf("LOUNGE"));

		Assert.assertEquals("Incorrect location found", Location.STUDY, Location.valueOf("STUDY"));

		Assert.assertEquals("Incorrect location found", Pat.BALLROOM, Pat.valueOf("BALLROOM")); 
	}

	/**
	 * Tests the return of the shape class
	 */
	@Test
	public void ShapeTest(){
		shapeTest = Shape.BOOT; 
		Assert.assertEquals("Incorrect shape for " + shapeTest.name(), "boot", Shape.BOOT.toString());

		shapeTest = Shape.THIMBLE; 
		Assert.assertEquals("Incorrect shape for " + shapeTest.name(), "thimble", Shape.THIMBLE.toString()); 

		shapeTest = Shape.RACECAR; 
		Assert.assertEquals("Incorrect shape for " + shapeTest.name(), "racecar", Shape.RACECAR.toString()); 

		//Tests Cat
		Assert.assertEquals("Incorrect shape for " + Cat.name(), "thimble", Cat.toString());
	}
	/**
	 * Tests implements of the GamePiece and GamePiece appearance classes
	 * such as the getColor methods.  
	 */
	@Test
	public void getColorTest() {
		getColor = GamePiece.BLUE_BOOT; 
		Assert.assertEquals("Incorrect color for gamepiece of " + getColor.name(), Color.BLUE, GamePiece.BLUE_BOOT.getColor()); 

		getColor = GamePiece.BLUE_RACER; 
		Assert.assertEquals("Incorrect color for gamepiece of " + getColor.name(), Color.BLUE, GamePiece.BLUE_RACER.getColor()); 

		getColor = GamePiece.GREEN_BOOT; 
		Assert.assertEquals("Incorrect color for gamepiece of " + getColor.name(), Color.GREEN, GamePiece.GREEN_BOOT.getColor()); 

		getColor = GamePiece.MAGENTA_RACER; 
		Assert.assertEquals("Incorrect color for gamepiece of " + getColor.name(), Color.MAGENTA, GamePiece.MAGENTA_RACER.getColor()); 

		getColor = GamePiece.RED_RACER; 
		Assert.assertEquals("Incorrect color for gamepiece of " + getColor.name(), Color.RED, GamePiece.RED_RACER.getColor());

		getColor = GamePiece.RED_THIMBLE; 
		Assert.assertEquals("Incorrect color for gamepiece of " + getColor.name(), Color.RED, GamePiece.RED_THIMBLE.getColor());

		getColor = GamePiece.YELLOW_BOOT; 
		Assert.assertEquals("Incorrect color for gamepiece of " + getColor.name(), Color.YELLOW, GamePiece.YELLOW_BOOT.getColor());

		//Tests Fat
		Assert.assertEquals("Incorrect color for gamepiece of " + Fat.name(), Color.BLUE, Fat.getColor());

	}

	/**
	 * Tests implements of the GamePiece and GamePiece appearance classes
	 * such as the getShape methods.  
	 */
	@Test
	public void getShapeTest() {
		getShape = GamePiece.BLUE_BOOT; 
		Assert.assertEquals("Incorrect shape for gamepiece of " + getShape.name(), Shape.BOOT, GamePiece.BLUE_BOOT.getShape());

		getShape = GamePiece.BLUE_RACER; 
		Assert.assertEquals("Incorrect shape for gamepiece of " + getShape.name(), Shape.RACECAR, GamePiece.BLUE_RACER.getShape()); 

		getShape = GamePiece.GREEN_BOOT; 
		Assert.assertEquals("Incorrect shape for gamepiece of " + getShape.name(), Shape.BOOT, GamePiece.GREEN_BOOT.getShape()); 

		getShape = GamePiece.MAGENTA_RACER; 
		Assert.assertEquals("Incorrect shape for gamepiece of " + getShape.name(), Shape.RACECAR, GamePiece.MAGENTA_RACER.getShape()); 

		getShape = GamePiece.RED_RACER; 
		Assert.assertEquals("Incorrect shape for gamepiece of " + getShape.name(), Shape.RACECAR, GamePiece.RED_RACER.getShape());

		getShape = GamePiece.RED_THIMBLE; 
		Assert.assertEquals("Incorrect shape for gamepiece of " + getShape.name(), Shape.THIMBLE, GamePiece.RED_THIMBLE.getShape());

		getShape = GamePiece.YELLOW_BOOT; 
		Assert.assertEquals("Incorrect shape for gamepiece of " + getShape.name(), Shape.BOOT, GamePiece.YELLOW_BOOT.getShape()); 

		//Tests Hat
		Assert.assertEquals("Incorrect shape for gamepiece of " + Hat.name(), Shape.BOOT, Hat.getShape());

	}

	/**
	 * tests the toString method of the gamePiece class that shows the color
	 * the shape, and the priority
	 */
	@Test
	public void gamePieceToString() {
		toString = GamePiece.BLUE_BOOT; 
		Assert.assertEquals("Incorrect toString response of " + toString.name(), "BLUE_BOOT: a BLUE boot with priority 5",  toString.toString());  

		toString = GamePiece.BLUE_RACER; 
		Assert.assertEquals("Incorrect toString response of " + toString.name(), "BLUE_RACER: a BLUE racecar with priority 2",  toString.toString());  

		toString = GamePiece.GREEN_BOOT; 
		Assert.assertEquals("Incorrect toString response of " + toString.name(), "GREEN_BOOT: a GREEN boot with priority 8",  toString.toString());  

		toString = GamePiece.MAGENTA_RACER; 
		Assert.assertEquals("Incorrect toString response of " + toString.name(), "MAGENTA_RACER: a MAGENTA racecar with priority 1",  toString.toString());  

		toString = GamePiece.RED_RACER; 
		Assert.assertEquals("Incorrect toString response of " + toString.name(), "RED_RACER: a RED racecar with priority 0",  toString.toString());  

		toString = GamePiece.RED_THIMBLE; 
		Assert.assertEquals("Incorrect toString response of " + toString.name(), "RED_THIMBLE: a RED thimble with priority 10",  toString.toString());  

		toString = GamePiece.YELLOW_BOOT; 
		Assert.assertEquals("Incorrect toString response of " + toString.name(), "YELLOW_BOOT: a YELLOW boot with priority 7",  toString.toString());  
	}
/**
 * tests the move first method by using the priority assigned at the top
 * of the game piece class
 */
	@Test
	public void movesFirstTest() {

		Assert.assertEquals("Incorrect priority", GamePiece.MAGENTA_RACER, GamePiece.movesFirst(GamePiece.MAGENTA_RACER, GamePiece.YELLOW_BOOT));

		Assert.assertEquals("Incorrect priority", GamePiece.MAGENTA_RACER, GamePiece.movesFirst(GamePiece.YELLOW_BOOT, GamePiece.MAGENTA_RACER));

		Assert.assertEquals("Incorrect priority", GamePiece.MAGENTA_RACER, GamePiece.movesFirst(GamePiece.MAGENTA_RACER, GamePiece.MAGENTA_RACER));

		Assert.assertEquals("Incorrect priority", Fat.BLUE_BOOT, GamePiece.movesFirst(Fat, Hat));
	}

	/**
	 * adds players to the game and then tests to make sure that there are no
	 * players that have the same name or game piece. does not return false if 
	 * two players are at the same location, as coded
	 * also tests the return of the player's game piece
	 * and tests the name returned with an association of a gamepiece
	 *  
	 */
	@Test
	public void BoardGameTest()
	{
		BoardGame firstGame = new BoardGame(); 		

		firstGame.addPlayer("Jordan", GamePiece.RED_THIMBLE, Location.KITCHEN);
		firstGame.addPlayer("Jake", GamePiece.RED_RACER, Location.CONSERVATORY); 
		firstGame.addPlayer("Juan", GamePiece.GREEN_BOOT, Location.CONSERVATORY); 

		Assert.assertEquals(firstGame.addPlayer("Harry", GamePiece.MAGENTA_RACER, Location.LIBRARY), true);
		Assert.assertEquals(firstGame.addPlayer("Perry", GamePiece.BLUE_BOOT, Location.LIBRARY), true);
		Assert.assertEquals(firstGame.addPlayer("Perry", GamePiece.RED_THIMBLE, Location.LIBRARY), false);
		Assert.assertEquals(firstGame.addPlayer("Jerry", GamePiece.YELLOW_BOOT, Location.BALLROOM), true);
		Assert.assertEquals(firstGame.addPlayer("Jerry", GamePiece.YELLOW_BOOT, Location.LIBRARY), false);

		Assert.assertEquals(GamePiece.RED_THIMBLE, firstGame.getPlayerGamePiece("Jordan"));
		Assert.assertEquals(GamePiece.RED_RACER, firstGame.getPlayerGamePiece("Jake")); 
		Assert.assertEquals(GamePiece.GREEN_BOOT, firstGame.getPlayerGamePiece("Juan")); 

		Assert.assertEquals("Incorrect gamePiece returned", GamePiece.GREEN_BOOT, firstGame.getPlayerGamePiece("Juan"));

		Assert.assertEquals("Jordan",  firstGame.getPlayerWithGamePiece(GamePiece.RED_THIMBLE));
		Assert.assertEquals(null, firstGame.getPlayerWithGamePiece(GamePiece.BLUE_RACER));


		Assert.assertEquals(Location.KITCHEN, firstGame.getPlayersLocation("Jordan"));
		Assert.assertEquals(Location.CONSERVATORY, firstGame.getPlayersLocation("Jake"));
		Assert.assertEquals(Location.CONSERVATORY, firstGame.getPlayersLocation("Juan"));

	}

	@Test
	public void setsLocationTest() {

		BoardGame firstGame = new BoardGame();

		Set<String> players = firstGame.getPlayers(); 
		Assert.assertEquals(players, firstGame.getPlayers());
		firstGame.addPlayer("Barbie", GamePiece.MAGENTA_RACER, Location.CONSERVATORY); 
		firstGame.addPlayer("Ken", GamePiece.YELLOW_BOOT, Location.HALL); 

		Location[] locationsArray = {Location.CONSERVATORY, Location.HALL};
		List<Location> locations1 = Arrays.stream(locationsArray).collect(Collectors.toList()); 
		Set<Location> locations2 = new HashSet<Location>(locations1);  

		Assert.assertEquals(locations2, firstGame.getPlayerLocations());
	}

	@Test
	public void setGamePieceTest() {

		BoardGame firstGame = new BoardGame();

		firstGame.addPlayer("Scooby", GamePiece.BLUE_RACER, Location.KITCHEN); 
		firstGame.addPlayer("Shaggy", GamePiece.RED_RACER, Location.KITCHEN); 
		firstGame.addPlayer("Velma", GamePiece.MAGENTA_RACER, Location.BILLIARD_ROOM); 

		GamePiece[] gamePiecesArray = {GamePiece.BLUE_RACER, GamePiece.RED_RACER, GamePiece.MAGENTA_RACER};
		List<GamePiece> gamepieces1 = Arrays.stream(gamePiecesArray).collect(Collectors.toList()); 
		Set<GamePiece> gamepieces2 = new HashSet<GamePiece>(gamepieces1); 

		Assert.assertEquals(gamepieces2, firstGame.getPlayerPieces());

	}

	@Test
	public void movePlayerandTwoPlayers() {
		BoardGame firstGame = new BoardGame(); 

		firstGame.addPlayer("Fred-Flintstone", GamePiece.BLUE_BOOT, Location.LOUNGE); //5
		firstGame.addPlayer("Wilma", GamePiece.GREEN_BOOT, Location.KITCHEN); //8
		firstGame.addPlayer("Pebbles", GamePiece.YELLOW_BOOT, Location.HALL); //7

		firstGame.movePlayer("Fred-Flintstone", Location.BILLIARD_ROOM); 

		Assert.assertEquals(Location.BILLIARD_ROOM, firstGame.getPlayersLocation("Fred-Flintstone"));

		String[] playersToMoveTest1 = {"Wilma", "Pebbles"}; 
		Location[] newLocations = {Location.KITCHEN, Location.HALL}; 
		String[] playersToMoveTest2 = {"Fred-Flintstone", "Wilma"}; 

		String[] movedPlayersT1 = {"Pebbles", "Wilma"}; 
		String[] movedPlayersT2 = {"Fred-Flintstone", "Wilma"}; 

		Assert.assertEquals(movedPlayersT1, firstGame.moveTwoPlayers(playersToMoveTest1, newLocations));
		Assert.assertEquals(movedPlayersT2, firstGame.moveTwoPlayers(playersToMoveTest2, newLocations));

	}

	@Test
	public void getPlayersAtLocationTest() {
		BoardGame firstGame = new BoardGame(); 

		firstGame.addPlayer("Arthur", GamePiece.BLUE_RACER, Location.BALLROOM);
		firstGame.addPlayer("Francine", GamePiece.RED_RACER, Location.BILLIARD_ROOM); 
		firstGame.addPlayer("Buster", GamePiece.MAGENTA_RACER, Location.CONSERVATORY);
		firstGame.addPlayer("Muffy", GamePiece.GREEN_BOOT, Location.BALLROOM); 

		ArrayList<String> playersAtCertain = new ArrayList<String>();
		playersAtCertain.add("Arthur"); 
		playersAtCertain.add("Muffy"); 

		Assert.assertEquals(playersAtCertain, firstGame.getPlayersAtLocation(Location.BALLROOM));
		
		ArrayList<GamePiece> piecesAtCertain = new ArrayList<GamePiece>(); 
		piecesAtCertain.add(GamePiece.BLUE_RACER); 
		piecesAtCertain.add(GamePiece.GREEN_BOOT); 
		
		Assert.assertEquals(piecesAtCertain, firstGame.getGamePiecesAtLocation(Location.BALLROOM));
	}
}