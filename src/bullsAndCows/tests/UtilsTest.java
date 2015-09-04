package bullsAndCows.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import bullsAndCows.Utils;

public class UtilsTest {

	@Test
	public void testConvertToArrayShouldReturnArrayWithDigitsSameAsNumberDigits() {
		int number = 4578;
		int[] numberAsArray = Utils.convertToArray(number);
		String numberAsString = Integer.toString(number);

		for (int i = 0; i < numberAsArray.length; i++) {
			if (numberAsArray[i] != Integer.parseInt(Character.toString(numberAsString.charAt(i)))) {
				fail();
			}
		}
	}

	@Test
	public void testContainsIfDigitIsInTheArrayShouldReturnTrue() {
		int[] digits = new int[] { 1, 2, 3, 4 };
		int digit = 1;
		
		assertTrue(Utils.contains(digits, digit));

	}

}
