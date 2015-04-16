/**
 * Takes a name as a command line argument
 * and prints a flattering
 */
object FlatterMe {
    def main(args: Array[String]) {
        println(args(0) + ", esti bomba!")
        println("Nimeni nu e mai valoros ca " + args(0))
        println("Daca cineva e smecher, " + args(0) + " este acela!")
    }
}