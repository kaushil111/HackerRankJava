import java.util.Scanner;

public class TheLoveLetterMystery {
	static int theLoveLetterMystery(String s){
		int count =0;
        // Complete this function
		for (int ch_i = 0, ch_j = s.length() - 1; ch_i < ch_j; ch_i++, ch_j--) {
			count += Math.abs(s.charAt(ch_i) - s.charAt(ch_j));
		}
		
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
        in.close();
    }
}
