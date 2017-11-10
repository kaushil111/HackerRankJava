import java.util.Scanner;

public class SolutionValidBinarySearchTrees {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		int countOfElements = 0;
		
		for (int test_i = 0; test_i < tests; test_i++) {
			countOfElements = sc.nextInt();
			int[] array = new int[countOfElements];
			
			for (int arr_i = 0; arr_i < array.length; arr_i++) {
				array[arr_i] = sc.nextInt();
			}
			
			if (checkBinaryTree(array, 0, countOfElements - 1)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
		
		sc.close();
		

	}
	
	public static boolean checkBinaryTree(int[] array, int startIndex, int endIndex) {
		
		
		if ((endIndex - startIndex) <= 1) {
			return true;
		}
		else {
			int midElement = array[startIndex];
			int midIndex = startIndex + 1;
			
			while(midIndex <= endIndex && array[midIndex] <= midElement) midIndex ++;
			midIndex --;
			
			for (int arr_i = midIndex + 1; arr_i <= endIndex; arr_i++) {
				if(array[arr_i] < midElement) return false;
			}
			
			return checkBinaryTree(array, startIndex + 1, midIndex) && checkBinaryTree(array, midIndex + 1, endIndex);
			
		}
		
	}
	

}
