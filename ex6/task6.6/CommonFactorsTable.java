/**
* Prints the common factor table for the first 20 numbers
* Doesn`t need testing
* @author Georgescu Vlad
*/
public class CommonFactorsTable
{
    public static void main(String[] args)
    {
        //Top line
        //Left side
        System.out.print("|-----|");
        
        //Right Side
        for (int column = 2; column <= 20; column++) {
            System.out.print("----");
        }

        System.out.println("-|");

        //Creating the heading
        //Left side
        System.out.print("|     |");

        //Right Side
        for (int column = 2; column <= 20; column++) {
            if (column < 10) {
                System.out.print("   " + column);
            } else {
                System.out.print("  " + column);
            }
        }

        System.out.println(" |");

        //Last line of the heading
        //Left side 
        System.out.print("|-----|");

        //Right side
        for (int column = 2; column <= 20; column++) {
            System.out.print("----");
        }

        System.out.println("-|");

        //Now the rows, and also the calculus for GCD
        for (int row = 2; row <= 20; row++) {
            
            if (row < 10) {            
                System.out.print("|   " + row + " |");
            } else {
                System.out.print("|  " + row + " |");
            }
            
            for (int column = 2; column <= 20; column++) {
                
                int subsColumn = column;    
                int subsRow = row;

                while (subsRow != subsColumn) { 
                    if (subsRow < subsColumn) {
                        subsColumn -= subsRow;
                    } else {
                        subsRow -= subsColumn;
                    }
                }

                if (subsRow != 1) {
                    System.out.print("---#");
                } else {
                    System.out.print("---|");
                }
            }
            
            System.out.println(" |");        
        }   
        
        // Finishing the table
        // Left part
        System.out.print("|-----|");

        //Right part
        for (int column = 2; column <= 20; column++) {
            System.out.print("----");
        }

        System.out.println(" |");
    }   
}

