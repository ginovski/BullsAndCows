package bullsAndCows;

import java.util.Random;

public class NumberGenerator {
	private static final Random randomGenerator = new Random();
	
	public int[] generate(){
		int[] number = new int[4];
		
		for (int i = 0; i < number.length; i++) {
			int randomDigit = generateRandomDigit();
			while(Utils.contains(number, randomDigit)){
				randomDigit = generateRandomDigit();
			}
			
			number[i] = randomDigit;
		}
		
		return number;
	}
	
	protected int generateRandomDigit(){
		return randomGenerator.nextInt(10);
	}
}
