import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest {

	Color colorTest = null; 
	Shape BOOT = Shape.BOOT; 
	Shape THIMBLE = Shape.THIMBLE; 
	Shape GARGOYLE = Shape.RACECAR; 
	GamePiece HAT = GamePiece.BLUE_BOOT;
	GamePiece FATCAT = GamePiece.MAGENTA_RACER;
	//GamePieceAppearance HELLO = Shape.BOOT; // = GamePieceAppearance.Y
	//GamePiece KITE = GamePiece.GREEN_BOOT.movesFirst(BOOT, HAT);
	
	//GamePiece illuminati = appearance.GREEN, Shape.THIMBLE; 

	@Test
	public void ColorTest()
	{
		colorTest = Color.CYAN;
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 255, colorTest.getB());
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 255, colorTest.getG());
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 0, colorTest.getR());

		colorTest = Color.BLUE;
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 255, colorTest.getB());
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 0, colorTest.getG());
		Assert.assertEquals("Incorrect rgb value " + colorTest.name(), 0, colorTest.getR());
		
		//Assert.assertEquals("Incorrect rgb value " + HAT.name(), 255, HAT.getColor()); 
	}
	
	@Test
	public void LocationTest()
	{
		Assert.assertEquals("Incorrect location found", Location.BALLROOM, Location.valueOf("BALLROOM"));
		Assert.assertEquals("Incorrect location found", Location.BILLIARD_ROOM, Location.valueOf("BILLIARD_ROOM"));
		Assert.assertEquals("Incorrect location found", Location.CONSERVATORY, Location.valueOf("CONSERVATORY"));
		Assert.assertEquals("Incorrect location found", Location.DINING_ROOM, Location.valueOf("DINING_ROOM"));
		Assert.assertEquals("Incorrect location found", Location.HALL, Location.valueOf("HALL"));
		Assert.assertEquals("Incorrect location found", Location.KITCHEN, Location.valueOf("KITCHEN"));
		Assert.assertEquals("Incorrect location found", Location.LIBRARY, Location.valueOf("LIBRARY"));
		Assert.assertEquals("Incorrect location found", Location.LOUNGE, Location.valueOf("LOUNGE"));
		Assert.assertEquals("Incorrect location found", Location.STUDY, Location.valueOf("STUDY"));
		
	}
	
	@Test
	public void ShapeTest()
	{
		Assert.assertEquals("Incorrect shape for " + BOOT.name(), "boot", Shape.BOOT.toString()); 
		Assert.assertEquals("Incorrect shape for " + THIMBLE.name(), "thimble", Shape.THIMBLE.toString()); 
		Assert.assertEquals("Incorrect shape for " + GARGOYLE.name(), "racecar", Shape.RACECAR.toString()); 
		//Assert.assertEquals(null, Shape.RACECAR.toString()); //TEST the DEFAULT SETTING
	}
	
	@Test
	public void getColorTest() {
		Assert.assertEquals("Incorrect color for gamepiece of " + HAT.name(), Color.BLUE, GamePiece.BLUE_BOOT.getColor()); 
	}
	
	@Test
	public void getPriorityTest() {
		Assert.assertEquals("Incorrect priority", GamePiece.MAGENTA_RACER, GamePiece.movesFirst(GamePiece.MAGENTA_RACER, GamePiece.YELLOW_BOOT));
		Assert.assertEquals("Incorrect priority", GamePiece.MAGENTA_RACER, GamePiece.movesFirst(GamePiece.YELLOW_BOOT, GamePiece.MAGENTA_RACER));
		Assert.assertEquals("Incorrect priority", GamePiece.MAGENTA_RACER, GamePiece.movesFirst(GamePiece.MAGENTA_RACER, GamePiece.MAGENTA_RACER));
		//Assert.assertEquals("Incorrect priority", 1, GamePiece.GREEN_BOOT.movesFirst(FATCAT, HAT));
	}
	
}
