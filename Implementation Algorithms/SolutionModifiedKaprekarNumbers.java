import java.util.Scanner;

public class SolutionModifiedKaprekarNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long start  = sc.nextInt();
		long end = sc.nextInt();
		sc.close();
		double digits = 0;
		long left = 0;
		long right = 0;
		int mid = 0;
		long square = 0;
		boolean didPrint = false;
		
		for (long number = start; number <= end; number++) {
			square = (long)Math.pow(number, 2);
			digits = countDigits(square);
			
			if(square > 9) {
				mid = (int)Math.ceil(digits/2);
				left = (long)Math.floor(square / Math.pow(10,mid));
				right = (long) (square % (Math.pow(10,mid)));	
			}
			else {
				left = square;
				right = 0;
			}
			
			if((left + right) == number) {
				didPrint = true;
				System.out.print(number+" ");
			}
		}
		if (!didPrint) {
			System.out.print("INVALID RANGE");
		}

	}
	
	public static int countDigits(long number) {
		int digits = 0;
		while(number > 0) {
			digits++;
			number /= 10;
			
		}
		return digits;
	}
}
