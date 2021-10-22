fun main() {
    var f1:Fraction = Fraction()
    f1.numerator = 3.0
    f1.denominator = 4.0


    var f2:Fraction = Fraction()
    f2.numerator = 5.0
    f2.denominator = 4.0

    println(f1.equals(f2))
    println(f1.toString())
    println(f2.toString())


}
class Fraction {
    var numerator: Double = 0.0
    var denominator: Double = 0.0

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Fraction){
            if (numerator*other.denominator/denominator == other.numerator)
                return true
        }
        return false
    }
//    fun multiplication(other: Any?) {
//        denominator * other.denominator
//    }

    fun addition(other: Any?): Double {
        if (other is Fraction) {
            if (denominator == other.denominator){
                return numerator/denominator + other.numerator/other.denominator
            }else if (denominator != other.denominator)
                return (numerator * other.denominator + other.numerator * denominator) / denominator * other.denominator


        }
        return 0.0

    }


}