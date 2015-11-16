import java.util.Scanner;


public class _8_CountBitPairs {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		int number = inputScanner.nextInt();
		String bin = Integer.toBinaryString(number);
		
		long binInt = Long.parseLong(bin);
		
		
		
		Long[] array = new Long[bin.length()];
		
		for (int i = 0; i < bin.length(); i++) {
			
			long rem = binInt % 10;
			binInt = binInt / 10;
			
			array[i] = rem;
		}
		
		int counter = 0;
		for (int j = 0; j < array.length - 1; j++) {
			if (array[j] == array[j+1]) {
				counter++;
			}
		}
		
		System.out.println(counter);
		
		inputScanner.close();
	}

}
