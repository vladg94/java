/**
 * Takes two command line arguments and prints the
 * larger number of the two
 */
object MaxTwoDoubles {
    def main(args: Array[String]) {
        val n1: Double = args(0).toInt
        val n2: Double = args(1).toInt

        val max: Double = if (n1 > n2) n1 else n2

        println(s"Numbers $n1 and $n2 -- max is $max")
    }
}