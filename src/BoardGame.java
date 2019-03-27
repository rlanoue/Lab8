import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;

public class BoardGame extends Driver {

	protected LinkedHashMap<String, GamePiece> playerPieces = new LinkedHashMap<String, GamePiece>(); 
	protected LinkedHashMap<String, Location> playerLocations = new LinkedHashMap<String, Location>(); 

	String[] playersMoveTo = new String[10]; 




	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation){
		if(playerPieces.containsKey(playerName))
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
		GamePiece associatedGamePiece = null; 
		for (String playerName : playerPieces.keySet()){
			associatedGamePiece = playerPieces.get(playerName); 
			if (associatedGamePiece == gamePiece){
				return playerName;
			}
		}
		return null;
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
		ArrayList<String> playersAtLoc = new ArrayList<String>(); 

		for (String location : playerLocations.keySet()){
			if (playerLocations.get(location).equals(loc)){
				String returned; 
				returned = location; 
				playersAtLoc.add(returned);  
			}
		}
		return playersAtLoc; 	
	}

	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc){
		ArrayList<GamePiece> piecesAtLoc = new ArrayList<GamePiece>();
		for (String playerName : playerLocations.keySet()){
			
			if (playerLocations.get(playerName).equals(loc)){
				piecesAtLoc.add(playerPieces.get(playerName)); 
			}
		}
		return piecesAtLoc;
	}

	public Set<String> getPlayers(){
		return playerPieces.keySet(); 
	}

	public Set<Location> getPlayerLocations(){
		Set<Location> locations = new HashSet<Location>();

		for(Map.Entry<String, Location> entry : playerLocations.entrySet())
		{
			locations.add(entry.getValue()); 
		}
		return locations;  
	}

	public Set<GamePiece> getPlayerPieces(){
		Set<GamePiece> gamePieces = new HashSet<GamePiece>();

		for(Map.Entry<String, GamePiece> entry : playerPieces.entrySet())
		{
			gamePieces.add(entry.getValue()); 
		}
		return gamePieces;
	}
}