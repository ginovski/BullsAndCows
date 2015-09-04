package bullsAndCows;

import java.util.Scanner;

public class BullsAndCowsMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Game newGame = new Game(new NumberGenerator());
		
		while(true){
			System.out.print("Guess number: ");
			String numberAsString = scanner.next();
			if(numberAsString.equals("surrender")){
				newGame.surrender();
				break;
			}
			int[] guess = Utils.convertToArray(numberAsString);
			
			newGame.guess(guess);
			int bulls = newGame.getBulls();
			int cows = newGame.getCows();
			
			if(bulls == 4){
				System.out.println(bulls + " bulls, you win!");
				break;
			} else if(cows > 0 && bulls == 0){
				System.out.println(cows + " cows");
			} else if(bulls > 0 && cows == 0){
				System.out.println(bulls + " bulls");
			} else {
				System.out.println(bulls + " bulls and " + cows + " cows");
			}
		}
		
		scanner.close();
	}

}
