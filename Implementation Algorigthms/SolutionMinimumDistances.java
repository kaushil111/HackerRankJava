import java.util.Scanner;

public class SolutionMinimumDistances {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        
        int minDistance = -1;
        
        in.close();
        
        for (int array_i = 0; array_i < A.length -1; array_i++) {
			for (int array_j = array_i + 1; array_j < A.length; array_j++) {
				if(A[array_i] == A[array_j]) {
					if (minDistance == -1 || array_j - array_i < minDistance) {
						minDistance = array_j - array_i;
					}
				}
			}
		}
        System.out.println(minDistance);
    }

}
