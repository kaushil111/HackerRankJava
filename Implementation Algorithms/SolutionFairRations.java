import java.util.Scanner;

public class SolutionFairRations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numberOfSubjects = sc.nextInt();
		int[] subjects = new int[numberOfSubjects];
		int numberOfLoaves = 0;
		
		for (int sub_i = 0; sub_i < subjects.length; sub_i++) {
			subjects[sub_i] = sc.nextInt();
		}
		sc.close();
		for (int sub_i = 0; sub_i < subjects.length - 1; sub_i++) {
			if(subjects[sub_i] %2 != 0) {
				numberOfLoaves += 2;
				subjects[sub_i] += 1;
				subjects[sub_i + 1] += 1;
			}
		}
		if(subjects[(numberOfSubjects - 1)] % 2 != 0) System.out.println("NO");
		else System.out.println(numberOfLoaves);
		
	}
	
}
