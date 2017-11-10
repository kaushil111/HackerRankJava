import java.util.Scanner;

public class SolutionCutTheSticks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfCandles = sc.nextInt();
		int[] candles = new int[numberOfCandles];
		
		for(int candle_i = 0; candle_i < numberOfCandles; candle_i++) {
			candles[candle_i] = sc.nextInt();
		}
		
		sc.close();
		
		while(countNonZeros(candles) > 0) {
			System.out.println(countNonZeros(candles));
			reduceSticks(candles, findMin(candles));
		}
		
	}
	public static int countNonZeros(int[] candles) {
		if (candles.length <= 0) return 0;
		
		int count = 0;
		for (int candle_i = 0; candle_i < candles.length; candle_i++) {
			if(candles[candle_i] > 0) count++;
		}
		return count;
	}
	
	public static int findMin(int[] candles) {
		if (candles.length <= 0) return 0;
		
		int min = candles[0];
		for (int candle_i = 1; candle_i < candles.length; candle_i++) {
			if(candles[candle_i] < min) min = candles[candle_i];
		}
		return min;
	}
	
	public static void reduceSticks(int[] candles, int size) {
		for (int candle_i = 0; candle_i < candles.length; candle_i++) {
			if(candles[candle_i] <= size) candles[candle_i] = 0;
			else candles[candle_i] -= size;
		}
	}

}
