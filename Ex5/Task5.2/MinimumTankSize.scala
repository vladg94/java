/**
 * Takes a volume as a command line and prints
 * the minimum side length of a cubic tank
 * which can accommodate the volume
 */
object MinimumTankSize {
    def main(args: Array[String]) {
        val volume: Double = args(0).toDouble
        var side: Double = 0

        while (side * side * side < volume) {
            side += 0.5
        }

        println(s"You need a tank of $side meters per side.")
    }
}