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

        int multiplier = this.arabicNumber / 1000;
    
        this.arabicNumber -= 1000 * multiplier; 
        
        //Counting the thousands, convert them into romans
        for (int index = 0; index < multiplier; index++) {
            romanNumber += "M"; 
        }

        //Counting the hundreds, and convert them into romans
        multiplier = this.arabicNumber / 100;
        switch (multiplier) {
    
            case 4 : {
                romanNumber += "CD";
                this.arabicNumber -= 100 * multiplier; 
            } 
            break;
    
            case 5 : {
                romanNumber += "D";
                this.arabicNumber -= 100 * multiplier; 
            }
            break;
    
            case 9 : {
                romanNumber += "CM";
                this.arabicNumber -= 100 * multiplier; 
            }
            break;
    
            default : {
                for (int index = 0; index < multiplier; index++) {
                    romanNumber += "C";
                    this.arabicNumber -= 100 * multiplier; 
                }
            }
        }
        
        //Counting the tens and add them to the roman number    
        multiplier = this.arabicNumber / 10;
        switch (multiplier) {
    
            case 4 : {
                romanNumber += "XL";
                this.arabicNumber -= 10 * multiplier; 
            }
            break;
    
            case 5 : {
                romanNumber += "L";
                this.arabicNumber -= 10 * multiplier; 
            }
            break;
    
            case 9 : {
                romanNumber += "XC";
                this.arabicNumber -= 10 * multiplier; 
            }
            break;
    
            default : {
                for (int index = 0; index < multiplier; index++) {
                    romanNumber += "X";
                    this.arabicNumber -= 10 * multiplier; 
                }
            }
        }
        
        //Converting the units into romans.
        switch(this.arabicNumber) {
            
            case 4 : {
                romanNumber += "IV";
                this.arabicNumber -= multiplier; 
            }
            break;
        
            case 5 : {
                romanNumber += "V";
                this.arabicNumber -= multiplier; 
            }
            break;
    
            case 9 : {
                romanNumber += "IX";
                this.arabicNumber -= multiplier; 
            }
            break;
            
            default : {
                for (int index = 0; index < multiplier; index++) {
                    romanNumber += "I";
                    this.arabicNumber -= multiplier; 
                }
            }
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
            
            if (getChar(index) == 'M') {
                arabicNumber += 1000;
            }

            if (getChar(index) == 'D') {
                arabicNumber += 500;
            }

            //The next segment of code verifies if the letter at this index is C
            //Then we verify if the letter at the next index si M or D.
            //If its M or D we have a digit couple to deal with.
            if (getChar(index) == 'C') {
                if (getChar(index + 1) == 'M') {
                    arabicNumber += 900;
                } else if (getChar(index + 1) == 'D') {
                    arabicNumber += 400;
                } else {
                    arabicNumber += 100;
                }
            }

            if (getChar(index) == 'L') {
                arabicNumber += 50;
            }

            //Same segment of code as for the C letter. Use to verify if we encounter any
            //Couple of digits
            if (getChar(index) == 'X') {
                if (getChar(index + 1) == 'C') {
                    arabicNumber += 90;
                } else if (getChar(index + 1) == 'L') {
                    arabicNumber += 40;
                } else {
                    arabicNumber += 10;
                }
            }

            if (getChar(index) == 'V') {
                arabicNumber += 5;
            }


            //Same segment of code as for the C letter. Use to verify if we encounter any
            //Couple of digits
            if (getChar(index) == 'I') {
                if (getChar(index + 1) == 'X'){
                    arabicNumber += 9;
                } else if (getChar(index + 1) == 'V') {
                    arabicNumber += 4;
                } else {
                    arabicNumber += 1;
                }
            }
        }
            
        return arabicNumber;
    }
}