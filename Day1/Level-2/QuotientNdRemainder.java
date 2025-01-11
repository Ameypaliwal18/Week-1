import java.util.Scanner;

class QuotientNdRemainder {
    public static void main(String[] args) {

        //Initializing the Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Taking input number1 from the user
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        
        // Taking input number2 from the user
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        
        // Calculating Quotient 
        int quotient = number1 / number2;
        
        // Calculating remainder 
        int remainder = number1 % number2;
        
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
        
        scanner.close();
    }
}