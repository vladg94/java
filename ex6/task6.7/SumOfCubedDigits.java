/*
* Prints the four numbers in the range 100 to 999
* that the sum of their digits cubes equals the num itself
* @author Georgescu Vlad
*/
public class SumOfCubedDigits
{
    public static void main(String[] args)
    {
        for (int num = 100; num <= 999; num++) {
            int compNum = num;
            
            int last = compNum % 10;
            double powLast = Math.pow(last, 3);

            compNum = compNum / 10;

            int second = compNum % 10;
            double powSecond = Math.pow(second, 3);

            int first = compNum / 10;
            double powFirst = Math.pow(first, 3);

            double sumOfCubes = powFirst + powSecond + powLast;

            if (sumOfCubes == num) {
                System.out.println(num);
            }
        }     
    }        
}



    
