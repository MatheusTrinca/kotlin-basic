fun main() {
    val hashSet = hashSetOf(1, 2, 3, 4)
    val sortedSet = sortedSetOf(1, 2, 3, 4)
    val linkedSet = linkedSetOf(1, 2, 3, 4)
    val mutableList = mutableListOf(1, 2, 3, 4)

    hashSet.add(3)
    sortedSet.add(3)
    linkedSet.add(3)
    mutableList.add(3)

    printAlLElements(hashSet)
    printAlLElements(sortedSet)
    printAlLElements(linkedSet)
    printMutableList(mutableList)
}

// HashSet o mais rapido, porem nao ordena
// SortedSet, o mais lento, mas ordena, pode receber um comparator
// LinkedSet, uma mistura dos 2, mas não pode receber um comparator, garante a ordenacao


fun printAlLElements(set: Set<Int>) {
    println(set.joinToString(", "))
}

fun printMutableList(list: MutableList<Int>) {
    println(list.joinToString(", "))
}