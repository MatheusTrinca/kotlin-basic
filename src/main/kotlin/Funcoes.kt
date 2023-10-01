import java.math.BigDecimal

fun main() {
    val precoDosProdutos = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )
    val precoDosProdutos2 = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )
    val precoDosProdutos3 = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )

    println("Total Price: ${sumProductPrices(precoDosProdutos)}")
}

fun sumProductPrices(prices: Array<BigDecimal>): BigDecimal {
    var totalPrice = BigDecimal.ZERO
    for(price in prices) {
        totalPrice += price
    }
    return totalPrice
}
