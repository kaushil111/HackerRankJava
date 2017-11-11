import java.util.Scanner;

public class TwoStrings {

	static String twoStrings(String s1, String s2){
        // Complete this function
		
		int[] firstChars = new int[26];
		int[] secondChars = new int[26];
		
		for (char c : s1.toCharArray()) {
			firstChars[c - 'a']++;
		}
		for (char c : s2.toCharArray()) {
			secondChars[c - 'a']++;
		}
		
		for (int ch_i = 0; ch_i < firstChars.length; ch_i++) {
			if(firstChars[ch_i] > 0 && secondChars[ch_i] > 0) return "YES";
		}
		return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
        in.close();
    }

}
