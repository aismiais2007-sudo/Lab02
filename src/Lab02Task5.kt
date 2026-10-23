fun main() {
    print("Enter temperature in Celsius: ")
    val c = readln().toDouble()

    val f = c * 9.0 / 5.0 + 32.0
    val isBelowFreezing = f < 32.0

    println("C = $c")
    println("F = $f")
    println("Below freezing status: $isBelowFreezing")
}