package com.gamingroom;

// imports java collection frameworks
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	
	// next player identifier
	private static long nextPlayerId = 1;
	
	// next team identifier
	private static long nextTeamId = 1;
	
	// used to track GameService
	private static GameService service;
	
	//private constructor
	private GameService () {
		
	}
	
	// check if GameService exists
	public static GameService getInstance() {
		if (service == null) {
			// if service doesn't exist, create it
			service = new GameService();
			System.out.println("New Game Service has been created!");
		} else {
			// print the service if it already exists
			System.out.println("Game Service already exists.");
		}
		return service;
	}


	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	
	/*
	// No long necessary
	// New Game instance
	public static GameService getInstance() {
		return instance;
	}
	*/
	
	// for new game instance
	public Game addGame(String name) {

		// a local game instance
		Game game = null;
		
		// iterator for Game
		Iterator<Game> gameIterator = games.iterator();
		
		// will return true if there is another token in input
		while (gameIterator.hasNext()) {
			// set game to next iteration
			Game gameInstance = gameIterator.next();
			//check if the game already exists
			if (gameInstance.getName().equals(name)) {
				// return the game if it exists
				return gameInstance;
			}
			// if the check fails, creates new game and adds it to the list
			if (game == null) {
				game = new Game (nextGameId++, name);
				games.add(game);
			}
			return game;
		}
		
		/*
		// returns game with matching ID
		public Game getGame(long id) {
			// game instance
			Game game = null;
			
			// iterator
			Iterator<Game> gameIterator = games.iterator();
			
			// will return true if there is another token in input
			while (gameIterator.hasNext()) {
				// set game to next iteration
				Game gameInstance = gameIterator.next();
				//check if instance exists
				if (gameInstance.getId() == id) {
					// assigns game to the instance and returns if it exists
					game = gameInstance;
				}
			}
			return game;
		}
		*/

		// Use a for loop to iterate - FIXEDME
		// if found, simply return the existing instance
		for (Game currentGame : games) {
			if (currentGame.getName().equals(name)) {
				return currentGame;
			}
		}

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
//	public Game getGame(int index) {
//		return games.get(index);
//	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// Used iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable - 
		// This will iterate through the games, and if the current id exists, the game instance is returned - FIXEDME
		for (Game currentGame : games) {
			if (currentGame.getId() == id) {
				game = currentGame;
			}
		}
		

		return game;
	}
	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;
		
		// iterator
		Iterator<Game>gameIterator = games.iterator();
		
		// will return true if there is a token in the input
		while (gameIterator.hasNext()) {
			Game gameInstance = gameIterator.next();
			// check if it exists
			if (gameInstance.getName().equals(name)) {
				// return the instance
				game = gameInstance;
			}
		}
		return game;

		// Use iterator to look for existing game with same name
		// if found, simply assign that instance to the local variable - FIXEDME
		
		// This will iterate through the games if one has the name, it is returned
//		for (Game currentGame : games) {
//			if (currentGame.getName().equals(name)) {
//				game = currentGame;
//			}
//		}

//		return game;
	}

	
	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
	
	// next player turn - returns that Id for the next player
	public long getNextPlayerId() {
		return nextPlayerId;
	}
	
	// returns next teams id
	public long getNextTeamId() {
		return nextTeamId;
	}
}
