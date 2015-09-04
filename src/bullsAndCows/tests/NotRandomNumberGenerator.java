package bullsAndCows.tests;

import bullsAndCows.NumberGenerator;

public class NotRandomNumberGenerator extends NumberGenerator {

	@Override
	public int[] generate() {
		return new int[] { 4, 7, 6, 1 };
	}
}
