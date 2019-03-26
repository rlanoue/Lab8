import java.util.Set;

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

	@Test
	public void movesFirstTest() {

		Assert.assertEquals("Incorrect priority", GamePiece.MAGENTA_RACER, GamePiece.movesFirst(GamePiece.MAGENTA_RACER, GamePiece.YELLOW_BOOT));

		Assert.assertEquals("Incorrect priority", GamePiece.MAGENTA_RACER, GamePiece.movesFirst(GamePiece.YELLOW_BOOT, GamePiece.MAGENTA_RACER));

		Assert.assertEquals("Incorrect priority", GamePiece.MAGENTA_RACER, GamePiece.movesFirst(GamePiece.MAGENTA_RACER, GamePiece.MAGENTA_RACER));

		Assert.assertEquals("Incorrect priority", Fat.BLUE_BOOT, GamePiece.movesFirst(Fat, Hat));
	}

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
		Assert.assertEquals(firstGame.addPlayer("Larry", GamePiece.YELLOW_BOOT, Location.LIBRARY), false);


		Assert.assertEquals("Incorrect name returned", GamePiece.RED_THIMBLE, firstGame.getPlayerGamePiece("Jordan"));
		Assert.assertEquals("Incorrect name returned", GamePiece.RED_RACER, firstGame.getPlayerGamePiece("Jake")); 
		Assert.assertEquals("Incorrect name returned", GamePiece.GREEN_BOOT, firstGame.getPlayerGamePiece("Juan")); 

		//Assert.assertEquals("Incorrect gamePiece returned", GamePiece.GREEN_BOOT.toString(), firstGame.getPlayerWithGamePiece(GamePiece.GREEN_BOOT));
		
		//Assert.assertEquals(firstGame.moveTwoPlayers(moveTwoPlayers, newLocations)); //(GamePiece.MAGENTA_RACER,GamePiece.GREEN_BOOT));
	
		Assert.assertEquals(Location.KITCHEN, firstGame.getPlayersLocation("Jordan"));
		Assert.assertEquals(Location.CONSERVATORY, firstGame.getPlayersLocation("Jake"));
		Assert.assertEquals(Location.CONSERVATORY, firstGame.getPlayersLocation("Juan"));
		
		Set<String> players = firstGame.getPlayers(); 
		Assert.assertEquals(players, firstGame.getPlayers());
	
		Location[] locations2 = new Location[3] ;//{KITCHEN, CONSERVATORY, DINING_ROOM, BALLROOM, STUDY, HALL, LOUNGE, LIBRARY, BILLIARD_ROOM}; 
		
		
		Set<Location> locations = firstGame.getPlayerLocations(); 
		for(int i = 0; i < locations2.length; i++)
		{
			Assert.assertTrue(locations.contains(locations2[i]));
		}
		Assert.assertEquals(locations, firstGame.getPlayerLocations());
		
		Set<GamePiece> gamePieces = firstGame.getPlayerLocations(); 
		Assert.assertEquals(gamePieces, firstGame.getPlayerPieces());
	}
}