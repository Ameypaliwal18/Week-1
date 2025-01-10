class UniversityDiscountAmount {
	public static void main(String[] args) {
		
		//University's Total Fees and Discount
		int fees = 125000, discountPercent = 10;
		
		//Calculating the Discount 
		int discount = fees * discountPercent / 100;
		
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fees - discount));
		
	}
}