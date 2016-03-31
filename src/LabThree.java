import java.util.*;

public class LabThree {

	public static void main(String[] args) {
		double x = 0;
		double i = 0;
		double square = 2;
		double cube = 3;
		String keepGoing = "y";

		Scanner scan = new Scanner(System.in);
		
		while (keepGoing.equalsIgnoreCase("y")) {
		System.out.println("Enter a positive integer.");
		x = scan.nextInt();
		scan.nextLine();
		System.out.println("Number \t" + "Squares " + "Cubes");
		for (i = 0; i < x; i++) {
			double resultSqrd = (int) Math.pow(x, square);
			double resultCube = (int) Math.pow(x, cube);
			System.out.println(i + 1 + " \t " + resultSqrd + "\t " + resultCube + " ");
		}
		System.out.println("Would you like to continue? (y/n)");
		keepGoing = scan.next();
		}
		scan.close();

	}
}

