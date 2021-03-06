/**
* Prints a calendar with a highlighted day
* Tested for 3 28 12, 4 7.4 5
* @author Vlad Georgescu 
*/
public class CalendarHighlight
{   
    //The main method
    public static void main(String[] args)
    {   
        //This line, is all you need to print out the calendar
        //Lovely
        CalendarHighlight.printMonth(Integer.parseInt(args[0]), 
            Integer.parseInt(args[1]), Integer.parseInt(args[2]));
    }

    //Method to print the month
    private static void printMonth(int monthStartDay, int monthLastDate, 
        int today)
    {   
        //Printing the hyphens and the heading
        CalendarHighlight.printLineOfHyphens();
        CalendarHighlight.printHeading();

        //Changing variable, because of further needs
        int nextDayColumnToUse = monthStartDay;

        //Keeping track of the next date to be printed out 
        int nextDateToPrint = 1;
        
        //We need a minimum 6 number of rows
        int noOfRows = 0;

        while (nextDateToPrint <= monthLastDate || noOfRows < 6) {
            
            
            //For loop, for printing the row
            for (int dayColumnNo = 1; dayColumnNo <= 7; dayColumnNo++) {
            
                //Printing the left side of the row
                if (dayColumnNo == 1) {
                    System.out.print("| ");
                } 
    
                //Spaces between dates
                if (dayColumnNo > 1 && nextDateToPrint == today + 1 ) 
                {
                    System.out.print("  ");
                } else if (dayColumnNo > 1) {
                    System.out.print("   ");
                }//
                
                //We need the program to print either a date or a space
                if (nextDayColumnToUse != dayColumnNo 
                    || nextDateToPrint > monthLastDate)
                {
                    System.out.print("  ");
                } else if (nextDateToPrint == today) {
                    System.out.printf("\b>%02d<", today);
                    nextDateToPrint++;
                    nextDayColumnToUse++;
                } else {
                    System.out.printf("%02d", nextDateToPrint);
                    nextDayColumnToUse++; 
                    nextDateToPrint++; 
                } 
                
                // Ending the table
                if (dayColumnNo == 7 && nextDateToPrint - 1  == today) {
                    System.out.print("|");
                } else if (dayColumnNo == 7 && nextDateToPrint - 1 != today) {
                    System.out.print(" |");
                }
            }//for

            //Preparing the next line
            System.out.println();

            //Incrementation for the number of rows 
            noOfRows++;


            //Preparing for the next row
            nextDayColumnToUse = 1;

        }//while
    
        CalendarHighlight.printLineOfHyphens();
    }

    //Method for printing line of hypens
    private static void printLineOfHyphens()
    {
         for (int dayColumn = 1; dayColumn <= 7; dayColumn++) {
            if (dayColumn > 1) {
            System.out.print("-");
            System.out.print("-----");
            }
        }//for
        System.out.println();
    }

    //Method to print the heading
    private static void printHeading()
    {   
        //Left line of the table
        System.out.print("| ");
        
        for (int dayColumnNo = 1; dayColumnNo <= 7; dayColumnNo++) {
            if (dayColumnNo == 1) {
                CalendarHighlight.printDayName(dayColumnNo);
            } else {
                System.out.print("   ");
                CalendarHighlight.printDayName(dayColumnNo);    
            }
        }

        //Right line of the table
        System.out.println(" |"); 
    }

    //Method to print day name
    private static void printDayName(int number)
    {
        //One case for one number
        switch (number) {
            case 1 : {
                System.out.print("Su");
            }
            break;
            
            case 2: {
                System.out.print("Mo");
            }
            break;
            
            case 3: {
                System.out.print("Tu");
            }
            break;

            case 4: {
                System.out.print("We");
            }
            break;

            case 5: {
                System.out.print("Th");
            }
            break;
            
            case 6: {
                System.out.print("Fr");
            }
            break;
            
            case 7: {
                System.out.print("Sa");
            }
            break;
        }
    }
}