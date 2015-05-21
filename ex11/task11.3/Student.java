/**
* Student class
* @author Vlad Georgescu
*/
public class Student
{   
    //Variables
    private final String name;
    private Phone phoneModel = null; 

    //Constructor 
    public Student(String name)
    {
        this.name = name;
    }

    //Purchase mobile phone method
    public Phone purchasePhone(String name, Account accountName)
    {
        return this.phoneModel = new Phone(name, accountName);
    }

    public String getStudentName()
    {
        return name;
    }

    public String toString()
    {
        return "Student(" + this.getStudentName() + ", " + this.getPhone() + ")";
    }
        
}