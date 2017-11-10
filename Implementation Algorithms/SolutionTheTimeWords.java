import java.util.Scanner;

class NumberToWords {
	 static final String[] words = {
		"",
		"one",
		"two",
		"three",
		"four",
		"five",
		"six",
		"seven",
		"eight",
		"nine",
		"ten",
		"eleven",
		"twelve",
		"thirteen",
		"fourteen",
		"fifteen",
		"sixteen",
		"seventeen",
		"eighteen",
		"ninteen",
		"twenty",
		"twenty one",
		"twenty two",
		"twenty three",
		"twenty four",
		"twenty five",
		"twenty six",
		"twenty seven",
		"twenty eight",
		"twenty nine",
		"thirty",
	};
}

public class SolutionTheTimeWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minutes = sc.nextInt();
		sc.close();
		
		if (minutes == 0) {
			System.out.println(NumberToWords.words[hour] + " o' clock");
		}
		else if (minutes == 1) {
			System.out.println("one minute past " + NumberToWords.words[hour]);
		}
		else if (minutes == 15) {
			System.out.println("quarter past "+ NumberToWords.words[hour]);
		}
		else if (minutes == 30) {
			System.out.println("half past "+ NumberToWords.words[hour]);
		}
		else if (minutes == 45) {
			System.out.println("quarter  to "+ NumberToWords.words[(hour + 1)]);
		}
		else if(minutes > 30) {
			System.out.println(NumberToWords.words[60 - minutes] + " minutes to " + NumberToWords.words[(hour + 1)]);
		}
		else  {
			System.out.println(NumberToWords.words[minutes] + " minutes past " + NumberToWords.words[hour]);
		}

	}

}
