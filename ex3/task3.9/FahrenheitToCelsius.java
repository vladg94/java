/**
* Prints the converted value of Fahrenheit to Celsius 
* Results are always the expected ones
* @author Vlad Georgescu
*/
public class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
        double Fahrenheit = Double.parseDouble(args[0]);
        double Celsius = (5 * Fahrenheit - 160) / 9;

        System.out.println("The converted value is " + Celsius);
    }
}