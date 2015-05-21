/**
* Triangle class
* Tested for (2 2) (2 3) (3 4) Offsets 1 2; (2 2) (2 3) (3 4) (1 a);
* @author Vlad Georgescu 
*/
public class Triangle
{   
    //Point variables
    private Point point1;
    private Point point2;
    private Point point3;
    
    //Constructor method
    public Triangle(Point point1, Point point2, Point point3)
    {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    
    //Perimeter method
    public double perimeter() 
    {
        //Perimeter carnat
        return Math.sqrt(Math.pow(this.point1.getX() - this.point2.getX(), 2) 
            + Math.pow(this.point1.getY() - this.point2.getY(), 2))
            + Math.sqrt(Math.pow(this.point2.getX() - this.point3.getX(), 2) 
            + Math.pow(this.point2.getY() - this.point3.getY(), 2)) 
            + Math.sqrt(Math.pow(this.point3.getX() - this.point1.getX(), 2) 
            + Math.pow(this.point3.getY() - this.point1.getY(), 2));
    }
    
    //Area method
    public double area() 
    {
        //Semiperimeter
        double s = this.perimeter() / 2;

        //Area carnat Horners Formula
        return Math.sqrt(s * (s - Math.sqrt(Math.pow(this.point1.getX() - this.point2.getX(), 2) 
            + Math.pow(this.point1.getY() - this.point2.getY(), 2)))
            * (s - Math.sqrt(Math.pow(this.point2.getX() - this.point3.getX(), 2) 
            + Math.pow(this.point2.getY() - this.point3.getY(), 2))) 
            * (s - Math.sqrt(Math.pow(this.point3.getX() - this.point1.getX() , 2) 
            + Math.pow(this.point3.getY() - this.point1.getY(), 2))));
    }
    
    //Method to shift the Triangle points
    public Triangle shift(double x, double y)
    {   
        //Return Shifted triangle
        return new Triangle(
            new Point(this.point1.getX() + x, this.point1.getY() + y), 
            new Point(this.point2.getX()+ x, this.point2.getY() + y), 
            new Point(this.point3.getX()+ x, this.point3.getY() + y)
        );
    }

    public String toString()
    {
        return "Triangle(" + "(" + this.point1.getX() + ", " + this.point1.getY() +")"
            + "(" + this.point2.getX() + ", " + this.point2.getY() + ")" 
            + "(" + this.point3.getX() + ", " + this.point3.getY() + ")";
    }
    
    /*
    public static void main(String[] args)
    {   
        Triangle testTriangle = new Triangle(
            new Point(Double.parseDouble(args[0]), Double.parseDouble(args[1])),
            new Point(Double.parseDouble(args[2]), Double.parseDouble(args[3])),
            new Point(Double.parseDouble(args[4]), Double.parseDouble(args[5]))
        );

        System.out.println(testTriangle);

        System.out.println("Perimeter: " + testTriangle.perimeter());
        
        System.out.println("Area: " + testTriangle.area());
        
        Triangle shiftedTriangle = testTriangle.shift(
            Double.parseDouble(args[6]), 
            Double.parseDouble(args[7])
        );
        
        System.out.println("shiftedTriangle: " + shiftedTriangle);
    }
    */
}