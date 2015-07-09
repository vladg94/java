/**
* Class that use the Roman Number methods
*
* @author Vlad Georgescu 
*/
public class RomanNumberTested
{
    public static void main(String[] args)
    {
        RomanNumber tester1 = new RomanNumber(Integer.parseInt(args[0]));
        RomanNumber tester2 = new RomanNumber(args[1]);
        System.out.println(tester1.convertToRoman());
        System.out.println(tester2.convertToArabic());
    }
}
