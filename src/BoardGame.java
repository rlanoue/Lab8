import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame extends Driver {

	protected LinkedHashMap<String, GamePiece> playerPieces = new LinkedHashMap<String, GamePiece>(); 
	protected LinkedHashMap<String, Location> playerLocations = new LinkedHashMap<String, Location>(); 

	String[] playersMoveTo = new String[10]; 

	ArrayList<String> playersAtLoc = new ArrayList<String>(); 


	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation){
		if(playerPieces.containsKey(playerName) || playerPieces.containsValue(gamePiece))
		{
			return false; 
		}
		else 
		{
			playerPieces.put(playerName, gamePiece);
			playerLocations.put(playerName, initialLocation);
			return true; 
		}
	}

	public GamePiece getPlayerGamePiece(String playerName){
		GamePiece associatedGamePiece = playerPieces.get(playerName); 
		return associatedGamePiece;  
	} 
	
	public String getPlayerWithGamePiece(GamePiece gamePiece){
		String RassociatedName = null; 
		for (int i = 0; i < playerPieces.size(); i++){
			if (playerPieces.containsValue(gamePiece)){
				GamePiece associatedName = playerPieces.get(gamePiece); 
				RassociatedName = associatedName.toString(); 
				//return RassociatedName; 
			}
			//return RassociatedName; 
		}
		return RassociatedName;

	}

	String movePlayer = null;
	public void movePlayer(String playerName, Location newLocation){
		movePlayer = null; 
		playerPieces.forEach((key, value) -> {
			if(key.equals(playerName)){
				movePlayer = key; 
			}
			playerLocations.put(movePlayer, newLocation);
		}); 
	}

	public String[] moveTwoPlayers (String[] playerNames, Location[] newLocations){
		String[] moveTwoPlayers = new String[2]; 

		GamePiece p1GamePiece = playerPieces.get(playerNames[0]); 
		GamePiece p2GamePiece = playerPieces.get(playerNames[1]); 

		GamePiece movingTwo = GamePiece.movesFirst(p1GamePiece, p2GamePiece);
		if (movingTwo.equals(p1GamePiece))
		{
			playerLocations.put(playerNames[0], newLocations[0]);
			playerLocations.put(playerNames[1], newLocations[1]);
			moveTwoPlayers = playerNames; 
			return moveTwoPlayers; 
		}
		else
		{
			playerLocations.put(playerNames[1], newLocations[1]);
			playerLocations.put(playerNames[0], newLocations[0]);
			moveTwoPlayers[0] = playerNames[1];
			moveTwoPlayers[1] = playerNames[0]; 
			return moveTwoPlayers; 
		}
	}

	public Location getPlayersLocation(String player){
		return playerLocations.get(player);
	}

	public ArrayList<String> getPlayersAtLocation (Location loc){
		for (int i = 0; i < playerLocations.size(); i++){
			if (playerLocations.containsValue(loc)){
				GamePiece associatedLocation = playerPieces.get(loc); 
				playersAtLoc.add(associatedLocation.toString()); 
				return playersAtLoc; 
			}
		}
		return playersAtLoc; 	
	}

	GamePiece associatedLocation; 
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc){
		ArrayList<GamePiece> piecesAtLoc = new ArrayList<GamePiece>();
		Location newest = null; 
		for (int i = 0; i < playerLocations.size(); i++){
			if (playerLocations.containsKey(loc)){
				piecesAtLoc.add(playerPieces.get(newest)); 
			}
		}
		return piecesAtLoc;
	}

	public Set<String> getPlayers(){
		return playerPieces.keySet(); 
	}

	public Set<Location> getPlayerLocations(){
		return (Set<Location>) playerLocations.values();  
	}

	public Set<GamePiece> getPlayerPieces(){
		return (Set<GamePiece>) playerPieces.values(); 
	}
}