public class RomanNumberTested
{
	public static void main(String[] args)
	{
		RomanNumber tester1 = new RomanNumber(123);
		RomanNumber tester = new RomanNumber("XL");
		System.out.println(tester.convertToArabic());
		System.out.println(tester1.convertToRoman());

	}
}