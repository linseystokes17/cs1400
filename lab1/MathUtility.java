import java.util.Scanner;
/**
 * Performs the quadratic equation and gives an answer
 *
 * @author Linsey Stokes
 * @version 9/1/17
 */
public class MathUtility
{
    public static void solveQuadratic()
    {
        Scanner input = new Scanner(System.in);
        //Assigns a value to a
        System.out.println("Enter the value of a");
        double a = input.nextDouble();
        //Assigns a value to b
        System.out.println("Enter the value of b");
        double b = input.nextDouble();
        //Assigns a value to c
        System.out.println("Enter the values of c");
        double c = input.nextDouble();
        //Performs the calculations
        double square = Math.pow(b,2)-(4*a*c);
        double pos = (b*(-1)+Math.sqrt(square))/(2*a);
        double neg = (b*(-1)-Math.sqrt(square))/(2*a);
        //Prints the positive and negative answers
        System.out.println("The positive square root is: " + pos);
        System.out.println("The negative square root is: " + neg);
    }
}
