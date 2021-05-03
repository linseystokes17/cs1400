import java.util.Scanner;
/**
 * Calculates the perimeter and area of a triangle
 *
 * @author Linsey Stokes
 * @version 9/1/17
 */
public class Triangle
{
    public static void areaFromSides()
    {
        //Creates Scanner
        Scanner input = new Scanner(System.in);
        //Prompts andssigns a number to a
        System.out.println("Enter the first side");
        double a = input.nextDouble();
        //Prompts and assigns a number to b
        System.out.println("Enter the second side");
        double b = input.nextDouble();
        //Prompts and assigns a number to c
        System.out.println("Enter the third side");
        double c = input.nextDouble();
        //Assigns value to s
        double s = (a+b+c)/2;
        //Calculates the area
        double A = (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        //Prints the area
        System.out.println("The area of the triangle is: " + A);
    }
    public static void perimeter()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first side");
        double a = input.nextDouble();
        System.out.println("Enter the second side");
        double b = input.nextDouble();
        System.out.println("Enter the third side");
        double c = input.nextDouble();
        
        double perimeter = a+b+c;
        System.out.println("The perimeter is: " + perimeter);
    }
}
