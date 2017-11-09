import java.util.Scanner;

public class SolutionBeautifulTriplets {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] array = new int[n];
		int i, j;
		int triplets = 0;
		
		for (int array_i = 0; array_i < array.length; array_i++) {
			array[array_i] = sc.nextInt();
		}
		
		sc.close();
		
		for (int array_i = 0; array_i < array.length - 2; array_i++) {
			i = array[array_i];
			for (int array_j = array_i + 1; array_j < array.length - 1; array_j++) {
				if(array[array_j] - i != d) continue;
				
				j = array[array_j];
				
				for (int array_k = array_j + 1; array_k < array.length; array_k++) {
					if(array[array_k] - j != d) continue;
					
					triplets++;
					
				}
				
			}
		}
		
		System.out.println(triplets);

	}

}
