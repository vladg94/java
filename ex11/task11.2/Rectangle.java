/*
* Rectangle class
* @author Vlad Georgescu
*/
public class Rectangle
{   
    //Point variables
    private Point point1;
    private Point point2;

    //First Constructor
    public Rectangle(Point point1, Point point2)
    {
        this.point1 = point1;
        this.point2 = point2;
    }

    //Perimeter method
    public double perimeter()
    {
        //Return perimeter
        return 2 * (Math.abs(this.point1.getX() - this.point2.getX())
            +  Math.abs(this.point1.getY() - this.point2.getY()));
    };
    
    //Area method
    public double area()
    {
        //Return area
        return Math.abs(this.point1.getX() - this.point2.getX()) 
            * Math.abs(this.point1.getY() - this.point2.getY());
    }
    
    //Method used for shifting the shape 
    public Rectangle shift(double x, double y)
    {
        //Returning value of the rectangle
        return new Rectangle(new Point(this.point1.getX() + x, this.point1.getY() + y),
            new Point(this.point2.getX() + x, this.point2.getY() + y));
    }

    public String toString()
    {
        return "Rectangle(" + "(" + this.point1.getX() + ", " + this.point1.getY() +")"
            + "(" + this.point1.getX() + ", " + this.point2.getY() + ")" 
            + "(" + this.point2.getX() + ", " + this.point1.getY() + ")"
            + "(" + this.point2.getX() + ", " + this.point2.getY() + ")" + ")";

    }
}