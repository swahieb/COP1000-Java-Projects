import java.util.Scanner;

public class Wahieb_Chpt4_Project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double maxWeightkg = 272.16;
		double conversionRate = 0.453592; // 1 pound to kg

		System.out.print("The name of the team is: ");
		String teamName = sc.nextLine();

		System.out.print("Enter the name of member 1: ");
		String name1 = sc.nextLine();
		System.out.print("Enter the weight of member 1 in lbs (must be decimal value): ");
		double weight1 = sc.nextDouble();
		sc.nextLine();

		System.out.print("Enter the name of member 2: ");
		String name2 = sc.nextLine();
		System.out.print("Enter the weight of member 2 in lbs (must be decimal value): ");
		double weight2 = sc.nextDouble();
		sc.nextLine();

		System.out.print("Enter the name of member 3: ");
		String name3 = sc.nextLine();
		System.out.print("Enter the weight of member 3 in lbs (must be decimal value): ");
		double weight3 = sc.nextDouble();
		sc.nextLine();

		double totalWeightlbs = weight1 + weight2 + weight3;
		double totalWeightkg = totalWeightlbs * conversionRate;

		System.out.println("\nTeam " + teamName + " members: " + name1 + ", " + name2 + ", and " + name3);
		System.out.printf("The total weight of the team is %.2f kg", totalWeightkg);

		if (totalWeightkg > maxWeightkg) {
			System.out.println(" and exceeds the maximum.");
		} else {
			System.out.println(" and is under the maximum.");
		}

		sc.close();
	}
}
