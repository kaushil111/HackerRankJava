import java.util.Scanner;

public class SolutionOrganizingContainers {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int maxBallType = 0;
        int maxBallContainer = 0;
        int[] maxBallResult;
        int otherMaxContainer = 0;
        long otherContainerCount = 0;
        int otherContainerMaxType = 0;
        int iteration = 0;
        boolean successful = true;
        
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            long[][] M = new long[n][n];
            for(int M_i=0; M_i < n; M_i++){
                for(int M_j=0; M_j < n; M_j++){
                    M[M_i][M_j] = in.nextLong();
                }
            }
            successful = true;
            // your code goes here
            outer:
            for (int mat_i = 0; mat_i < M.length; mat_i++) {
				maxBallResult = findMaxBallTypeInOneContainer(M);
				maxBallType = maxBallResult[1];
				maxBallContainer = maxBallResult[0];
				iteration = 0;
				
				while(findMaxBallTypeInContainer(M[maxBallContainer], -1) != -1) {
					otherMaxContainer = findNextMaxIndex(M, maxBallType);
					if(otherMaxContainer == -1) break;
					if(iteration > M.length) {
						System.out.println("Impossible");
						successful = false;
						break outer;
					}
					
					iteration++;
					
					otherContainerCount = M[otherMaxContainer][maxBallType];
					otherContainerMaxType = findMaxBallTypeInContainer(M[otherMaxContainer], maxBallType);
										
					M[maxBallContainer][maxBallType] += otherContainerCount;
					M[otherMaxContainer][maxBallType] -= otherContainerCount;
					
					if(M[maxBallContainer][otherContainerMaxType] == otherContainerCount) {
						M[otherMaxContainer][otherContainerMaxType] +=  otherContainerCount;
						M[maxBallContainer][otherContainerMaxType] -=  otherContainerCount;
						otherContainerCount = 0;
					}
					else {
						M[otherMaxContainer][otherContainerMaxType] +=  M[maxBallContainer][otherContainerMaxType];
						otherContainerCount -= M[maxBallContainer][otherContainerMaxType];
						M[maxBallContainer][otherContainerMaxType] = 0;
						
						for (int ball_i = 0; ball_i < M.length && otherContainerCount > 0; ball_i++) {
							if(ball_i == otherContainerMaxType || ball_i == maxBallType) continue;
							
							if(M[maxBallContainer][ball_i] >= otherContainerCount) {
								M[maxBallContainer][ball_i] -= otherContainerCount;
								M[otherMaxContainer][ball_i] += otherContainerCount;
								otherContainerCount = 0;
								
							}
						}
					}
				}
				
			}
            if(successful) System.out.println("Possible");
        }
        in.close();
        
	}
	public static int findNextMaxIndex(long[][] mat, int ballType) {
		int index = 0;
		long count = 0;
		for (int row_i = 0; row_i < mat.length; row_i++) {
			if(row_i != ballType && count < mat[row_i][ballType]) {
				count = mat[row_i][ballType];
				index = row_i;
			}
		}
		
		return index;
	}
	public static int[] findMaxBallTypeInOneContainer(long[][] mat) {
		int ballType = 0;
		long count = 0;
		int container = 0;
		
		for (int mat_i = 0; mat_i < mat.length; mat_i++) {
			for (int mat_j = 0; mat_j < mat.length; mat_j++) {
				if(mat[mat_i][mat_j] != mat.length && mat[mat_i][mat_j] > count) {
					count = mat[mat_i][mat_j] ;
					ballType = mat_j;
					container = mat_i;
				}
			}
		}
		int[] result = {container,ballType};
		return result;
	}
	
	public static int findMaxBallTypeInContainer(long[] container, int excludingType) {
		long count = 0;
		int maxBallType = -1;
		
		for (int ball_i = 0; ball_i < container.length; ball_i++) {
			if(ball_i == excludingType) continue;
			if(count < container[ball_i]) {
				count = container[ball_i];
				maxBallType = ball_i;
			}
		}
		
		return maxBallType;
	}

}

//2
//2
//1 1
//1 1
//2
//0 2
//1 1