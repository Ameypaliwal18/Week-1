import java.util.Scanner;

class TemparatureConversion {
    public static void main(String[] args) {

        //Initializing the Scanner object
        Scanner scanner = new Scanner(System.in);
        
        //Taking temperature as input from the user in form of celcius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Calculating Fahrenheit from celsius 
        double fahrenheitResult = (celsius * 9/5) + 32;

        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
        scanner.close();
    }
}