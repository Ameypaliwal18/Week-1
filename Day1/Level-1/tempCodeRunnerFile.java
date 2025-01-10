import java.util.Scanner;

class DistanceInYards {
    public static void main(String[] args){

        // Initializing Scanner class object 
        Scanner input = new Scanner(System.in);

        // Taking input distance in feet
        System.out.print("Enter the Distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Converting the distance in yards and miles 
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;


        System.out.println("The distance in yards is " + distanceInYards + " and the distance in Miles is " + distanceInMiles);
        input.close();

    }
}