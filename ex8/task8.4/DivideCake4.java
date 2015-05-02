/**
* Old DivideCake only with a separate method
* Tested for 10 20 30 40, 10.1 20 30 40
* @author Vlad Georgescu 
*/
public class DivideCake4
{   
    //Function to calculate the GCD of two numbers
    private static int greatestCommonDivisor(int firstMultiple, 
        int secondMultiple) 
    {
        while(firstMultiple != secondMultiple) {
            if (firstMultiple < secondMultiple) {
                secondMultiple -= firstMultiple;
            } else {
                firstMultiple -= secondMultiple;
            }
        }
        
        return firstMultiple;
    }

    public static void main(String[] args)
    {
        //Girls Ages
        int age1 = Integer.parseInt(args[0]);
        int age2 = Integer.parseInt(args[1]);
        int age3 = Integer.parseInt(args[2]);
        int age4 = Integer.parseInt(args[3]);

        //Obtaining the GCD 
        int agesGCD = DivideCake4.greatestCommonDivisor(age1, age2);
        agesGCD = DivideCake4.greatestCommonDivisor(agesGCD, age3);
        agesGCD = DivideCake4.greatestCommonDivisor(agesGCD, age4);

        //Printing the GCD
        System.out.println("The GCD is " + agesGCD);

        //Calculating the number of portions that belongs to every girl
        int noOfPortions1 = age1 / agesGCD;
        int noOfPortions2 = age2 / agesGCD;
        int noOfPortions3 = age3 / agesGCD;
        int noOfPortions4 = age4 / agesGCD;

        //Printng the total of portions
        System.out.println("The cake should be divided in " + 
            (noOfPortions1 + noOfPortions2 + noOfPortions3 + noOfPortions4)
                + " slices");

        //Printing the girls revenue:))
        System.out.println("The first girl gets" + noOfPortions1 
            + " slices");
        System.out.println("The second girl gets" + noOfPortions2 
            + " slices");
        System.out.println("The third girl gets" + noOfPortions3 
            + " slices");
        System.out.println("The fourth girl gets" + noOfPortions4 
            + " slices");
    }
}

