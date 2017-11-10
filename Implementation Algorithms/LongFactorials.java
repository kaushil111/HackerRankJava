import java.math.BigDecimal;
import java.util.Scanner;

public class LongFactorials {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		
		System.out.println(factorial(number));
		sc.close();
    }
    
	public static BigDecimal factorial(long number) {
		if(number <= 0) return new BigDecimal(0);
		else if(number == 1) return new BigDecimal(1);
		else if(number == 2) return new BigDecimal(2);
		else return factorial(number -1).multiply(new BigDecimal(number));
	}
	
}
