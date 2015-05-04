/**
* Same old same old only with methods
* @author Vlad Georgescu
*/
public class CommonFactorsTable
{   
    //Declaring a class variable
    private static int tableSize = 20;

    public static void main(String[] args)
    {   
        //Printing a line on the top of the table
        CommonFactorsTable.printLine();

        //Printing the heading of the table
        CommonFactorsTable.printColumnHeading();

        //Printing the bottom line of the heading
        CommonFactorsTable.printLine();

        //Printing the rows
        for (int row = 2; row <= tableSize; row++) {
            System.out.print("|");
            CommonFactorsTable.printNumber(row);
            System.out.print(" |");
            
            for (int column = 2; column <= tableSize; column++) {
                CommonFactorsTable.printGCD(row, column);
            }
            
            System.out.println(" |");
        }

        //Printing the bottom line of the table
        CommonFactorsTable.printLine();
    }

    //Method for printing lines whenever you need them
    private static void printLine()
    {
        for (int column = 0; column < tableSize; column++) {
            if (column == 0) {
                System.out.print("|-----|");
            } else {
                System.out.print("----");
            }
        }
        System.out.println("-|");   
    }

    //Printing numbers, completing the table rows or heading
    private static void printNumber(int n) 
    {
        System.out.printf("%4d", n);
    }

    //Printing ColumnHeading
    private static void printColumnHeading() 
    {
        for (int column = 1; column <= tableSize; column++) {
            if (column == 1) {
                System.out.print("|     |");
            } else {
                CommonFactorsTable.printNumber(column);
            }
        }
        System.out.println(" |"); 
    }

    //Method to print rows, and also calculate the GCD 
    private static void printGCD(int rowNum, int columnNum)
    {           
        //Calculating GCD
        while(columnNum != rowNum) {
            if(columnNum < rowNum) {
                rowNum -= columnNum;
            } else {
                columnNum -= rowNum;
            }
        }        
        
        //Printing in row
        if (rowNum != 1) {
            System.out.print("---#");
        } else {
            System.out.print("---|");
        }
    }
}
            