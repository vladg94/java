/**
 * Takes a temperature in degrees C
 * and prints out the same temperature in degrees F
 */
object FahrenheitToCelsius {
    def main(args: Array[String]) {
        var fahrenheit: Double = args(0).toDouble
        var celsius: Double = ((fahrenheit - 32) * 5) / 9

        println(fahrenheit + "F = " + celsius + "C")
    }
}