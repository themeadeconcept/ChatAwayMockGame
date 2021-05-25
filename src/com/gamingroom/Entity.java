package com.gamingroom;

public class Entity {
	
	private long id;
	private String name;
	
	// private constructor
	private Entity() {
		
	}
	
	// custom public constructor
	public Entity (long id, String name) {
		// references current constructor
		this();
		// references current id
		this.id = id;
		// references current name
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName () {
		return name;
	}
	
	public String toString() {
		return "Entity [id=" + id + ", name=" + name+ "]";
	}
}