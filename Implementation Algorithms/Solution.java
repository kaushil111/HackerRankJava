import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author kaushilruparelia
 *
 */
public class Solution {
	
	static int[] discovered;

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            int n = in.nextInt();
	            int m = in.nextInt();
	            long x = in.nextLong();
	            long y = in.nextLong();
	            ArrayList<ArrayList<Integer>> roads = new ArrayList<ArrayList<Integer>>(n);
	            
	            for(int list_i =0; list_i <n; list_i++) {
	            		roads.add(new ArrayList<Integer>());
	            }
	            
	            for(int a1 = 0; a1 < m; a1++){
	                int city_1 = in.nextInt();
	                int city_2 = in.nextInt();
	                roads.get(city_1 - 1).add(city_2 - 1);               
	                roads.get(city_2 - 1).add(city_1 - 1);               
	            }
	            if(y>=x) {
	                System.out.println(x*n);
	                continue;
	            }
	            else {
	            	    System.out.println(findCost(roads, x, y));
	            }
	        }
            in.close();
	    }
	 public static long findCost(ArrayList<ArrayList<Integer>> roads, long libraryCost, long roadCost) {
		 System.out.println("----------------------------------------");
		 discovered = new int[roads.size()];
		 int connectedComponents = 0;
		 int totalRoads = 0;
		 
		 for(int city_i = 0; city_i < roads.size(); city_i++) {
			 discovered[city_i] = 0;
		 }
		 
		 
		 for(int city_i = 0; city_i < roads.size(); city_i++) {
			if(discovered[city_i] == 0) {
				connectedComponents++;
				totalRoads += dfs(roads, city_i);
			}
		 }
		 
		 return connectedComponents * libraryCost + roadCost * totalRoads;
	 }
	 
	 public static int dfs(ArrayList<ArrayList<Integer>> roads, int city) {
		 discovered[city] = 1;
		 int roadCount = 1;
		 ArrayList<Integer> cities = roads.get(city);
		 for(int road_i: cities) {
			 if(discovered[road_i] == 0) {
				 roadCount+= dfs(roads, road_i);
                 System.out.println(roadCount);
			 }
			 else {
				 discovered[road_i] = 1;
			 }
		 }
		 return roadCount;
	 }
}

