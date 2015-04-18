/**
* Prints the surface area of a tank and the lenght of the edges
* Contained calculus errors
* Errors fixed
* For values (3.2, 2.5, 0)/(1.2, 2.2, 3.1) program crashed 
* For values (10, 20, 30) the result was the exepcted one
* Also tested with negative numbers, inappropiate result
* @author Vlad Georgescu 
*/
public class FishTankMaterials
{
    public static void main(String[] args)
    {
        int width = Integer.parseInt(args[0]);
        int depth = Integer.parseInt(args[1]);
        int height = Integer.parseInt(args[2]);

        int surfaceArea = 2 * ( width * height + width * depth + height * depth);
        
        int edgesLenght = 4 * ( width + depth + height );

        System.out.println("The surface area of a tank with dimensions " 
                           + "(" + width + "," + depth + "," + height + ") "  
                           + "is " + surfaceArea);

        System.out.println("The lenght of the edges of a tank with dimensions "
                           + "(" + width + "," + depth + "," + height + ") "
                           + "is " + edgesLenght);                   

    }
}