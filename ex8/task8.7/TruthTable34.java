/**
* Enough with this tables already (Boolean table)
* @author Vlad Georgescu
*/
public class TruthTable34
{   
    //Printing lines
    private static void printLine()
    {
        System.out.println("________________________________________________________");
    }

    //Printing the heading
    private static void printColumnHeading()
    {
        System.out.println("|   a   |   b   |   c   |   d   |  p1   |  p2   |  p3   |");
        System.out.println("|_______|_______|_______|_______|_______|_______|_______|");
    }

    //First Boolean Expresion
    private static boolean p1(boolean a, boolean b, boolean c, boolean d)
    {
        return (((a || b) && c) || ((b || c) && d)) && (a || d);
    }

    //Second Boolean Expresion
    private static boolean p2(boolean a, boolean b, boolean c, boolean d)
    {
        return a && c || b && d || c && d;
    }

    //Third Boolean Expresion
    private static boolean p3(boolean a, boolean b, boolean c, boolean d)
    {
        return (b || c) && (c || d) && (a || d);
    }

    //Printing Rows
    private static void printRow(boolean a, boolean b, boolean c, boolean d) 
    {
        System.out.println("|" + TruthTable34.formatRowItem(a) + "|" 
            + TruthTable34.formatRowItem(b) + "|" 
            + TruthTable34.formatRowItem(c) + "|" 
            + TruthTable34.formatRowItem(d) + "|" 
            + TruthTable34.formatRowItem(TruthTable34.p1(a, b, c, d)) + "|"
            + TruthTable34.formatRowItem(TruthTable34.p2(a, b, c, d)) + "|"
            + TruthTable34.formatRowItem(TruthTable34.p3(a, b, c, d)) + "|");
    }

    //Method that returns a string
    private static String formatRowItem(boolean row)
    {
        return row ? " true  " : " false ";
    }

    public static void main(String[] args) 
    {   
        //Creating table
        TruthTable34.printLine();
        TruthTable34.printColumnHeading();

        //Setting boolean variables to true 
        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean d = true;

        //Using for loops, to fill the cells
        for(int aCount = 1; aCount <= 2; aCount++, a = !a) {
            for(int bCount = 1; bCount <= 2; bCount++, b = !b) {
                for(int cCount = 1; cCount <= 2; cCount++, c = !c) {
                    for(int dCount = 1; dCount <= 2; dCount++, d = !d)
                        TruthTable34.printRow(a, b, c, d);
                }
            }
        }
        
        TruthTable34.printLine();
    }
}