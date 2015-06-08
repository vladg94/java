/**
* Student class
*
* @author Vlad Georgescu
*/
public class Student
{
    private final String studentSurname;
    private final String studentFirstname;
    private final int age;
    private final String nameOfBestFriend;

    /**
    * Constructs a Student object.
    *
    * @param studentSurname a String that gives the surname of the student.
    * @param studentFirstname a String that gives the first name of the student.
    * @param age an integer value that gives the age of the student.
    * @param nameOfBestFriend that gives the name of the student`s best friend.
    */

    public Student(String studentSurname, String studentFirstname, 
        int age, String nameOfBestFriend)
    {
        this.studentSurname = studentSurname;
        this.studentFirstname = studentFirstname;
        this.age = age;
        this.nameOfBestFriend = nameOfBestFriend;
    }

    /**
    * Method to get the age from a student object.
    *
    * @return age an int value.
    */
    public int getAge()
    {
        return this.age;
    }
    /**
    * Method to get the surname from a student object.
    *
    * @return studentSurname a String
    */
    public String getSurname()
    {
        return this.studentSurname;
    }

    /**
    * Method to get firstname from a student object.
    *
    * @return studentFirstname a String
    */
    public String getFirstname()
    {
        return this.studentFirstname;
    }

    /**
    * Method to get the BF`s name from a student object.
    *
    * @return nameOfBestFriend a String.
    */
    public String getBFName()
    {
        return this.nameOfBestFriend;
    }
    /**
    * Prints out a sentence containing all the variables
    *
    * @return String
    */
    public String toString()
    {
        return "Student " + this.studentSurname + " " + this.studentFirstname 
        + " is " + this.age + " years old." + " His best friend is " 
        + this.nameOfBestFriend + ".";
    }
}