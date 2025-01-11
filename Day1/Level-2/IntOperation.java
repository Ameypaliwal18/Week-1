import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {

        //Initializing the Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Taking input a from the user
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        
        // Taking input b from the user
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        
        // Taking input c from the user
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();
        
        // Calculating the given equation
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        
        // Printing the respective output stored in result1, result2, result3 and result4
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + " and " + result4 );        
        scanner.close();
    }
}