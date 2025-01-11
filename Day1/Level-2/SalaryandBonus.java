import java.util.Scanner;

class SalaryandBonus {
    public static void main(String[] args) {

        //Initializing the Scanner object
        Scanner scanner = new Scanner(System.in);
        
        //Taking salary as input from the user
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        
        //Taking bonus as input from the user
        System.out.print("Enter bonus: ");
        double bonus = scanner.nextDouble();
        
        // Calculating the Total income
        double totalIncome = salary + bonus;

        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
        scanner.close();
    }
}