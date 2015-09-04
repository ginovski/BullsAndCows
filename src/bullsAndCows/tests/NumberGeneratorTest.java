package bullsAndCows.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import bullsAndCows.NumberGenerator;

public class NumberGeneratorTest {

	@Test
	public void testGenerateAllDigitsShouldBeDifferent() {
		int[] number = new NumberGenerator().generate();
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length; j++) {
				if(i == j){
					continue;
				}
				if(number[i] == number[j]){
					fail();
				}
			}
		}
	}
	
	@Test
	public void testGenerateAllDigitsShouldBeBetween0and9(){
		int[] number = new NumberGenerator().generate();
		for (int i = 0; i < number.length; i++) {
			if(number[i] < 0 || number[i] > 9){
				fail();
			}
		}
	}

}
