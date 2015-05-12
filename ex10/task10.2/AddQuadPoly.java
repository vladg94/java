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

        //Storing the sum of every coeficient into another class variable
        QuadPoly sumOfPolys = new QuadPoly(Double.parseDouble(args[0]) 
            + Double.parseDouble(args[3]), Double.parseDouble(args[1]) 
            + Double.parseDouble(args[4]), Double.parseDouble(args[2]) 
            + Double.parseDouble(args[5]));
        
        //Printing quadratic polynomials 
        //First one
        System.out.print("Polynomyal:    ");
        AddQuadPoly.printPoly(firstPoly.firstCoef, firstPoly.secondCoef, 
            firstPoly.thirdCoef);

        //Second one
        System.out.print("added to:      ");
        AddQuadPoly.printPoly(secondPoly.firstCoef, secondPoly.secondCoef,
            secondPoly.thirdCoef);

        //The sum
        System.out.print("result is:     ");
        AddQuadPoly.printPoly(sumOfPolys.firstCoef, sumOfPolys.secondCoef, 
            sumOfPolys.thirdCoef);
    }

    private static void printPoly (double a, double b, double c)
    {
        System.out.println(a + "x^2 + " + b + "x + " + c);
    }
}