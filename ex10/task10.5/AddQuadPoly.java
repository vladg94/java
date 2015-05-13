/**
* Prints sum of 2 quadratic polynomials
* Tested for 6 4 3 2 1 5, a 4 5 6 8 9
* @author Vlad Georgescu 
*/
public class AddQuadPoly 
{   
    public static void main(String[] args) 
    {
        //Creating objects
        //Storing them into clases variables
        QuadPoly firstPoly = new QuadPoly(Double.parseDouble(args[0]), 
            Double.parseDouble(args[1]), Double.parseDouble(args[2]));
        QuadPoly secondPoly = new QuadPoly(Double.parseDouble(args[3]), 
            Double.parseDouble(args[4]), Double.parseDouble(args[5]));

        QuadPoly sumOfPolys = firstPoly.addPoly(secondPoly);

        //Printing quadratic polynomials 
        //First one
        System.out.print("Polynomyal:    ");
        System.out.println(firstPoly);

        //Second one
        System.out.print("added to:      ");
        System.out.println(secondPoly);

        //The sum
        System.out.print("result is:     ");
        System.out.println(sumOfPolys);
    }
}