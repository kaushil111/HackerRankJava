import java.util.Scanner;

public class SolutionMarsExploration {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] sosArray = in.next().toCharArray();
        int position;
        int modifiedCharsCount = 0;
        for(int char_i = 0; char_i < sosArray.length; char_i++) {
        		position = char_i % 3;
        		
        		switch (position) {
				case 0:
				case 2:
					if(sosArray[char_i] != 'S') modifiedCharsCount++;
					break;

				case 1:
					if(sosArray[char_i] != 'O') modifiedCharsCount++;
					break;
				
				default:
					break;
				}
        }
        System.out.println(modifiedCharsCount);
        in.close();
    }
}
