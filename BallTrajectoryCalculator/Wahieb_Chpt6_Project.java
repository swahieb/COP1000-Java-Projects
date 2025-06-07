import java.util.Scanner;

public class Wahieb_Chpt6_Project {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the height of the building in feet as an integer: ");
		int buildingHeight = scanner.nextInt();

		System.out.print("Enter the initial speed of the ball in ft/sec as a double: ");
		double initialSpeed = scanner.nextDouble();

		System.out.print("Enter the flight time of the ball as a double: ");
		double flightTime = scanner.nextDouble();

		double ballHeight = calcBallHeight(buildingHeight, initialSpeed, flightTime);

		System.out.printf("The ball will be %.2f feet above the ground after %.2f seconds of flight time.%n", ballHeight, flightTime);

		scanner.close();
	}

	public static double calcBallHeight(int buildingHeight, double initialSpeed, double flightTime) {
		return -16 * Math.pow(flightTime, 2) + initialSpeed * flightTime + buildingHeight;
	}
}
