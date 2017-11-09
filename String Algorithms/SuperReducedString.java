import java.util.ArrayList;
import java.util.Scanner;

public class SuperReducedString {

	static String super_reduced_string(String s){
        // Complete this function
		ArrayList<Character> charArray = new ArrayList<Character>(s.length());
		for (char c : s.toCharArray()) {
			charArray.add(c);
		}
		
		for (int char_i = 0; char_i < charArray.size() - 1; char_i++) {
			if(charArray.get(char_i) == charArray.get(char_i + 1)) {
				charArray.remove(char_i);
				charArray.remove(char_i);
				char_i = -1;
				continue;
			}
		}
		
		String outputString = "";
		
		for (Character character : charArray) {
			outputString += character;
		}
		
		if(outputString.isEmpty()) {
			outputString = "Empty String";
		}
		
		return outputString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
        in.close();
    }

}
