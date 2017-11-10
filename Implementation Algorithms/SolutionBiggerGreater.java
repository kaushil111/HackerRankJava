import java.util.Scanner;

public class SolutionBiggerGreater {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		char[] input;
		char currentChar, higherChar, lowerChar;
		int startIndex = 0,endIndex = 0, lowerIndex = 0, higherIndex = 0;
		
		for (int test_i = 0; test_i < tests; test_i++) {
			
			input = sc.next().toCharArray();
			currentChar = 0;
			higherChar = 0;
			lowerChar = 0;
			lowerIndex = 0;
			higherIndex = 0;
					
			for (int char_i = 0; char_i < input.length - 1; char_i++) {
				if(input[char_i] < input[char_i + 1]) {
					startIndex = char_i;
					currentChar = input[char_i];
				}
			}
			
			endIndex = input.length - 1;
			while(endIndex >= startIndex) {
				if(higherChar == 0) {
					if(input[endIndex] > currentChar) {
						higherChar = input[endIndex];
						higherIndex = endIndex;
					}
				}
				else {
					if(lowerChar == 0 && input[endIndex] < higherChar) {
						lowerChar = input[endIndex];
						input[higherIndex] = lowerChar;
						input[endIndex]  = higherChar;
						lowerIndex = endIndex;
						break;
					}
				}
				endIndex--;
			}
			
			if(higherChar == 0 || lowerChar == 0) {
				System.out.println("no answer");
				continue;
			}
			input = sort(input, lowerIndex + 1);
			System.out.println(new String(input));
			
		}
		sc.close();
	}
	public static char[] sort(char[] array, int startIndex ) {
		char lowest = 0;
		int lowestIndex = 0;
		
		for (int char_i = startIndex; char_i < array.length - 1; char_i++) {
			lowest = array[char_i];
			lowestIndex = char_i;
			for (int char_j = char_i + 1; char_j < array.length; char_j++) {
				if(array[char_j] < lowest) {
					lowest = array[char_j];
					lowestIndex = char_j;
				}
			}
			array[lowestIndex] = array[char_i];
			array[char_i] = lowest;
			
		}
		return array;
	}
}
