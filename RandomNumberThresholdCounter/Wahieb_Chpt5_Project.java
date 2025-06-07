import java.util.Random;
import java.util.Scanner;

public class Wahieb_Chpt5_Project {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int userValue;

		while (true) {
			System.out.print("Enter a value between 30 and 70: ");
			userValue = scanner.nextInt();
			if (userValue > 30 && userValue < 70) {
				break;
			}
			System.out.println("The value is out of range. Please reenter.");
		}

		int count = 0;

		for (int i = 0; i < 100; i++) {
			int randomNumber = random.nextInt(101); // Generates number between 0 and 100
			if (randomNumber > userValue) {
				count++;
			}
		}

		System.out.println("There are " + count + " random numbers larger than " + userValue);
		scanner.close();
	}
}
