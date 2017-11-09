import java.util.Scanner;
import java.util.TreeSet;

public class WeightedUniformStrings {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] inputArray = in.next().toCharArray();
        
        char previous = 0;
        int currentCount = 0;
        TreeSet<Integer> values = new TreeSet<Integer>();
        
        for (char c : inputArray) {
			if(c == previous) {
				currentCount++;
				values.add(currentCount * (c - 'a' + 1));
			}
			else {
				values.add( c - 'a' + 1);
				currentCount = 1;
				previous = c;
			}
		}
        
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            // your code goes here
            
            if (values.contains(x)) System.out.println("Yes");
            else System.out.println("No");
            
        }
        in.close();
    }

}
