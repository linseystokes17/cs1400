import java.util.Scanner;
/**
 * Write a description of class reliability here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Testing
{
    public static void reliability()
    {
        //Create Scanner object
        Scanner input = new Scanner(System.in);
        //Prompt user to enter value of lambda
        System.out.println("Please enter the value of lambda, a.k.a the failure rate");
        //Read an int from Scanner and store as an int
        int lambda = input.nextInt();
        //prompt user to enter the time
        System.out.println("Please enter the time");
        //Read int from Scanner and store as an int
        int time = input.nextInt();
        double R= Math.pow(Math.E,- (lambda*time));
        //Print a sentence telling the user probability of Success (R)
        System.out.println("The probability of success is " + R);
        
    }
}
