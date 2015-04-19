/**
* Stupid manufacturer needs a program to tell him 
* how big a tank must be, to hold 30 cube meters of oil
* Tested for
* @author Vlad Georgescu
*/
public class MinimumTankSize
{
    public static void main(String[] args)
    {
        double requieredVolume = Double.parseDouble(args[0]);
        double sideLenght = 0.5;
        double tankSize = sideLenght * sideLenght * sideLenght;

        while (tankSize < requieredVolume) {
            sideLenght = sideLenght + 0.5;
        }
        System.out.println("Ca sa incapa pula mea este nevoie de: " + tankSize);    
    }
}