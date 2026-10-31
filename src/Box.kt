class Box<T, U, V>(
    val first: T,
    val second: U,
    val third: V
) {
    fun sumNumbers(): Double {
        return toNumber(first) + toNumber(second) + toNumber(third)
    }

    private fun toNumber(value: Any?): Double {
        return when (value) {
            is Number -> value.toDouble()
            is String -> value.trim()
                .replace(',', '.')
                .toDoubleOrNull() ?: 0.0
            else -> 0.0
        }
    }
}