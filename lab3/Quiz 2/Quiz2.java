import java.util.Scanner;
/**
 * Write a description of class Quiz here.
 *
 * @author Linsey Stokes
 * @version (a version number or a date)
 */
public class Quiz2
{
    public static void Palindrome()
    {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String s = "";
        
        for (int i = word.length()-1; i>=0; i--)
        {
            s += word.charAt(i);
        }
        if (word.equals(s))
        {
            System.out.println("Palindrome");
        }
        else{System.out.println("Not a palindrome");}
    }
    
}
