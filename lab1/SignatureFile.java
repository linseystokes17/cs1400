import java.util.Scanner;
/**
 * Creates an automatic Signature for my information
 *
 * @author Linsey Stokes
 * @version 9/6/2017
 */
public class SignatureFile
{
    public static void info()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your name.");
        String name = input.nextLine();
        
        System.out.println("Enter your address.");
        String address = input.nextLine();
        
        System.out.println("Enter your phone number.");
        String number = input.nextLine();
        
        System.out.println("Enter your e-mail.");
        String email = input.nextLine();
        
        System.out.println("Your E-Signature is: ");
        System.out.println(name);
        System.out.println(address);
        System.out.println(number);
        System.out.println(email);
    }
}
