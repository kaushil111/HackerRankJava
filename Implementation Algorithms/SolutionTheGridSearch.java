import java.util.Scanner;

public class SolutionTheGridSearch {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        boolean didFindPattern = false;
        
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            char[][] G = new char[R][C];
            didFindPattern = false;
            
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next().toCharArray();
            }
            
            int r = in.nextInt();
            int c = in.nextInt();
            char[][] P = new char[r][c];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next().toCharArray();
            }
            
            outer:
            for (int char_i = 0; char_i < R - r; char_i++) {
				for (int char_j = 0; char_j < C - c; char_j++) {
					if(G[char_i][char_j] != P[0][0]) continue;
					
					 didFindPattern = true;
					 inner:
					for (int p_i = 0; p_i < r; p_i++) {
						for (int p_j = 0; p_j < c; p_j++) {
							if(G[char_i + p_i][char_j+p_j] != P[p_i][p_j]) {
								didFindPattern = false;
								break inner;
							}
							
						}
					}
					 if(didFindPattern) break outer;
				}
			}
            
            if(didFindPattern) System.out.println("YES");
            else System.out.println("NO");
        }
        
        in.close();
    }
}
