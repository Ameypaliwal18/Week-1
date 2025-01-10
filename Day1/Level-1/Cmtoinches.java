import java.util.Scanner;

class Cmtoinches {
	public static void main(String[] args) {
		
		//Initializing scanner class object
		Scanner input = new Scanner(System.in);
		
		//Taking input for height from the user
		System.out.print("Enter your height(in cm): ");
		int heightInCm = input.nextInt();
		
		//Converting cm to inches
		double inches = heightInCm/2.54;
		
		//Converting inches into feet
		double feet = inches/12;
		
		System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches in " + inches);
		input.close();
		
	}
}