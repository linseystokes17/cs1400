
/**
 * Calculates the area of a rectangle
 *
 * @author: Linsey Stokes
 * @version: 8/30/2017 
 */
import java.util.Scanner;
public class Rectangle
{
    public static void area()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length of base");
        int length=input.nextInt();
        System.out.println("Please enter height");
        int height=input.nextInt();
        int area = height*length;
        System.out.println("The area is " + area);
    }
}
