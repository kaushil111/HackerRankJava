import java.util.Scanner;

public class SolutionTaumAndBday {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            
            if(x > z + y) x = z + y;
            if(y > x + z) y = x + z;
            
            System.out.println(x * b + y * w);
            
        }
       in.close();
    }
}
