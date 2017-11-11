import java.util.Scanner;

public class GameOfThrones {

	static String gameOfThrones(String s){
        // Complete this function
		
		int[] firstChars = new int[26];
		boolean didFindOddChars= false;
		
		for (char c : s.toCharArray()) {
			firstChars[c - 'a']++;
		}
		
		for (int ch_j = 0; ch_j < firstChars.length; ch_j++) {
			if(firstChars[ch_j] % 2 == 0) continue;
			else if(!didFindOddChars) didFindOddChars = true;
			else return "NO";
		}
		
		
		return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
        in.close();
    }

}
