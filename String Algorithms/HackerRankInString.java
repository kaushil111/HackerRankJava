import java.util.Scanner;

public class HackerRankInString {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int currentIndex = 0;
            
            char[] hackerRank = "hackerrank".toCharArray();
            
            char[] inputArray = s.toCharArray();
            
            for (int char_i = 0; char_i < inputArray.length; char_i++) {
				char c = inputArray[char_i];
				
				if(c==hackerRank[currentIndex]) {
					currentIndex++;
					if(currentIndex == 9) break;
				}
			}
            
            if(currentIndex == 9) System.out.println("YES");
            else System.out.println("NO");
            
        }
        
        in.close();
    }

}
