import java.util.Scanner;

public class SolutionServiceLane {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tests = sc.nextInt();
		int[] array = new int[n];
		int lowerBound = 0;
		int upperBound = 0;
		int lowest = 3;
		
		for (int arr_i = 0; arr_i < array.length; arr_i++) {
			array[arr_i] = sc.nextInt();
		}
		
		for (int test = 0; test < tests; test++) {
			lowest = 3;
			lowerBound = sc.nextInt();
			upperBound = sc.nextInt();
			

			for (int arr_i = lowerBound; arr_i <= upperBound; arr_i++) {
				if(lowest > array[arr_i]) lowest = array[arr_i];
			}
			System.out.println(lowest);
			
		}
		
		sc.close();

	}

}
