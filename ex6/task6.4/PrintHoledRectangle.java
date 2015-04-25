/*
* Prints a rectangle with a hole in the center
* tested for 
* @author Vlad Georgescu 
*/
public class PrintHoledRectangle
{
    public static void main(String[] args)
    {
        //The width and height of a rectangle in cells
        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);

        //Assure that numbers are odd
        width = (width / 2 ) * 2 + 1;
        height = (height / 2) * 2 + 1;

        System.out.println("The width is " + width + "\n" 
            + "The height is " + height + "\n");

        //For counting the number of cells before printing them
        int index = 0;

        for (int row = 1; row <= height; row++) {
            for (int column = 1; column <= width; column++) {
                index++;
                if (index == height*width/2 + 1) {
                    System.out.print("   ");
                } else {
                System.out.print("[_]");
                }
             }
            System.out.println();    
        }
    }
}