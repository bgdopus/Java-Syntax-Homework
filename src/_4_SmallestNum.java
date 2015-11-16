import java.util.Scanner;


public class _4_SmallestNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double compare = Math.max(a, b);
		double biggest = Math.max(c, compare);
		
		System.out.println(biggest);
		
		
		input.close();
	}

}
