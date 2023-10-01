import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    // String
    val name = "Matheus Felipe Trinca"
    println("Size name: " + name.count())
    val splitName = name.split(" ")
    println(splitName)
    val dropLasName = name.dropLast(2)
    println(dropLasName)
    val dropName = name.drop(2)
    println(dropName)
    val containsName = name.contains("ath")
    println(containsName)

    // Array
    val array = arrayOf(10, 20, 30, 40, 50)
    val sumOfArray = array.sumOf { it }
    println("sumOfArray: $sumOfArray")
    val reverseArray = array.reversedArray()
    println("reverseArray: ${arrayToString(reverseArray)}")
    val sortArray = array.sortedArray()
    println("sortArray: ${arrayToString(sortArray)}")

    // BigDecimal
    val bigDecimal = BigDecimal("2")
    val powBigDecimal = bigDecimal.pow(3)
    println("powBigDecimal: $powBigDecimal")
    val roundBigDecimal = bigDecimal.divide(BigDecimal("3"), 0, RoundingMode.HALF_UP)
    println("roundBigDecimal: $roundBigDecimal")
}

fun arrayToString(array: Array<Int>) = array.fold("") {acc, i ->  "$acc $i" }