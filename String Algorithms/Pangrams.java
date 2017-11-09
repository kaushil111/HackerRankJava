import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] characterCount = new int[26];
        boolean isValid;
        
        String s = in.nextLine();
        char[] inputArray = s.toCharArray();
        
        for (int i = 0; i < characterCount.length; i++) {
			characterCount[i] = 0;
		}
        
        for (int char_i = 0; char_i < inputArray.length; char_i++) {
			char c = inputArray[char_i];
			
			if(c >= 'A' && c <= 'Z') {
				characterCount[c - 'A'] = 1;
			}
			else if(c >= 'a' && c <= 'z') {
				characterCount[c - 'a'] = 1;
			}
		}
        
        isValid = true;
        for (int count : characterCount) {
			if(count == 0) {
				isValid = false;
				break;
			}
		}
        
        if (isValid) {
        		System.out.println("pangram");
		}
        else System.out.println("not pangram");
            
        in.close();    
	}
}
