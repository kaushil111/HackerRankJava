import java.util.Scanner;

public class SolutionJumpingOnTheClouds {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        in.close();
        
        int jumps = 0;
        
        for(int c_i=0; c_i < n-1; c_i++) {
            if((c_i < (n-2)) && c[c_i + 2] == 0) {
            		c_i++;
            		jumps++;
            		continue;
            }
            else if(c[c_i + 1] == 0) {
            		jumps++;
            		continue;
            }
            else {
            		break;
            }
        }
        System.out.println(jumps);
	}

}
