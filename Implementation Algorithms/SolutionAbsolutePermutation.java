import java.util.ArrayList;
import java.util.Scanner;

public class SolutionAbsolutePermutation {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int outputAdd, outputSub;
        ArrayList<Integer> output = new ArrayList<Integer>();
        int lowest, highest;
        boolean didAdd;
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            output.clear();
            int[] outputPosition = new int[n];
            
            for (int pos_i = 0; pos_i < n; pos_i++) {
				outputPosition[pos_i] = 0;
				
			}
            
            for (int pos_i = 1; pos_i <= n; pos_i++) {
				
            		outputAdd = pos_i + k;
            		outputSub = pos_i - k;
            		
            		lowest = outputSub > outputAdd ? outputAdd : outputSub;
            		highest = outputSub > outputAdd ? outputSub : outputAdd;
            		didAdd = false;
            		
            		if (lowest > 0 && lowest <= n) {
            			if(outputPosition[lowest - 1] != 1) {
            				output.add(lowest);
            				outputPosition[lowest - 1] = 1;
            				didAdd = true;
            				continue;
            			}
						
				}
            		
            		if (!didAdd && highest > 0 && highest <= n) {
            			if(outputPosition[highest - 1] != 1) {
            				output.add(highest);
            				outputPosition[highest - 1] = 1;
            				didAdd = true;
            				continue;
            			}
            		}
            		
            		if(!didAdd) {
            			output.clear();
            			System.out.print("-1");
            			break;
            		}
            	
			}
            
            for (Integer integer : output) {
				System.out.print(integer + " ");
			}
            System.out.println();
        }
        in.close();
    }

}
