import java.util.Scanner;

public class SolutionNonDivisibleSubset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfElements = sc.nextInt();
		int k = sc.nextInt();
		int[] array = new int[numberOfElements];
		int subsetCount = 0;
		int subsetCurrent = 0;
		
		for(int array_i = 0; array_i < numberOfElements; array_i++ ) {
			array[array_i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int array_i = 0; array_i< numberOfElements; array_i++) {
			subsetCurrent = 1;
			for(int array_j = 0; array_j< numberOfElements; array_j++) {
				if(array_i != array_j && (array[array_i] + array[array_j]) % k != 0) subsetCurrent++;
				else break;
			}
			if (subsetCurrent > subsetCount) {
				subsetCount = subsetCurrent;
			}
		}
		
		System.out.println(subsetCount);
	}

}
