import java.util.Scanner;

class PoundToKg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Converting weight in pounds to kilograms
        double weightInKg = weightInPounds / 2.2; // 1 pound = 0.454 kg, so we divide by 2.2 for conversion

        // Output
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKg);
        scanner.close();
    }
}