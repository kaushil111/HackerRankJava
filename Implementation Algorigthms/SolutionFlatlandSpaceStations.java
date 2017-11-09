import java.util.Scanner;

public class SolutionFlatlandSpaceStations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberOfCities = sc.nextInt();
		int numberOfSatellites = sc.nextInt();
		int[] satelliteCities = new int[numberOfSatellites];
		int highestDistance = 0;
		int minimumDistance = numberOfCities;
		
		for (int city_i = 0; city_i < satelliteCities.length; city_i++) {
			satelliteCities[city_i] = sc.nextInt();
		}
		sc.close();
		
		for (int city_i = 0; city_i < numberOfCities; city_i++) {
			minimumDistance = numberOfCities;
			
			for (int sat_i = 0; sat_i < satelliteCities.length; sat_i++) {
				if(minimumDistance > Math.abs(satelliteCities[sat_i] - city_i)) {
					minimumDistance = Math.abs(satelliteCities[sat_i] - city_i);
					if(minimumDistance == 0) break;
				}
			}
			if(highestDistance < minimumDistance) highestDistance = minimumDistance;
		}
		System.out.println(highestDistance);

	}

}
