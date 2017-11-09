import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SolutionManasaStones {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        int stones, a, b, lastElement;
        TreeSet<Integer> values = new TreeSet<Integer>();
        
        for (int test = 0; test < tests; test++) {
			stones = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			values.removeAll(values);
			
			values.add(a*(stones - 1));
			values.add(b*(stones - 1));
			
			for (int stone_i = 0; stone_i < stones - 1; stone_i++) {
				lastElement = 0;
				for (int stone_j = 0; stone_j < stones - 1; stone_j++) {
					if(stone_j > stone_i) lastElement += a;
					else lastElement += b;
				}
				values.add(lastElement);
				
			}
						
			for (Iterator<Integer> iterator = values.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				System.out.print(integer + " ");
			}
			System.out.println();
		}
        sc.close();
    }
	
}
