import java.util.Scanner;

public class SolutionChocolateFeast {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		int n=0, m=0, c =0;
		int totalChocolates = 0;
		double availableChocolates = 0;
		int extraWrappers = 0;
		
		for (int test = 0; test < tests; test++) {
			n = sc.nextInt();
			m = sc.nextInt();
			c = sc.nextInt();
			availableChocolates = Math.floor(n/m);
			extraWrappers = n%m;
			totalChocolates = (int)availableChocolates;
			
			while (availableChocolates > 0) {
				availableChocolates += extraWrappers;
				extraWrappers = (int) (availableChocolates % c);
				availableChocolates = Math.floor(availableChocolates / c);
				totalChocolates  += (int)availableChocolates;
			}
			System.out.println(totalChocolates);
		}
		sc.close();
	}

}
