package com.gamingroom;

//imports java collection frameworks
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */

// extend Entity.java
public class Game extends Entity {
	long id;
	String name;
	
	private List<Team>teams = new ArrayList<Team>();

	/**
	 * Constructor with an identifier and name - overloaded constructor
	 */
	public Game(long id, String name) {
		super(id, name);
	}

	public Team addTeam(String name) {
		// local instance of team
		Team team = null;
		
		// iterator for the teams
		Iterator<Team>teamIterator = teams.iterator();
		
		// hasNext() returns true if there is another token in its input
		while (teamIterator.hasNext()) {
			//finds and returns next complete token
			Team teamInstance = teamIterator.next();
			//check if team name exists
			if (teamInstance.getName().equals(name)) {
				team = teamInstance;
			} else {
				// iff the team doesn't exists, add it to the array
				teams.add(team);
			}
		}
		//return the team
		return team;
	}
	
	// no longer needed this portion?
//	
//	/**
//	 * @return the id
//	 */
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

	// constructor has changed - fixed return statement
	@Override
	public String toString() {
		return "Game [id=" + super.getId() + ", name=" + super.getName() + "]";
	}

}
