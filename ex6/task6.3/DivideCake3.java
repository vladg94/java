/**
* Prints the number of slices that belongs to every girl
* Tested for 3 45 85; 2 43
* @author Georgescu Vlad
*/
public class DivideCake3
{
    public static void main(String[] args)
    {   
        //Giving integer values for the girls ages
        int age1 = Integer.parseInt(args[0]);
        int age2 = Integer.parseInt(args[1]);
        int age3 = Integer.parseInt(args[2]);

        //The GCD should be made between
        System.out.println("Calculating GCD for\n" + age1 + "\t" 
            + age2 + "\t" + age3);
        
        //The GCD for the first 2 values
        int multiple1OfGCD = age1;
        int multiple2OfGCD = age2;

        while (multiple1OfGCD != multiple2OfGCD) {
            if (multiple1OfGCD < multiple2OfGCD) {
                multiple2OfGCD -= multiple1OfGCD;
            } else {
                multiple1OfGCD -= multiple2OfGCD;
            }
        }

        //The GCD from the 1st GCD and the last Value
        int multiple3OfGCD = age3;

        while (multiple1OfGCD != multiple3OfGCD) {
            if (multiple1OfGCD < multiple3OfGCD) {
                multiple3OfGCD -= multiple1OfGCD;
            } else {
                multiple1OfGCD -= multiple3OfGCD;
            }
        }    
            
        //Printing the GCD
        System.out.println("The GCD is " + multiple1OfGCD);
            
        //Printing the number of portions the cake should be devided
        int noOfSlices1 = age1 / multiple1OfGCD;
        int noOfSlices2 = age2 / multiple1OfGCD;
        int noOfSlices3 = age3 / multiple1OfGCD;

        int totalOfSlices = noOfSlices1 + noOfSlices2 + noOfSlices3;

        System.out.println("The mother needs to divide the cake in "
            + totalOfSlices + " portions");

        //Slices of cake that belongs to every girl
        System.out.println("To the first girl belongs " + noOfSlices1 
            + " slices" + "\n" + "To the second girl belongs " 
            + noOfSlices2 + " slices" + "\n" + "Last girl should get " 
            + noOfSlices3 + " slices");       
    }

}