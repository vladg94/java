/**
 * Takes the dimensions of a fish tank as command
 * line arguments and prints the surface area and
 * the total length of the edges
 */
object FishTankMaterials {
    def main(args: Array[String]) {
        var width: Int = args(0).toInt
        var depth: Int = args(1).toInt
        var height: Int = args(2).toInt

        var surfaceArea: Int = 2 * (width * height + width * depth + height * depth)

        var edgesLength: Int = 4 * (height + depth + width)

        println("The surface area of a tank with dimensions ("
            + width + ", " + depth + ", " + height + ") is " + surfaceArea)

        println("The length of the edges of a tank with dimensions ("
            + width + ", " + depth + ", " + height + ") is " + edgesLength)
    }
}