/**
* Circle class
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
        return new Circle(new Point(this.centrePoint.getX() + x, 
            this.centrePoint.getY() + y), this.radius);
    }

    public String toString()
    {
        return "Circle with centre in (" + this.centrePoint.getX() 
            + ", " + this.centrePoint.getY() + ") and the radius " + this.radius;  
    }
}