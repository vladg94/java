/**
* Circle class
* Tested for (1 2) 3 and Offsets 4 5.1; (1 a) 17 1000 1000
* @author Vlad Georgescu 
*/
public class Circle
{   
    private double radius;
    private Point centrePoint;
    
    //Circel Constructor
    public Circle(Point centrePoint, double radius)
    {
        this.centrePoint = centrePoint;
        this.radius = radius;
    }

    //Method that calculates perimeter
    public double  perimeter() 
    {
        return 2 * Math.PI * this.radius;
    }
    
    //Method that calculates area
    public double area() 
    {
        return Math.PI * Math.pow(this.radius, 2); 
    }
    
    //Method that return the shifted point of circle
    public Circle shift(double x, double y)
    {   
        //Return centrePoint shifted
        return new Circle(
            new Point(this.centrePoint.getX() + x, this.centrePoint.getY() + y), 
            this.radius
        );
    }

    public String toString()
    {
        return "Circle with centre in (" + this.centrePoint.getX() 
            + ", " + this.centrePoint.getY() + ") and the radius " + this.radius;  
    }

    /*
    public static void main(String[] args)
    {
        Circle testCircle = new Circle(
            new Point(Double.parseDouble(args[0]), Double.parseDouble(args[1])),
            Double.parseDouble(args[2])
            );

        System.out.println(testCircle);

        System.out.println("Perimeter: " + testCircle.perimeter());

        System.out.println("Area: " + testCircle.area());

        Circle shiftedCircle = testCircle.shift(
            Double.parseDouble(args[3]), 
            Double.parseDouble(args[4])
        );
    }
    */
}