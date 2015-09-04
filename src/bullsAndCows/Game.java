package bullsAndCows;

public class Game {
	private int[] number;
	private int bulls;
	private int cows;
	
	public Game(NumberGenerator generator){
		this.bulls = 0;
		this.cows = 0;
		this.number = generator.generate();
	}
	
	public int getBulls(){
		return bulls;
	}
	
	public int getCows(){
		return cows;
	}
	
	public void surrender(){
		int number = Utils.convertToNumber(this.number);
		
		System.out.println("You surrender, the number was: " + number);
	}
	
	public void guess(int[] guess){
		this.cows = 0;
		this.bulls = 0;
		
		for (int i = 0; i < this.number.length; i++) {
			if(this.number[i] == guess[i]){
				this.bulls++;
			} else if(Utils.contains(this.number, guess[i])){
				this.cows++;
			}
		}
	}
	
	
}
