import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for principle
        System.out.print("Enter Principal amount: ");
        double principle = scanner.nextDouble();
        
        // Taking input for rate 
        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();
        
        // Taking input for time
        System.out.print("Enter Time in years: ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principle * rate * time) / 100;

        // Output
        System.out.println("The Simple Interest is " + simpleInterest + " for Principle " + principle + ", Rate of Interest " + rate + " and Time " + time);
        
        scanner.close();
    }
}