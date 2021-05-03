
/**
 * Write a description of class Quiz3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quiz3
{
    public static int sumSevens(int [] sum)
    {
        int s=0;
        for (int i = 0; i< sum.length; i++)
        {
            if (sum[i]%7==0)
            {
                s+=sum[i];
            }
        }
        return s;
    }
}
