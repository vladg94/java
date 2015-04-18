/**
 * Takes the length and width of a field
 * as command line arguments and prints the perimeter
 * of the field
 */
object FieldPerimeter {
    def main(args: Array[String]) {
        var length: Int = args(0).toInt
        var width: Int = args(1).toInt
        var perimeter: Int = 2 * length + 2 * width

        println("The perimeter of the field is " + perimeter)
    }
}