import java.util.Scanner;
/**
 * Write a description of class RPS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RPS
{
    public static void shoot()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 1 for rock; 2 for paper; 3 for scissors");
        
        int Answer = input.nextInt();
        
        int max = 3;
        int min = 1;
        
        int computer = Math.random();
        if (computer == Answer)
        {
            System.out.println("It's a draw!");
        }
        else
        {
            if (((computer == 1) && (Answer == 2)) || ((computer == 2) &&(Answer == 3))|| ((computer == 3) &&(Answer == 1)))
            {
                System.out.println("You lose!");
            }
            else if (((computer == 2) && (Answer == 1)) || ((computer == 3) &&(Answer == 2))|| ((computer == 1) &&(Answer == 3)))
            {
                System.out.println("You win!");
            }
        }
    }
}
