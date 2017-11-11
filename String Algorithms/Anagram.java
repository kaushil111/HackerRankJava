import java.util.Scanner;

public class Anagram {

	static int anagram(String s){
        // Complete this function
		if (s.length() % 2 != 0) return -1;
		
		int numberOfCharacters = 0;
		
		String first  = s.substring(0, s.length()/2);
		String second = s.substring(s.length()/2);
		
		int[] firstChars = new int[26];
		int[] secondChars = new int[26];
		
		for (char c : first.toCharArray()) {
			firstChars[c - 'a']++;
		}
		for (char c : second.toCharArray()) {
			secondChars[c - 'a']++;
		}
		
		for (int ch_i = 0; ch_i < firstChars.length; ch_i++) {
			numberOfCharacters += Math.abs(firstChars[ch_i] - secondChars[ch_i]);
		}
		
		
		return numberOfCharacters / 2;
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
        in.close();
    }

}
