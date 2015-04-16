/**
 * Takes a person's names and birth date as command
 * line arguments and prints them out
 */
object Birthday {
    def main(args: Array[String]) {
        print("Name: " + args(0) + ", " + args(1) + "; ")
        println("Born:" + args(2))
    }
}