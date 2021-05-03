import java.util.Scanner;
/**
 * Write a description of class Why here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Why
{
    public static void cuz()
    {
        int num = 0;
        Scanner input = new Scanner(System.in);
        
        while (num<=5)
        {
            System.out.println("Enter a question: ");
            String question = input.nextLine();
            System.out.println("Why do you care about the question: " + question);
            num++;
        }
    }
}
