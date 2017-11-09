import java.util.Scanner;

public class SolutionRepeatedString {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] array = in.next().toCharArray();
        long n = in.nextLong();
        int countA = 0;
        int countAInArray = 0;
        
        for (int char_i = 0; char_i < array.length; char_i++) {
        		if(array[char_i] == 'a') countAInArray++;
		}
        in.close();
        
        countA = (int)Math.floor(array.length / n) * countAInArray;
        long remainder = array.length % n;
        
        for(int char_i = 0; char_i < remainder; char_i++) {
        		if(array[char_i] == 'a') countA++;
        }
        System.out.println(countA);
    }
}
