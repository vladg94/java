/**
* Prints results of some switch cases
* @author Vlad Georgescu
*/
public class JustSwitch
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        switch(a) {
            //Print holed rectangle
            case 1: {
                b = (b / 2 ) * 2 + 1;
                c = (c / 2) * 2 + 1;

                //Now that the numbers are odd
                //Next step is to show thme on the screen
                System.out.println("The width is " + b + "The height is "
                    + c);

                //Counting the number of cells before printing `em
                int index = 0; 
                
                for (int row = 1; row <= c; row++) {
                    for (int column = 1; column <= b; column++) {
                        index++;
                        if (index == b * c / 2 + 1) {
                            System.out.print("   ");
                        } else {
                            System.out.print("[_]");
                        }
                    }
                    System.out.println();
                }
                
                break;
            }
            
            //Print triangle legs or triangle(b = c)
            case 2: {
                if (b == c) { 
                    //Printing a triangle
                    for(int row = 1; row <= b; row++) {
                        
                        for(int column = 1; column <= row; column++) {
                            System.out.print("[_]");
                        }
                        
                        System.out.println();
                    }
                } else {
                    //Prints only the legs of the triangle
                    for (int firstLeg = 1; firstLeg < b; firstLeg++) {
                        System.out.println("[_]");
                    }
                    for (int secondLeg = 1; secondLeg < c; secondLeg++) {
                        System.out.print("[_]");
                    }
                }
            }
            
            //Print Hypotenuse
            case 3: {
                double cathetus1 = Math.pow(b, 2);
                double cathetus2 = Math.pow(c, 2);
                double hypotenuse = Math.sqrt(cathetus1 + cathetus2);

                System.out.println("Hypotenuse is " + hypotenuse);

                break; 
            }
            
            //Print b lines with value of c
            case 4 : {
                int index = 1;
                do {
                    index++;
                    System.out.println(c);
                } while (index <= b);
                break;
            } 

            default : {
                //Algorithm for GCD
                while(b != c) {
                    if (b < c) {
                        c -= b;
                    } else {
                    	b -= c;
                    }
                }
                
                System.out.println("The GCD is " + b);
                
                break;
            }    
        }
    }
}
