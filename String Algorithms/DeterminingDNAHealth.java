import java.util.Scanner;

public class DeterminingDNAHealth {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] genes = new String[n];
        for(int genes_i=0; genes_i < n; genes_i++){
            genes[genes_i] = in.next();
        }
        int[] health = new int[n];
        for(int health_i=0; health_i < n; health_i++){
            health[health_i] = in.nextInt();
        }
        int s = in.nextInt();
        long highest = 0, lowest = -1;
        
        for(int a0 = 0; a0 < s; a0++){
            int first = in.nextInt();
            int last = in.nextInt();
            String d = in.next();
            // your code goes here
            int currentIndex;
            long currentCount = 0;
            int[] charCount = new int[26];
            
            for (int ch_i = 0; ch_i < d.length(); ch_i++) {
				charCount[d.charAt(ch_i) - 'a']++;
			}
            
            for (int dna_i = first; dna_i <= last; dna_i++) {
            	
            		if(charCount[genes[dna_i].charAt(0) - 'a'] == 0) continue;
				
            		currentIndex = 0;
            		while(d.indexOf(genes[dna_i], currentIndex) != -1) {
            			currentCount += health[dna_i];
            			currentIndex = d.indexOf(genes[dna_i], currentIndex);
            			currentIndex++;
            		}
			}
            
            if(highest < currentCount) highest = currentCount;
            if(lowest > currentCount || lowest == -1) lowest = currentCount;
            
        }
        System.out.println(lowest + " " + highest);
        in.close();
    }
}
