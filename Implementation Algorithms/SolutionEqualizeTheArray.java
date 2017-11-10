import java.util.Scanner;

public class SolutionEqualizeTheArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();;
		int[] array = new int[size];
		
		for (int array_i = 0; array_i < array.length; array_i++) {
			array[array_i] = sc.nextInt();
		}
		sc.close();
		
		int highestOccurence = 0;
		int currentOccurence = 0;
		
		for (int array_i = 0; array_i < array.length; array_i++) {
			currentOccurence = 1;
			for (int array_j = array_i + 1; array_j < array.length; array_j++) {
				if(array[array_j] == array[array_i]) currentOccurence++;
			}
			if(highestOccurence < currentOccurence) highestOccurence = currentOccurence; 
			
		}
		
		System.out.println(array.length - highestOccurence);

	}

}
