public class RomanNumberTested
{
    public static void main(String[] args)
    {
        RomanNumber tester1 = new RomanNumber(123);
        RomanNumber tester2 = new RomanNumber("XL");
        System.out.println(tester1.convertToRoman());
        System.out.println(tester2.convertToArabic());
    }
}