package bullsAndCows;

public class Utils {
	
	public static int[] convertToArray(int number){
		String numberAsString = Integer.toString(number);

		return convertToArray(numberAsString);
	}
	
	public static int[] convertToArray(String numberAsString){
		int[] result = new int[numberAsString.length()];
		for (int i = 0; i < numberAsString.length(); i++) {
			result[i] = numberAsString.charAt(i) - '0';
		}
		
		return result;
	}
	
	public static int convertToNumber(int[] numberAsArray){
		String number = "";
		for (int i = 0; i < numberAsArray.length; i++) {
			number += numberAsArray[i];
		}
		
		return Integer.parseInt(number);
	}

	public static boolean contains(int[] array, int element) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == element){
				return true;
			}
		}
		
		return false;
	}
}
