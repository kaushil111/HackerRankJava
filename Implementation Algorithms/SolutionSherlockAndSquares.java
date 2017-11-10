import java.util.Scanner;

public class SolutionSherlockAndSquares {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		int first = 0;
		int second = 0;
		int firstSqrt = 0;
		int secondSqrt = 0;
		int total =0;
		for(int case_i = 0; case_i < testCases; case_i++) {
			first = sc.nextInt();
			second = sc.nextInt();
			
			firstSqrt = (int)Math.ceil(Math.sqrt(first));
			secondSqrt = (int)Math.ceil(Math.sqrt(second));
			
			total = secondSqrt - firstSqrt;
			
			if(secondSqrt * secondSqrt == second) total++;
			
			System.out.println(total);
		}
		sc.close();
    }

}
