import kotlin.random.Random
import kotlin.system.measureNanoTime

fun main() {
    val map1 = mapOf(
        1 to "Ruim",
        2 to "Bom",
        3 to "Normal",
        4 to "Bom",
        5 to "Muito Bom"
    )

    val mutableMap = mutableMapOf(
        1 to "Ruim",
        2 to "Bom",
        3 to "Normal",
        4 to "Bom",
    )

    println(map1[1])

    mutableMap[5] = "Muito Bom"
    println(mutableMap.toString())

// ===================================================
    val codesArray = Array(10000) { Random.nextInt(1, 5) }
    val listMap = listOf(
        Pair(1, "Ruim"),
        Pair(2, "Bom"),
        Pair(3, "Normal"),
        Pair(4, "Bom")
    )

    val time1 = measureNanoTime {
        for (code in codesArray) {
            val category = listMap.find { it.first == code }!!
            category.second
        }
    }

    val time2 = measureNanoTime {
        for (code in codesArray) {
            val category = map1[code]
            println(category)
        }
    }

    println(time1)
    println(time2)

}