/**
* Prints round numbers 
* The results the ones expected for every given value
* @author Vlad Georgescu
*/
public class RoundPenises
{
    public static void main(String[] args)
    {
        int numberOfPennies = Integer.parseInt(args[0]);
        int pounds;

        pounds = (numberOfPennies + 50) / 100;

        System.out.println("The girl have " + pounds + " pounds");
    }
}