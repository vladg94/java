?**
* Prints the variance of a grup of numbers
* Tested for (2 4 6 8 10), (2 i 4 5 6)
* @author Vlad Georgescu 
*/
public class Variance
{
    public static void main(String[] args)
    {
        int sumSoFar = Integer.parseInt(args[0]);
        double sumOfDeviations = 0;
        
        for (int index = 1; index < args.length; index = index + 1){
            sumSoFar = sumSoFar + Integer.parseInt(args[index]);
        }

        double mean = sumSoFar / (double) args.length;
		
		for (int index = 0; index < args.length; index = index + 1) {
			double deviation = Integer.parseInt(args[index]) - mean;
			double deviationSquare = Math.pow(deviation, 2);
			sumOfDeviations = sumOfDeviations + deviationSquare;
		}

		System.out.println("The mean average is " + mean);
		System.out.println("The variance is " + sumOfDeviations /(double) args.length);
    }
}