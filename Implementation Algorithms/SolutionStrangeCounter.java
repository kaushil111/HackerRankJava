import java.util.Scanner;

public class SolutionStrangeCounter {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        in.close();
        
        long timer = 3;
        long previous = 0;
        long start = 0;
        
        while(timer < t) {
            previous = timer;
            timer = 2*timer+ 3;
        }
        
        start = timer - previous;
        System.out.println(start - (t - previous) + 1);
        
        
    }

}
