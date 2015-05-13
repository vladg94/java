/**
* QuadPoly class
* @author Vlad Georgescu
*/
public class QuadPoly 
{
    private double firstCoef;
    private double secondCoef;
    private double thirdCoef;

    //Constructor of the class QuadPoly 
    public QuadPoly(double firstCoef, double secondCoef,double thirdCoef) 
    {
        this.firstCoef = firstCoef;
        this.secondCoef = secondCoef;
        this.thirdCoef = thirdCoef;
    }

    //Addition method, returning a new QuadPoly object
    public QuadPoly addPoly(QuadPoly other)
    {
        double sumFirstCoef = firstCoef + other.firstCoef;
        double sumSecondCoef = secondCoef + other.secondCoef;
        double sumThirdCoef = thirdCoef + other.thirdCoef;

        return new QuadPoly(sumFirstCoef, sumSecondCoef, sumThirdCoef);
    }

    //Instance method Used for printing the polys
    public String toString()
    {
        return firstCoef + "x^2 + " + secondCoef + "x + " + thirdCoef;
    }
}   