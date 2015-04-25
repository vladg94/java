/*
* Prints an isosceles triangle in mirror
* tested for 5, 3.2
* @author Vlad Georgescu 
*/
public class TriangleMirror
{
    public static void main(String[] args)
    {
        //The height
        int height = Integer.parseInt(args[0]);
        
        int nextHeight = height;

        for (int row = 1; row <= height; row++) {
                    
            nextHeight = nextHeight - 1;
            
            //Prints the blank cells in the triangle
            for (int index = 1; index < height - nextHeight; index++) {
                System.out.print("   ");
            }

            //Prints the other cells
            for (int index = 1; index <= nextHeight; index++){
                System.out.print("[_]");
            }
        
           System.out.println();    
        }
    }
}
       