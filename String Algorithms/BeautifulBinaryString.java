import java.util.Scanner;

public class BeautifulBinaryString {
	static int minSteps(int n, String B){
        // Complete this function
		int count = 0;
		
		char first = 0, previous = 0, current;
		
		for (int ch_i = 0; ch_i < B.length(); ch_i++) {
			current = B.charAt(ch_i);
			if(first == 0) {
				first = current;
			}
			else if (previous == 0) {
				previous = current;
			}
			else {
				if(first != '0' || previous != '1') {
					first = previous;
					previous = current;
				}
				else {
					if (current == '0') {
						count++;
						first = 0;
						previous = 0;
					}
					else {
						first = previous;
						previous = current;
					}
				}
			}
		}
		
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
        in.close();
    }
}
