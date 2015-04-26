/**
* Another version for the first SumOfCubedDigits
* @author Georgescu Vlad
*/
public class SumOfCubedDigits1
{
    public static void main(String[] args)
    {
        for (int hunds = 100; hunds <= 900;  
            hunds = hunds + 100) 
        {    
            int firstDigit = hunds / 100; 
            double firstCube = Math.pow(firstDigit, 3);

            for (int tens = 0; tens <= 90; tens = tens + 10) {
                int secondDigit = tens / 10;
                double secondCube = Math.pow(secondDigit, 3);
                
                for(int units = 0; units <= 9; units++) {
                    double thirdCube = Math.pow(units, 3);
                    
                    int number = hunds + tens + units;
                    double sumOfCubes = firstCube + secondCube
                    + thirdCube;

                    if (number == sumOfCubes) {
                        System.out.println(number);
                    }
                }
            }
        }
    }
}    