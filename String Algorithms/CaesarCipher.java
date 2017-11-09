import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		char[] array = sc.next().toCharArray();
		int offset = sc.nextInt();
		sc.close();
		char ch;
		int currentOffset;
		for (int char_i = 0; char_i < array.length; char_i++) {
			ch = array[char_i];
			if(ch >= 'A' && ch <= 'Z') {
				currentOffset = ch + offset - 'A';
				currentOffset = currentOffset % 26;
				
				array[char_i] = (char) ('A' + currentOffset);
			}
			else if(ch >= 'a' && ch <= 'z') {
				currentOffset = ch + offset - 'a';
				currentOffset = currentOffset % 26;
				
				array[char_i] = (char) ('a' + currentOffset);
			}
		}
		for (char c : array) {
			System.out.print(c);
		}

	}

}
