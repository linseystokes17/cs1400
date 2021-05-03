import java.util.Scanner;
/**
 * Calculate the volume of a sphere
 *
 * @author: Linsey Stokes
 * @version: 8/30/2017
 */
public class Sphere
{
    public static void volume()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the radius");
        double radius = input.nextInt();
        double volume = (4.0/3.0)* Math.PI * Math.pow(radius,3);
        System.out.println("The volume is " + volume);
    }
}
