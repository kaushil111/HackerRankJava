import java.util.Scanner;

public class Gemstones {

	static int gemstones(String[] arr){
        // Complete this function
		int count = 0;
		int[][] totalOccurences = new int[26][arr.length];
		boolean isGem;
		
		for (int occ_i = 0; occ_i < totalOccurences.length; occ_i++) {
			
			for (int occ_j = 0; occ_j < totalOccurences[occ_i].length; occ_j++) {
				totalOccurences[occ_i][occ_j] = 0;
			}
		}
		
		for (int str_i = 0; str_i < arr.length; str_i++) {
			String s = arr[str_i];
			for (int ch_i = 0; ch_i < s.length(); ch_i++) {
				totalOccurences[s.charAt(ch_i) - 'a'][str_i] = 1;
			}
		}
		
		for (int[] is : totalOccurences) {
			isGem = true;
			for (int i : is) {
				if(i == 0) {
					isGem = false;
					break;
				}
			}
			if(isGem) count++;
		}
		
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
        in.close();
    }

}
