import java.util.Scanner;

class ChocolateDistributions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        
        // Taking input for number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calculating chocolates per child and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Output
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
        
        scanner.close();
    }
}