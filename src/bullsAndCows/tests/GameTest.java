package bullsAndCows.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import bullsAndCows.Game;

public class GameTest {

	@Test
	public void testIfGuessedRightNumberBullsAre4() {
		Game newGame = new Game(new NotRandomNumberGenerator());

		newGame.guess(new int[] { 4, 7, 6, 1 });
		
		assertEquals(4, newGame.getBulls());
	}
	
	@Test
	public void testIfAllDigitsAreRightButNotOnTheRightPlacesShouldHave4Cows() {
		Game newGame = new Game(new NotRandomNumberGenerator());

		newGame.guess(new int[] { 1, 6, 7, 4 });
		
		assertEquals(4, newGame.getCows());
	}
	
	@Test
	public void testIf2DigitsAreOnRightPlacesAndOneIsNotShouldHave2Bulls1Cow() {
		Game newGame = new Game(new NotRandomNumberGenerator());

		newGame.guess(new int[] { 4, 0, 6, 7 });
		
		assertEquals(1, newGame.getCows());
		assertEquals(2, newGame.getBulls());
	}
	
	@Test
	public void testIf0DigitsAreOnRightPlacesShouldHave0BullsAnd0Cows() {
		Game newGame = new Game(new NotRandomNumberGenerator());

		newGame.guess(new int[] { 3, 5, 8, 9 });
		
		assertEquals(0, newGame.getCows());
		assertEquals(0, newGame.getBulls());
	}

}
