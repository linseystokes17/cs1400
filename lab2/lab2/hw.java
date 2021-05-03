import java.util.Scanner;
/**
 * Write a description of class hw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hw
{
    public static void balanceCurlies()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string with an amount of curly braces: \n");
        String s = input.nextLine();
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '{')
            {
                left++;
            }
            else if (s.charAt(i) == '}')
            {
                right++;
            }
        }
        if (right == left)
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.print("Not balanced");
        }
    }
    
    public static void urlBuilder()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a domain name (Ex: yahoo) \n");
        String s = input.nextLine();
        String url = "";
        s= s.toLowerCase();
        for (int i=0; i<s.length(); i++)
        {
            url = url + s.charAt(i);
        }
        System.out.println("http://www."+url+".com/");
    }
    
    public static void guessingGame()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the max number possible: ");
        int max = input.nextInt();
        System.out.print("\nEnter your guess: ");
        int guess = input.nextInt();
        int i = (int)(Math.random()*max+1);
        
        int n = 1;
        while (guess != i)
        {
            System.out.print("\nThat is the wrong number!");
            if (i>guess)
            {
                System.out.print("\nYour guess was too low. ");
            }
            
            else if (i<guess)
            {
                System.out.print("\nYour guess was too high. ");
            }
            System.out.print("\nTry again!\n");
            guess = input.nextInt();
            n++;
        }
        System.out.print("\nYou Win! The answer was: " + i + "\nYou took " + n +" times to guess!");
        
    }
    
    public static void isPrime()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number ");
        int n = input.nextInt();
        
        int m = 0;
        
        for (int i = 2; i<n; i++)
        {
            if (n%i==0)
            {
                m++;
            }
        }
        if (m != 0)
        {
            System.out.print(n + " is a not prime number");
        }
        else
        {
            System.out.print(n + " is a prime number");
        }
    }
    
    public static void perfectNumber()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to see if it is a perfect number. \n");
        int n = input.nextInt();
        int f = 0;
        for (int i = 1; i < n; i++)
        {
            if (n%i == 0)
            {
                f+=i;
            }
        }
        if (f == n)
        {
            System.out.println(n + " is a perfect number!");
        }
        else
        {
            System.out.println(n + " is not a perfect number.");
        }
    }
    
    public static void pickUp()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("There are 21 stones, enter the amount of stones\n you want to take (has to be less than 3).\n");
        int n = input.nextInt();
        int f=(int)(Math.random()*3);
        int i = 21;
        while(i>=0)
        {
        if((n <4)&&(n>0))
        {
            i = i - n;
            if (i<=0)
            {
                System.out.println("You win!");
                break;
            }
            if (i<=3)
            {
                i=0;
            }
            else
            {
                System.out.println("There are " + i + " stones left.");
                System.out.println("The computer takes " + f+ " stones.");
                i= i - f;
                
            }
            
            if (i<=0)
            {
                System.out.println("You lose.");
                break;
            }
            else{
                System.out.println("There are " + i + " stones, enter the amount of stones you want to take.\n");
                n = input.nextInt();
            }
        }
        else
        {
            System.out.println("That is not a valid number");
            System.out.println("Enter a new number");
            n = input.nextInt();
        }
    }
    
    }
    
        public static void printMenu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! What would you like to do?");
        System.out.println("1, Balance Curlies");
        System.out.println("2, Guessing Game");
        System.out.println("3, Prime");
        System.out.println("4, Perfect number");
        System.out.println("5, Quit");
        
        int n = input.nextInt();
        
        while(n!=5)
        {
            switch(n)
            {
                case 1: balanceCurlies(); break;
                case 2: guessingGame(); break;
                case 3: isPrime(); break;
                case 4: perfectNumber(); break;
                case 5: break;
            }
            System.out.println("\nWhat would you like to do now?");
            System.out.println("1, Balance Curlies");
            System.out.println("2, Guessing Game");
            System.out.println("3, Prime");
            System.out.println("4, Perfect number");
            System.out.println("5, Quit");
            n=input.nextInt();
        }
    }
}
