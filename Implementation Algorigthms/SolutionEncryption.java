import java.util.Scanner;

public class SolutionEncryption {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		sc.close();
		
		int countOfCharacters = input.length();
		int rowCount = (int)Math.floor(Math.sqrt(countOfCharacters));
		int colCount = (int)Math.ceil(Math.sqrt(countOfCharacters));
		if(rowCount*colCount < countOfCharacters) rowCount++;
				
		int index = 0;
		for (int char_i = 0; char_i < colCount; char_i++) {
			for (int char_j = 0; char_j < rowCount; char_j++) {
				index = char_j*colCount + char_i;
				if(index >= input.length())continue;
				System.out.print(input.charAt(index));
			}
			System.out.print(" ");
		}

	}

}
