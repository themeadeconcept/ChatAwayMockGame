package com.gamingroom;

/**
 * A class to test a singleton's behavior
 * 
 * @author coce@snhu.edu
 */
public class SingletonTester {

	public void testSingleton() {
		
		System.out.println("\nAbout to test the singleton...");
		
		// obtain local reference to the singleton instance - FIXEDME
		GameService service = GameService.getInstance(); 
		
		// a simple for loop to print the games - needed to fix my for loop as my second statement was evaluating to a Boolean and not an int
		for (int i = 1; i <= service.getGameCount(); i++) {
			System.out.println(service.getGame(i));
		}
	}
}
