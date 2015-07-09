/**
* Converts arabic numbers to roman numbers and viceversa.
*
* @author Vlad Georgescu
*/
public class RomanNumber
{
    private int arabicNumber;
    private String romanNumber;

    //Method to for getting characters; Helper Method
    private char getChar(int index)
    {
        return this.romanNumber.charAt(index);
    }
    
    /**
    * Builds a RomanNumber with a given integer
    *
    * @param decimalNumber - the decimal number to be converted into a roman number.
    */
    public RomanNumber(int arabicNumber)
    {
        this.arabicNumber = Math.abs(arabicNumber);
    }

    /**
    * Builds a RomanNumber with a given String, also verifies if the given string
    * it`s a valid roman number representation.
    * @param romanNumber - the roman number to be converted into a decimal number.
    */
    public RomanNumber(String romanNumber)
    {
        this.romanNumber = romanNumber;
    }

    /**
    * This method converts numbers from arabic style to roman style. 
    *
    * @return The String format of the roman number.
    */
    public String convertToRoman()
    {   
        String romanNumber = "";
        int numberToTransform = this.arabicNumber;
        
        while (numberToTransform >= 1000) {
            romanNumber += "M";
            numberToTransform -= 1000;
        }
        
        if (numberToTransform >= 900) {
            romanNumber += "CM";
            numberToTransform -= 900;
        } else if (numberToTransform >= 500) {
            romanNumber += "D";
            numberToTransform -= 500;
        }
        if (numberToTransform >= 400) {
            romanNumber += "CD";
            numberToTransform -= 400;
        }
        
        while (numberToTransform >= 100) {
            romanNumber += "C";
            numberToTransform -= 100;
        }

        if (numberToTransform >= 90) {
            romanNumber += "XC";
            numberToTransform -= 90;
        } else if (numberToTransform >= 50) {
            romanNumber += "L";
            numberToTransform -= 50;
        }
        if (numberToTransform >= 40) {
            romanNumber += "XL";
            numberToTransform -= 40;
        }

        while (numberToTransform >= 10) {
            romanNumber += "X";
            numberToTransform -= 10;
        }
        
        if (numberToTransform >= 9) {
            romanNumber += "IX";
            numberToTransform -= 9;
        } else if (numberToTransform >= 5) {
            romanNumber += "V";
            numberToTransform -= 5;
        }
        if (numberToTransform >= 4) {
            romanNumber += "IV";
            numberToTransform -= 4;
        }

        while (numberToTransform >= 1) {
            romanNumber += "I";
            numberToTransform -= 1;
        }

        return romanNumber;
    }     
    
    /**
    * This method converst numbers from roman style to arabic style.
    *
    * @return The int format of the arabic number.
    */
    public int convertToArabic()
    {
        int arabicNumber = 0;
        
        //A for loop, to go through all of the roman number digits
        for (int index = 0; index < this.romanNumber.length(); index++) {

            if (this.getChar(index) == 'M') {
                arabicNumber += 1000;
            }

            else if (this.getChar(index) == 'D') {
                arabicNumber += 500;
            }

            //The next segment of code verifies if the letter at this index is C
            //Then we verify if the letter at the next index is M or D.
            //If its M or D we have a digit couple to deal with.
            else if (this.getChar(index) == 'C') {
                
                arabicNumber += 100;
            
                if (index < (this.romanNumber.length() - 1)) 
                {
                    if (this.getChar(index + 1) == 'M') {
                        arabicNumber += 800;
                        index++;
                    } else if (this.getChar(index + 1) == 'D') {
                        arabicNumber += 300;
                        index++;
                    }    
                }
            }        
            
            else if (this.getChar(index) == 'L') {
                arabicNumber += 50;
            }

            //Same segment of code as for the C letter. Use to verify if we encounter any
            //Couple of digits
            else if (this.getChar(index) == 'X') {
                
                arabicNumber += 10;
            
                if (index < (this.romanNumber.length() - 1)) {
                    if (this.getChar(index + 1) == 'C') {
                        arabicNumber += 80;
                        index++;
                    } else if (this.getChar(index + 1) == 'L') {
                        arabicNumber += 30;
                        index++;
                    }
                }
            }

            else if (this.getChar(index) == 'V') {
                arabicNumber += 5;
            }


            //Same segment of code as for the C letter. Use to verify if we encounter any
            //Couple of digits
            else if (this.getChar(index) == 'I') {
                
                arabicNumber += 1;
                
                if (index < (this.romanNumber.length() - 1)) {
                    if (this.getChar(index + 1) == 'X') {
                        arabicNumber += 8;
                        index++;
                    } else if (this.getChar(index + 1) == 'V') {
                        arabicNumber += 3;
                        index++;                        
                    }
                }
            }
        }
        return arabicNumber;
    }

    /*
    //Used for testing of the RomanNumber. 
    public static void main(String[] args)
    {
        RomanNumber tester1 = new RomanNumber(123);
        RomanNumber tester2 = new RomanNumber("XL");
        System.out.println(tester1.convertToRoman());
        System.out.println(tester2.convertToArabic());
    }
    */
}