fun main() {
    var n1:Point = Point()
    n1.x = 126
    n1.y = 7

    var n2:Point = Point()
    n2.x = 126
    n2.y = 9

    println(n1.toString())
    println(n1.equals(n2))

}

open class Point {
    var x = 0
    var y = 0

    override fun toString(): String {
        return "$x, $y"

    }

    override fun equals(other : Any?): Boolean {
        if (other is Point) {
            return (x == other.x || y == other.y)
        }
        return true

        return false
    }

    fun symmetry(x: Int, y: Int): Int {
        if (x != 0 && y != 0)
            return -x - y
        return 0
    }
}
