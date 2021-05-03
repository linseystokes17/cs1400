
/**
 * Write a description of class Arrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arrays
{
    public static void printArray(int []a)
    {
        int i = 0;
        System.out.print("{");
        while(i<a.length)
        {
            
            if (i<a.length-1)
            {
                System.out.print(a[i]+",");
            }
            else
            {
                System.out.print(a[i]);
            }
            i++;
        }
        System.out.print("}");
    }
    
    public static int sumArray( int [] a)
    {
        int f = 0;
        for (int i = 0; i<a.length; i++)
        {
            int n=a[i];
            f+=n;
        }
        return f;
    }
    
    public static double arrayAverage(int [] a)
    {
        double sum = sumArray(a)/a.length;
        return sum;
    }
    
    public static int endsInThree(int [] a)
    {
        int count=0;
        for (int i = 0; i<a.length; i++)
        {
            if (a[i]%10==3)
            {
                count++;
            }
        }
        return count;
    }
    
    public static void thisOldMan()
    {
        String []num = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String []things={"thumb", "shoe", "knee", "door", "hive", "sticks", "heaven", "gate", "spine", "again"};
        for (int i =0; i<10;i++)
        {
            System.out.println("This old man; he played " + num[i]);
            if (i<9)
            {
                System.out.println("He played knick knack on my " + things[i]);
            }
            else
            {
                System.out.println("He played knick knack once " + things[i]);
            }
            System.out.println("With a knick knack paddywack give a dog a bone");
            System.out.println("This old man came rolling home.\n");
        }
    }
}

