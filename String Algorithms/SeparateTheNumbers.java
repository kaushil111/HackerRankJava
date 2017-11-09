import java.math.BigDecimal;
import java.util.Scanner;

public class SeparateTheNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		
		for(int a0 = 0; a0 < q; a0++){
			char[] array = sc.next().toCharArray();
			
			
			String first = "", second = "";
			BigDecimal firstNumber = new BigDecimal(0), secondNumber = new BigDecimal(0);
			BigDecimal sub = new BigDecimal(0);
			boolean isPattern = false;
			BigDecimal number= null, previous = null;
			BigDecimal one = new BigDecimal(1);
			
			for (int arr_i = 0; arr_i < array.length - 1; arr_i++) {
				
				if(first.equals("") && array[arr_i] == '0') {
					break;
				}
				
				first += array[arr_i];
				firstNumber = new BigDecimal(first);
				
				if(previous != null && previous.subtract(firstNumber).intValue() != 1) {
					first = previous.toString() + first;
					if(number.equals(previous)) number = null;
					previous = null;
					isPattern = false;
					firstNumber = new BigDecimal(first);
				}
				
				second = "";
				
				for (int arr_j = arr_i + 1; arr_j < array.length; arr_j++) {
					
					if(second.equals("") && array[arr_j] == '0') {
						first += "0";
						firstNumber = new BigDecimal(first); 
						arr_i++;
						continue;
					}
					
					second += array[arr_j];
					secondNumber = new BigDecimal(second);
						
					sub = secondNumber.subtract(firstNumber);
					
					if(sub.equals(one)) {
						if(number == null) number = firstNumber;
						else if(number.compareTo(firstNumber) > 0) number = firstNumber;
								
						previous = firstNumber;
						first = second;
						firstNumber = secondNumber;
						second = "";
						arr_i = arr_j;
						
						isPattern = true;
						continue;
						
					}
					else if(sub.compareTo(one) == 1) {
						isPattern = false;
						break;
					}
					
				}
				
			}
			
			if(isPattern && sub.compareTo(one) != 0) isPattern = false;
			
			if(!isPattern) System.out.println("NO");
			else System.out.println("YES " + number);
			
        }
		sc.close();

	}

}
