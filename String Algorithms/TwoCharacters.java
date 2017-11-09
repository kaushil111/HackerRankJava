import java.util.ArrayList;
import java.util.Scanner;

public class TwoCharacters {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        in.close();
        
        ArrayList<Character> uniqueCharacters = new ArrayList<Character>();
        char[] tempArray = new char[len];
        char first, second, start, other;
        int validCharCount, patternCount = 0, currentCharIndex;
        boolean isValidPattern;
        
        for (char character : s.toCharArray()) {
			if(uniqueCharacters.contains(character)) continue;
			uniqueCharacters.add(character);
		}
        
        for (int char_i = 0; char_i < uniqueCharacters.size() - 1; char_i++) {
        		first = uniqueCharacters.get(char_i);
			for (int char_j = char_i + 1; char_j < uniqueCharacters.size(); char_j++) {
				second = uniqueCharacters.get(char_j);
				System.arraycopy(s.toCharArray(), 0, tempArray, 0, len);
				
				validCharCount = 0;
				start = 0;
				currentCharIndex = 0;
				
				for (int ch_i = 0; ch_i < tempArray.length; ch_i++) {
					if(tempArray[ch_i] == first || tempArray[ch_i] == second) {
						if(start == 0) {
							start = tempArray[ch_i];
							currentCharIndex = ch_i;
						}
						validCharCount++;
						continue;
					}
					tempArray[ch_i] = 0;
				}
				
				if(validCharCount < 2) continue;
				
				start = tempArray[currentCharIndex];
				other = start == first ? second : first;
				
				isValidPattern = true;
				
				for (int ch_i = currentCharIndex; ch_i < tempArray.length; ch_i++) {
					if(tempArray[ch_i] == 0) continue;
					if(currentCharIndex % 2 == 0 && tempArray[ch_i] == start) {
						currentCharIndex++;
						continue;
					}
					else if(currentCharIndex % 2 != 0 && tempArray[ch_i] == other) {
						currentCharIndex++;
					}
					else {
						isValidPattern = false;
						break;
					}
				}
				if(isValidPattern && patternCount < validCharCount) {
					patternCount = validCharCount;				
				}
			}	
		}
        System.out.println(patternCount);
    }
}
