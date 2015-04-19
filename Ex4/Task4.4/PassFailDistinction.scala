/**
 * Takes a mark as a command line argument
 * and reports whether it is a pass or fail 
 * and whether it is a distinction
 */
object PassFailDistinction {
    def main(args: Array[String]) {
        val report: String = args(0).toDouble match {
            case x if (x < 50) => "Fail"
            case x => x match {
                case x if (x < 70) => "Pass"
                case _ => "Pass\nDistinction"
            }
        }

        println(report)
    }
}