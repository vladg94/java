/**
* Exercitiu de cacat
* Prints 27 combinations of weighing some gold 
* The values that produced weighings in [-13, 13] are 3, 4, 6
* Tested for other values too
* For float values crashes
* @author Vlad Georgescu
*/
public class ThreeWeights
{
    public static void main(String[] args)
    {   int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println((-1) * (a + b + c));
        System.out.println((-1) * (a + b));
        System.out.println((-1) * (a + b) + c);
        System.out.println((-1) * (a + c));
        System.out.println((-1) * a);
        System.out.println((-1) * a + c);
        System.out.println((-1) * (a + c) + b);
        System.out.println((-1) * a + b);
        System.out.println((-1) * b + c);
        System.out.println((-1) * b + c);
        System.out.println((-1) * b);
        System.out.println((-1) * b + c);
        System.out.println((-1) * c);
        System.out.println();
        System.out.println(c);
        System.out.println(b);
        System.out.println(b + c);
        System.out.println(a + (-1) * (b+c));
        System.out.println(a + (-1) * b);
        System.out.println(a + c + (-1) * b);
        System.out.println(a + (-1) * c);
        System.out.println(a);
        System.out.println(a + c);
        System.out.println(a + b + (-1) * c);
        System.out.println(a + b);
        System.out.println(a + b + c);
    }
}