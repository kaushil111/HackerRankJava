import java.util.Scanner;

public class SolutionCamelCase {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s = in.next().toCharArray();
        
        int camelCaseCount = 1;
        for(int char_i = 1; char_i < s.length; char_i++) {
        		if(s[char_i] >= 'A' && s[char_i] <= 'Z') camelCaseCount++;
        }
        System.out.println(camelCaseCount);
        in.close();
    }

}
