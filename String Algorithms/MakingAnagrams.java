import java.util.Scanner;

public class MakingAnagrams {

	static int makingAnagrams(String s1, String s2){
		int numberOfCharacters = 0;
		
		
		int[] firstChars = new int[26];
		int[] secondChars = new int[26];
		
		for (char c : s1.toCharArray()) {
			firstChars[c - 'a']++;
		}
		for (char c : s2.toCharArray()) {
			secondChars[c - 'a']++;
		}
		
		for (int ch_i = 0; ch_i < firstChars.length; ch_i++) {
			numberOfCharacters += Math.abs(firstChars[ch_i] - secondChars[ch_i]);
		}
		
		
		return numberOfCharacters;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
        in.close();
    }

}
