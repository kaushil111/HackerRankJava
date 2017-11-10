import java.util.Scanner;

public class SolutionCavityMap {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[][] grid = new char[n][n];
        char[][] out = new char[n][n];
        
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next().toCharArray();
        }
        in.close();
        
        for (int arr_i = 0; arr_i < grid.length; arr_i++) {
			for (int arr_j = 0; arr_j < grid.length; arr_j++) {
				out[arr_i][arr_j] = grid[arr_i][arr_j];
			}
		}
        
        char currentValue = 0, checkValue = 0;
        boolean isCavity = false;
        
        for (int row = 1; row < grid.length - 1; row++) {
			for(int col = 1; col < grid.length - 1; col++) {
				currentValue = grid[row][col];
				isCavity = true;
				
				checkLoop:
				for (int row_current = row - 1; row_current <= row + 1; row_current++) {
					for (int col_current = col - 1; col_current <= col + 1; col_current++) {
						checkValue = grid[row_current][col_current];
						if(checkValue < '0' || checkValue > '9') continue;
						if(Math.abs(row_current + col_current - col  - row) == 0 || Math.abs(row_current + col_current - col  - row) > 1) continue;
						if(currentValue <= checkValue) {
							isCavity = false;
							break checkLoop;
						}
					}
				}
				
				if(isCavity) {
					out[row][col] = 'X';
				}
				
			}
		}
        
        for (int row = 0; row < grid.length; row++) {
			for(int col = 0; col < grid.length; col++) {
				System.out.print(out[row][col]);
			}
			System.out.println();
        }
        
    }

}



