import java.util.Scanner;

class TravelTracker {
   public static void main(String[] args) {

      //Initializing the Scanner object
      Scanner scanner = new Scanner(System.in);

      //Taking name input from the user
      System.out.print("Enter your name: ");
      String name = scanner.nextLine();
      
      //Taking fromCity input from the user
      System.out.print("Enter from city: ");
      String fromCity = scanner.nextLine();
      
      //Taking viaCity input from the user
      System.out.print("Enter via city: ");
      String viaCity = scanner.nextLine();
      
      //Taking toCity input from the user
      System.out.print("Enter to city: ");
      String toCity = scanner.nextLine();
      
      //Taking fromToVia input from the user
      System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
      double fromToVia = scanner.nextDouble();
      
      //Taking viaToFinalCity as input from the user
      System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
      double viaToFinalCity = scanner.nextDouble();
      
      //Taking time taken as input from the user
      System.out.print("Enter time taken in hours: ");
      double timeTaken = scanner.nextDouble();
      
      // Calculating total distance and average speed
      double totalDistance = fromToVia + viaToFinalCity;

      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and " + "the Total Time taken is " + timeTaken + " hours");
      scanner.close();
   }
}