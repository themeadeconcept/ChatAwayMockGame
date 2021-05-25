package com.gamingroom;

//imports java collection frameworks
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */

// extends Entity class
public class Team extends Entity{
	// create playerList
	private List<Player>players = new ArrayList<Player>();
	
	// overloaded constructor
	public Team(long id, String name) {
		super(id, name);
	}
	
	// iterator pattern
	public Player addPlayer(String name) {
		// local instance
		Player player = null;
		// iterator
		Iterator<Player>playerIterator = players.iterator();
		
		// hasNext() returns true if there is another token in input
		while (playerIterator.hasNext()) {
			// set instance to next iteration
			Player playerInstance = playerIterator.next();
			// checks if instance exists
			if (playerInstance.getName().equals(name)) {
				// if instance exists, returns instance
				player = playerInstance;
			} else {
				// else player will be added to the player list
				players.add(player);
			}
		}
		return player;
	}

	/**
	 * @return the id
	 */
	
	// no longer necessary
//	public long getId() {
//		return id;
//	}
//
//	/**
//	 * @return the name
//	 */
//	public String getName() {
//		return name;
//	}

	@Override
	public String toString() {
		return "Team [id=" + super.getId() + ", name=" + super.getName() + "]";
	}
}
