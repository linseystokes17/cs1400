import java.util.Scanner;
/**
 * Finds the Median of 3 numbers
 *
 * @author Linsey Stokes
 * @version 9/6/17
 */
public class MedianOfThree
{
    public static void Median()
    {
        Scanner input = new Scanner(System.in);
        
        //Prompts andssigns a number to a
        System.out.println("Enter the first number");
        double a = input.nextDouble();
        
        //Prompts and assigns a number to b
        System.out.println("Enter the second number");
        double b = input.nextDouble();
        
        //Prompts and assigns a number to c
        System.out.println("Enter the third number");
        double c = input.nextDouble();
        
        if (((a > b) && (a<c)) || ((a < b) && (a>c)))
        {
            System.out.println("The median of those 3 numbers is: " + a);
        }
        else
        {
            if (((b > a) && (b<c)) || ((b < a) && (b>c)))
            {
                System.out.println("The median of those 3 numbers is: " + b);
            }
            else if (((c > a) && (c<b)) || ((c < a) && (c>b)))
            {
                System.out.println("The median of those 3 numbers is: " + c);
            }
        }
    }
}
