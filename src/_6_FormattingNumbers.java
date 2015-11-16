import java.util.Scanner;


public class _6_FormattingNumbers {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		int a = inputScanner.nextInt();
		double b = inputScanner.nextDouble();
		double c = inputScanner.nextDouble();
		
		String hex = Integer.toHexString(a);
		String bin = Integer.toBinaryString(a);
		
		if (c%1 == 0) {
            System.out.printf("|%-10s|%s|%10.2f|%-10.0f|",hex,bin,b,c);
		}else {
            System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",hex,bin,b,c);
		}
		inputScanner.close();
	}

}
