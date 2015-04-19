/**
 * Takes a mark as a command line argument
 * and prints in which degree category it falls into
 */
object DegreeCategory {
    def main(args: Array[String]) {
        val degree: String = args(0).toDouble match {
            case x if (x < 32) => "Fail"
            case x if (x < 40) => "Pass / ordinary degree"
            case x if (x < 50) => "Honorous, third class"
            case x if (x < 60) => "Honorous, second class, division two"
            case x if (x < 70) => "Honorous, second class, division one"
            case _ => "Honorous, first class"
        }

        println(s"Degree category: $degree")
    }
}