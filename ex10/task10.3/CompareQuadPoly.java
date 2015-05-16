/**
* Prints comparision bewteen two polynomials
* Tested for 2 3 4 3 4 5 
* @author Vlad Georgescu
*/
public class CompareQuadPoly
{
    public static void main(String[] args)
    {
        QuadPoly firstPoly = new QuadPoly(Integer.parseInt(args[0]), 
            Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        QuadPoly secondPoly = new QuadPoly(Integer.parseInt(args[3]),
            Integer.parseInt(args[4]), Integer.parseInt(args[5]));

        if (firstPoly.equals(secondPoly)) {
            System.out.println("The two polynomials are the same");
        } else if (firstPoly.lessThan(secondPoly)) {
            System.out.println("The first polynomial is less than the second");
        } else {
            System.out.println("AM PULA MARE");
        }
    }
}