import java.util.Scanner;

public class StringConstruction {
	static int stringConstruction(String s) {
        // Complete this function
		int cost = 0;
		
		int[] charCount = new int[26];
		
		for (int cc_i = 0; cc_i < charCount.length; cc_i++) {
			charCount[cc_i] = 0;
		}
		
		for (int ch_i = 0; ch_i < s.length(); ch_i++) {
			
			if(charCount[s.charAt(ch_i) - 'a'] == 0) cost++;
			charCount[s.charAt(ch_i) - 'a']++;
		}
		
		return cost;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}
