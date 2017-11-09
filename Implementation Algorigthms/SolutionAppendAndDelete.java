import java.util.Scanner;

public class SolutionAppendAndDelete {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s = in.next().toCharArray();
        char[] t = in.next().toCharArray();
        int k = in.nextInt();
        int commonChars = 0;
        for(int char_i = 0; char_i < s.length && char_i < t.length; char_i++ ) {
        		if(s[char_i] == t[char_i]) commonChars++;
        		else break;
        }
        
        int operations = (s.length - commonChars) + (t.length - commonChars);
        if(operations <= k) {
            if(operations == k) System.out.println("Yes");
            else if(k >= 2*t.length ) System.out.println("Yes");
            else if((k-operations) % 2 == 0)  System.out.println("Yes");
            else System.out.println("No");
        }
        else System.out.println("No"); 
        in.close();
    }
}
