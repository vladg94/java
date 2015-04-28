/**
* Prints the four numbers in the range 100 to 999
* that the sum of their digits cubes equals the num itself
* @author Georgescu Vlad
*/
public class SumOfCubedDigits
{
    public static void main(String[] args)
    {   
        System.out.println("The four magical numbers are: ");

        for(int hunds = 1; hunds <= 9; hunds++) {
            double hundsCube = Math.pow(hunds, 3);

            for (int tens = 0; tens <= 9; tens++) {
                double tensCube = Math.pow(tens, 3);

                for (int units = 0; units <= 9; units++) {
                    double unitsCube = Math.pow(units, 3);

                    int number = hunds * 100 + tens * 10 + units;
                    double sumOfCubes = hundsCube + tensCube + unitsCube;

                    if (number == sumOfCubes) {
                        System.out.println(number);
                    }
                }
            } 
        }
    }    
}

    
