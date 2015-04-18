/**
 * Shows how many years I have left before retirement
 * The age is passed as a command line argument
 */
object YearsBeforeRetirement {
    def main(args: Array[String]) {
        var myAge: Int = args(0).toInt
        var retirementAge: Int = 68
        var yearsLeft: Int = retirementAge - myAge

        println("My age now is " + myAge)
        println("I will retire at the age of " + retirementAge)
        println("Years left working is " + yearsLeft)
    }
}