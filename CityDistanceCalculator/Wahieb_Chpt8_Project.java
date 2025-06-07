import java.util.Scanner;

public class Wahieb_Chpt8_Project {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] cities = new String[2];
		System.out.print("Enter the first city: ");
		cities[0] = scanner.nextLine();
		System.out.print("Enter the second city: ");
		cities[1] = scanner.nextLine();

		double[][] coordinates = new double[2][2];
		System.out.print("Enter latitude and longitude of first city (e.g., 28.8 81.2): ");
		coordinates[0][0] = scanner.nextDouble();
		coordinates[0][1] = scanner.nextDouble();

		System.out.print("Enter latitude and longitude of second city (e.g., 30.1 82.9): ");
		coordinates[1][0] = scanner.nextDouble();
		coordinates[1][1] = scanner.nextDouble();

		double distance = calcDistance(coordinates);

		System.out.printf("The distance between %s and %s is %.2f miles.%n", cities[0], cities[1], distance);

		scanner.close();
	}

	public static double calcDistance(double[][] list) {
		double xValue = (list[0][1] - list[1][1]) * 55;
		double yValue = (list[0][0] - list[1][0]) * 69;
		return Math.sqrt(xValue * xValue + yValue * yValue);
	}
}
