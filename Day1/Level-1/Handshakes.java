import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args){

        // Initializing Scanner class object 
        Scanner input = new Scanner(System.in);

        // Taking number of students as input 
        System.out.print("Enter the Number of students: ");
        int numberOfStudents = input.nextInt();
        

        // Calculating the total number of possible handshakes
        int totalHandshakes = (numberOfStudents * (numberOfStudents -1))/2;


        System.out.println("The maximum number of handshakes possible are " + totalHandshakes);
        input.close();

    }
    
}
