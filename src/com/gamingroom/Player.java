package com.gamingroom;

/**
 * A simple class to hold information about a player
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a player is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */

// Extends Entity class
public class Player extends Entity {
	long id;
	String name;
	
	// overloaded Constructor
	public Player(long id, String name) {
		super(id, name);
	}
	
	// no longer necessary
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

	@Override
	public String toString() {
		return "Player [id=" + super.getId() + ", name=" + super.getName() + "]";
	}
}
