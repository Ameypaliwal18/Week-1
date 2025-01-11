import java.util.Scanner;

public class Swapnumbers {
    public static void main(String[] args) {

        //Initializing the Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Taking number1 and number2 as input from the user 
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        
        // Swapping the numbers
        number1 = number1 + number2 ;
        number2 = number1 - number2 ;
        number1 = number1 - number2 ;        
        System.out.println("The swapped numbers are  "+ number1 +" and " + number2);
        scanner.close();
    }
}