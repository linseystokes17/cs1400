import java.util.Scanner;
/**
 * All programs within lab2
 *
 * @author Linsey Stokes
 * @version 9/13/2017
 */
public class loops
{
    public static void forRootBeer()
    {
        for (int i=99; i>0; i--)
        {
            System.out.println(i + " bottles of rootbeer on the wall");
            System.out.println(i + " bottles of rootbeer!");
            System.out.println("Take one down, pass it around,");
            System.out.println((i-1) + " bottles of rootbeer on the wall!\n");
        }
    }
    
    public static void removeVowels()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = input.nextLine();
        String noVowels = "";
        for (int i=0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
            }
            else
            {
                noVowels+=s.charAt(i);
            }
        }
        System.out.print("The word without vowels is: " + noVowels);
    }
    
    public static void classAdditionTables()
    {
        for (int i = 0; i<10; i++)
        {
            for (int j = 0; j<10; j++) 
            {
                System.out.print(i+j+"\t");
            }
            System.out.println();
        }
    }
    
    public static void factorial()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial: ");
        //Assign the answer to the variable to f
        int f = 1;
        //Assign user input to variable n
        int n = input.nextInt();
        
        for (int i=n; i>0; i--)
        {
            f*=i;
        }
        System.out.println("The factorial of " + n + "! is: " +f);
    }
    
    public static void printMenu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! What would you like to do?");
        System.out.println("1, Rootbeer");
        System.out.println("2, Remove Vowels");
        System.out.println("3, Addition Tables");
        System.out.println("4, Factorial");
        System.out.println("5, Quit");
        
        int n = input.nextInt();
        
        while(n!=5)
        {
            switch(n)
            {
                case 1: forRootBeer(); break;
                case 2: removeVowels(); break;
                case 3: classAdditionTables(); break;
                case 4: factorial(); break;
                case 5: break;
            }
            System.out.println("\nWhat would you like to do now?");
            System.out.println("1, Rootbeer");
            System.out.println("2, Remove Vowels");
            System.out.println("3, Addition Tables");
            System.out.println("4, Factorial");
            System.out.println("5, Quit");
            n=input.nextInt();
        }
    }
}
