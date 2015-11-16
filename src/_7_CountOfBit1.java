
import java.util.Scanner;




public class _7_CountOfBit1 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		int number = inputScanner.nextInt();
		String bin = Integer.toBinaryString(number);
		
		long binInt = Long.parseLong(bin);
		
		
		
		int counter = 0;
		for (int i = 0; i < bin.length(); i++) {
			
			long rem = binInt % 10;
			binInt = binInt / 10;
			if (rem == 1) {
				counter++;
			}
		}
		System.out.println(counter);
		
		inputScanner.close();
	}

}
