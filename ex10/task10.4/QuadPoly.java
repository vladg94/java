/**
* QuadPoly class
* @author Vlad Georgescu
*/
public class QuadPoly 
{
    public double firstCoef;
    public double secondCoef;
    public double thirdCoef;

    public QuadPoly(double firstCoef, double secondCoef,double thirdCoef) 
    {
        this.firstCoef = firstCoef;
        this.secondCoef = secondCoef;
        this.thirdCoef = thirdCoef;
    }

    public boolean equals(QuadPoly other)
    {
        return firstCoef == other.firstCoef && secondCoef == other.secondCoef
            && thirdCoef == other.thirdCoef;
    }

    public boolean lessThan(QuadPoly other)
    {
        return firstCoef < other.firstCoef 
            || firstCoef == other.firstCoef
                && (secondCoef < other.secondCoef 
                    || secondCoef == other.secondCoef && thirdCoef < other.thirdCoef);
    }

    public String toString()
    {
        return firstCoef + "x^2 + " + secondCoef + "x + " + thirdCoef;
    }
}   