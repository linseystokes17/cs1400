/**
 * Gives a person a name and an age
 *
 * @author Linsey Stokes
 * @version 10/25/2017
 */
public class Person
{
    //instance variables
    private int age;
    private String fName;
    private String lName;
    
    /**
     * Contructor for objects of class Person
     */
    public Person()
    {
        
        this.age=0;
        this.fName="";
        this.lName="";
    }
    /**
     * Contructor for objects of class Person
     */
    public Person(int age, String fName, String lName)
    {
         setAge(age);
         this.fName=fName;
         this.lName=lName;
    }
    /**
     * A setter method for the age variable
     * 
     * @param age  the age of the person
     */
    public void setAge(int a)
    {
        if(age>=0 && age<115)
        {
            age = a; //stores the age
        }
        else{System.out.println("Not a valid age.");}
    }
    /**
     * A setter method for first name variable
     * 
     * @param fName  the first name of the person
     */
    public void setFName(String f)
    {
        this.fName = f; //stores the first name
    }
    /**
     * setter method for last name variable
     * 
     * @param lName  the first name of the person
     */
    public void setLName(String l)
    {
        this.lName = l; //stores the last name
    }
    /**
     * A getter method for age variable
     * 
     * @return  the age of the person
     */
    public int getAge()
    {
        return this.age; //returns age of the person
    }
    /**
     * getter method for first name variable
     * 
     * @return  the fName of the person
     */
    public String getFName()
    {
        return this.fName; //return first name
    }
    /**
     * getter method for last name variable
     * 
     * @return  the lName of the person
     */
    public String getLName()
    {
        return this.lName; //returns last name
    }
}
