/**
* Prints the lenght of the fence needed to enclosure the perimeter of the field
* For testing i have used -20 -30 result was innapropiate
* For 2.1 and 3.1 values the program crashed
* For 20 and 30 values the result was the one expected: 100
* @author Vlad Georgescu	
*/
public class FieldPerimeter
{
    public static void main(String[] args)
    {
        int lenght = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int perimeter = 2 * lenght + 2 * width;
        System.out.println("The lenght of the fence is " + perimeter);
    }
}