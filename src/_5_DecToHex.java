import java.util.Scanner;


public class _5_DecToHex {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		int dec = inputScanner.nextInt();
		
		String hex = Integer.toHexString(dec);
		
		System.out.printf("%S",hex);
		
		inputScanner.close();

	}

}
