import java.util.HashMap;
import java.util.Scanner;

public class SolutionHappyLadybugs {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        int spaceCharCount = 0;
        boolean isValid = false;
        int totalChar = 0;
        
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            char[] b = in.next().toCharArray();
            spaceCharCount = 0;
            charCount.clear();
            
            for (char c : b) {
				if(c == '_') spaceCharCount++;
				else if(charCount.containsKey(c)) {
					charCount.replace(c, charCount.get(c) + 1);
					totalChar++;
				}
				else {
					charCount.put(c, 1);
					totalChar++;
				}
				
			}
            
            isValid = true;
            char previousChar = b[0],nextChar = 0;
            
            boolean inSequence = totalChar > 2 ? true : false;
            
            for (int char_i = 1; char_i < b.length - 1; char_i++) {
				nextChar = b[char_i + 1];
				if(b[char_i] == nextChar || b[char_i] == previousChar) {
					previousChar = b[char_i];
				}
				else {
					inSequence = false;
					break;
				}
				
			}
            
            if(!inSequence) {
	            	for (char c : charCount.keySet()) {
	    				
		            	if(charCount.get(c) < 2) {
							isValid = false;
							break;
						}
		            	previousChar = c;
		            	
				}
            }
            
            
            if(inSequence || (isValid && spaceCharCount > 0)) {
            		System.out.println("YES");
            }
            else {
            		System.out.println("NO");
            }
        }
        in.close();
    }

}
