import java.util.Scanner;


public class _3_PointsInFigure {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		
		String cord = inputScanner.nextLine();
		String[] cordArray = cord.split(" ");
		
		double x = Double.parseDouble(cordArray[0]);
		double y = Double.parseDouble(cordArray[1]);
		
		if (x >= 12.5 && x <= 22.5) {
			if (y >= 6 && y <= 13.5) {
				if ((x > 17.5 && x < 20) && y > 8.5) {
					
					System.out.println("outside");
				}else {
					System.out.println("inside");
				}
			}else {
				System.out.println("outside");
			}
		   
		   
		}else {
			System.out.println("outside");
		}
		
		inputScanner.close();

	}

}
