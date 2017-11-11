import java.util.Scanner;

public class PalindromeIndex {
	static int palindromeIndex(String s){
        // Complete this function
		int index = -1;
		
		for (int ch_i = 0, ch_j = s.length() -1; ch_i < ch_j; ch_i++, ch_j--) {
			if(s.charAt(ch_i) == s.charAt(ch_j)) continue;
			else {
				String p = s.substring(0, ch_i) + s.substring(ch_i+1);
				
				if(isPalindromeIndex(p)) return ch_i;
				else return ch_j;
			}
		}
		
		return index;
    }
	
	static boolean isPalindromeIndex(String s){
        
		for (int ch_i = 0, ch_j = s.length() -1; ch_i < ch_j; ch_i++, ch_j--) {
			if(s.charAt(ch_i) != s.charAt(ch_j)) return false;
		}
		
		return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
        in.close();
    }
}
