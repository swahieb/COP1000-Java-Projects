import java.util.Scanner;

public class Wahieb_Chpt2_Project {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
      
		System.out.print("Enter the average miles per hour (mph) for the car (this must be an integer): ");
		int averageSpeed = input.nextInt();
      
		System.out.print("Enter the distance in miles the trip is (this must be a double): ");
		double tripDistance = input.nextDouble();
        
		double tripTime = tripDistance / averageSpeed;
        
		System.out.println("The trip will take the following number of hours: " + tripTime);
	
		input.close();
	}
}
