
/**
 * Write a description of class InClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Homework
{
    public static int minArray(int [] a)
    {
        int n = a[0];
        for (int i=0; i<a.length; i++)
        {
            if (a[i]<=n)
            {
                n=a[i];
            }
        }
        return n;
    }
    
    public static int maxArray(int [] a)
    {
        int n = a[0];
        for (int i=0; i<a.length; i++)
        {
            if (a[i]>=n)
            {
                n=a[i];
            }
        }
        return n;
    }
    
    public static int minIndex(int [] a)
    {
        
        int n=a[a.length-1];
        int index = a[a.length-1];
        for (int i =0; i<a.length; i++)
        {
            if (a[i]<n)
            {
                n=a[i];
                index=i;
            }
        }
        return index;
    }
    public static int maxIndex(int [] a)
    {
        int n=0;
        int index = 0;
        for (int i = 0; i<a.length; i++)
        {
            if (a[i]>n)
            {
                n=a[i];
                index=i;
            }
        }
        return index;
    }
    
    public static int sumOfOdds(int[]a)
    {
        int f = 0;
        for (int i=0;i<a.length; i++)
        {
            if (a[i]%2==1)
            {
                f+=a[i];
            }
        }
        return f;
    }
    
    public static int validEmails(String [] a)
    {
        int count = 0;
        for (int i = 0; i<a.length; i++)

        {
            int psym = 0;
            int atsym=0;
            String b = a[i];
            for (int j=0; j<b.length(); j++)
            {
                if (a[i].charAt(j)=='@')
                {
                    atsym++;
                }
                if (a[i].charAt(j)=='.')
                {
                    psym++;
                }
            }
            if((psym==atsym)&&(psym!=0))
            {
                count++;
            }
        }

        return count;
    }
    
    public static int strongerTeam(int [] strength)
    {
        int a[] = new int[strength.length];
        int b[] = new int[strength.length];
        
        int sumA=0;
        int sumB=0;
        
        int biggest = 0;
        int picks = 0;
        for (int i=0; i<strength.length; i++)
        {   
            biggest=0;
            for (int j = 0; j<strength.length; j++)
            {
                if (strength[i] < strength[j])
                {
                    biggest = strength[j];
                }
                else
                {
                    biggest = strength[i];
                }
            }
            for(int l = 0; l<strength.length; l++)
            {
                if (strength[l]==biggest)
                {
                    strength[l]=0;
                }
            }
            if (picks%2==0)
            {
                a[i]=biggest;
            }
            else if (picks%2==1)
            {
                b[i]= biggest;
            }
            
            picks++;
        }
        for (int k = 0; k<a.length; k++)
        {
            sumA+= a[k];
        }
        for (int k = 0; k<b.length; k++)
        {
            sumB+= b[k];
        }
        return sumA+1-sumB;
        
    }
}

