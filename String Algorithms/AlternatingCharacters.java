import java.util.Scanner;

public class AlternatingCharacters {
	static int alternatingCharacters(String s){
        // Complete this function
		int highestAlternating = 0, currentAlternating;
		char first, second;
		
		if(s.length() <= 1) return 1;
		
		first = s.charAt(0);
		second = first == 'A' ? 'B' : 'A';
		
		currentAlternating = 0;
		
		for (int ch_i = 0; ch_i < s.length(); ch_i++) {
			if(currentAlternating % 2 == 0 && first == s.charAt(ch_i)) {
				currentAlternating++;
			}
			else if(currentAlternating % 2 != 0 && second == s.charAt(ch_i)) {
				currentAlternating++;
			}
		}
		
		highestAlternating = currentAlternating;
		
		first = first == 'A' ? 'B' : 'A';
		second = first == 'A' ? 'B' : 'A';
		
		currentAlternating = 0;
		
		for (int ch_i = 0; ch_i < s.length(); ch_i++) {
			if(currentAlternating % 2 == 0 && first == s.charAt(ch_i)) {
				currentAlternating++;
			}
			else if(currentAlternating % 2 != 0 && second == s.charAt(ch_i)) {
				currentAlternating++;
			}
		}
		
		if(highestAlternating < currentAlternating) highestAlternating = currentAlternating;
		
		return s.length() - highestAlternating;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
        in.close();
    }
}
