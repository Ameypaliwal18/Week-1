import java.util.Scanner;

class Km_to_miles2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Taking input distance
		double km = input.nextDouble();
		
		//Converting miles into kilometers
		double miles = km / 1.6;
		
		System.out.println("The total miles is " + miles + " miles for the given " + km + " km");
		input.close();
		
	}
}