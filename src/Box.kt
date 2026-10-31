class Box<T, U, V>(
    val first: T,
    val second: U,
    val third: V
) {
    fun sumNumbers(): Double {
        var sum = 0.0

        if (first is Number) {
            sum += first.toDouble()
        }

        if (second is Number) {
            sum += second.toDouble()
        }

        if (third is Number) {
            sum += third.toDouble()
        }

        return sum
    }
}