import java.util.Scanner;

class UniversityDiscountAmount2 {
	public static void main(String[] args) {
		
		//Initializing the scanner class object
		Scanner input = new Scanner(System.in);
		
		//Taking input of Total fee and discount percent
		System.out.print("Enter fee: ");
		int fee = input.nextInt();
		
		System.out.print("Enter Discount-percentage: ");
		int discountPercent = input.nextInt();
		
		//Calculating the discount
		int discount = fee * discountPercent / 100;
		
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee - discount));
		input.close();
		
	}
}