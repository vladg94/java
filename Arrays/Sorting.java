/**
* Sort the elements of an array
*
*
*/
public class Sorting
{
    //Helper Method, printing an array.
    private void printArray(Student[] anArray)
    {
        for (int index = 0; index < anArray.length; index++) {
            System.out.println(anArray[index]);
        }
    }

    //Helper method, sorting array by lenght
    private void sortByAge(Student[] anArray)
    {
        //Printing the array before sorting.
        System.out.println("We will sort this array by age: ");
        this.printArray(anArray);

        //Algorithm to sort the array
        int unsortedLength = anArray.length;
        boolean changedOnThisPass;

        do {
            changedOnThisPass = false;
            for (int index = 0; index < unsortedLength - 1; index++) {
                if (anArray[index].getAge() > anArray[index + 1].getAge()) {
                    Student theValueAtTheIndex = anArray[index];
                    anArray[index] = anArray[index + 1];
                    anArray[index + 1] = theValueAtTheIndex;
                    changedOnThisPass = true;
                }
            }
        } while (changedOnThisPass);

        this.printArray(anArray);

    }

    public static void main(String[] args)
    {   
        //Creating the array.
        Student[] arrayOfStudents = {
            new Student("Baros", "Costel", 21, "Dragnea"),
            new Student("Dragnea", "Liviu", 20, "Ponta"),
            new Student("Guran", "Moise", 19, "Patraru"),
            new Student("Mihai", "Raluca", 21, "Baros"),
            new Student("Patraru", "Dragos", 18, "Moise"),
            //See what i did here?
            new Student("Ponta", "Mickey", 38, "Dragnea"),
            new Student("Dan", "Sova", 15, "Mihai"),
            new Student("Gica", "Contra", 23, "Ghitescu"),
            new Student("Ghitescu","Radu", 20, "Ponta"),
            new Student("Georgescu", "Vlad", 20, "Baros")
        };
    
        Sorting.sortByAge(arrayOfStudents);
    }
}
