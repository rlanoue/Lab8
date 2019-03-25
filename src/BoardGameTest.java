import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest {

	Color colorTest = null; 
	Shape BOOT = Shape.BOOT; 
	Shape THIMBLE = Shape.THIMBLE; 
	Shape GARGOYLE = Shape.RACECAR; 
	GamePiece HAT = GamePiece.BLUE_BOOT;
	GamePiece FATCAT = GamePiece.YELLOW_BOOT;
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
		Assert.assertEquals("Incorrect shape for " + BOOT.name(), "Boot", Shape.BOOT.toString()); 
		Assert.assertEquals("Incorrect shape for " + THIMBLE.name(), "Thimble", Shape.THIMBLE.toString()); 
		Assert.assertEquals("Incorrect shape for " + GARGOYLE.name(), "Race Car", Shape.RACECAR.toString()); 
		//Assert.assertEquals("Incorrect shape for " + GARGOYLE.name(), "Error", Shape.RACECAR.toString()); TEST the DEFAULT SETTING
	}
	
	@Test
	public void getColorTest() {
		Assert.assertEquals("Incorrect color for gamepiece of " + HAT.name(), "Blue", GamePiece.BLUE_BOOT.);
	}
	
	@Test
	public void getPriorityTest() {
		Assert.assertEquals("Incorrect priorirt", 0, GamePiece.MAGENTA_RACER.getPriority());
		Assert.assertEquals("Incorrect priorirt", 1, GamePiece.GREEN_BOOT.movesFirst(FATCAT, HAT));
	}
	
}
