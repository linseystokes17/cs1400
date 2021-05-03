
/**
 * Write a description of class GroupWork here.
 *
 * @author Linsey: I swim
 *          Mike Howe: Has an orange pen
 *          Justin J: Took summer classes for college
 *          Conner C: Can legally marry people under the Flying Spaghetti Monster
 * @version (a version number or a date)
 */
public class GroupWork
{
    public static int[] sort(int [] array)
    {
        int temp=0;
        for (int i =0; i <array.length; i++)
        {
            for (int j = i; j<array.length; j++)
            {
                if ( array[i]> array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
    
    
}
