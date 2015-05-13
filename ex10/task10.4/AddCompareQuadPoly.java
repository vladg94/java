/**
* Prints comparision bewteen two polynomials
* Tested for 2 3 4 3 4 5 
* @author Vlad Georgescu
*/
public class AddCompareQuadPoly
{
    public static void main(String[] args)
    {
        //Creating objects
        //Storing them into clases variables
        QuadPoly firstPoly = new QuadPoly(Double.parseDouble(args[0]), 
            Double.parseDouble(args[1]), Double.parseDouble(args[2]));
        QuadPoly secondPoly = new QuadPoly(Double.parseDouble(args[3]), 
            Double.parseDouble(args[4]), Double.parseDouble(args[5]));

        //Storing the sum of every coeficient into another class variable
        QuadPoly sumOfPolys = new QuadPoly(Double.parseDouble(args[0]) 
            + Double.parseDouble(args[3]), Double.parseDouble(args[1]) 
            + Double.parseDouble(args[4]), Double.parseDouble(args[2]) 
            + Double.parseDouble(args[5]));
        
        System.out.println("First the addition");

        //Printing quadratic polynomials 
        //First one
        System.out.println("Polynomyal:    " + firstPoly.toString());
        
        //Added to
        System.out.println("added to:      " + secondPoly.toString());
        
        //The sum
        System.out.println("result is:     " + sumOfPolys.toString());
        
        System.out.println();

        System.out.println("Now the comparation");

        //Printing quadratic polynomials for comparation
        System.out.println("Polynomyal:    " + firstPoly.toString());

        //Compared to
        System.out.println("compared to:   " + secondPoly.toString());

        if (firstPoly.equals(secondPoly)) {
            System.out.println("Polynomials are equal");
        }

        if (firstPoly.lessThan(secondPoly)) {
            System.out.println("result is:     " + firstPoly.toString());
        } else {
            System.out.println("result is:     " + secondPoly.toString());
        }
    }
}