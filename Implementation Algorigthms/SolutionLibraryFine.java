import java.util.Scanner;

public class SolutionLibraryFine {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	Scanner sc = new Scanner(System.in);
	
	int secondDate = sc.nextInt();
	int secondMonth = sc.nextInt();
	int secondYear = sc.nextInt();
	
	int firstDate = sc.nextInt();
	int firstMonth = sc.nextInt();
	int firstYear = sc.nextInt();
	
	sc.close();
    
    int cost = 0;
	
	if ((secondYear - firstYear) < 0 || ((secondYear - firstYear) == 0 && (secondMonth - firstMonth) < 0) ){
		cost = 0;
	}
	else if ((secondYear - firstYear) > 0) {
		cost = 10000;
	}
	else if((secondMonth - firstMonth) > 0) {
		cost = (secondMonth - firstMonth) * 500;
	}
	else {
        cost = (secondDate - firstDate)* 15;
		
	}
	if(cost <= 0) System.out.println(0);
    else System.out.println(cost);
		
}

}
