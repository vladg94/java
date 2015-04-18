/**
 * Given a number of pennies as a command line arguments
 * round to the nearest pound
 */
object RoundPennies {
    def main(args: Array[String]) {
        var pennies: Int = args(0).toInt

        var pounds: Int = (pennies + 50) / 100

        println(pounds + " pounds")
    }
}