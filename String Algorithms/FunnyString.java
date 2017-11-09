import java.util.Scanner;

public class FunnyString {

	static String funnyString(String s){
        // Complete this function
		char first,second, reverseFirst, reverseSecond;
		
		for (int char_i = 1, char_j = s.length() - 1; char_i < (s.length() - 1) && char_j > 0 ; char_i++, char_j--) {
			
			second = s.charAt(char_i);
			first = s.charAt(char_i -1);
			reverseSecond = s.charAt(char_j - 1);
			reverseFirst = s.charAt(char_j);
			
			if(Math.abs(second - first) != Math.abs(reverseSecond - reverseFirst)) return "Not Funny";
			}
		
		
		return "Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
        in.close();
    }

}
