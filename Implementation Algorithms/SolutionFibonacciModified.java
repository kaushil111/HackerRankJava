
import java.util.*;
import java.math.*;

public class SolutionFibonacciModified {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        
        BigDecimal previous = new BigDecimal(sc.nextLong());
        BigDecimal current = new BigDecimal(sc.nextLong());
        int n = sc.nextInt();
        BigDecimal next = previous.add(current.multiply(current));
        if(n==1) System.out.println(previous);
        if(n==2) System.out.println(current);
        while (n>2) {
            previous = current;
            current = next;
            next = previous.add(current.multiply(current));
            n--;
        }
        sc.close();
        System.out.println(current);
    }
}

