fun main() {
    println("Коробки с разными типами данных")
    println()

    val firstBox = Box<String, Int, Float>(
        first = "Первая коробка",
        second = 10,
        third = 1.5f
    )

    val secondBox = Box<Int, Float, String>(
        first = 20,
        second = 2.5f,
        third = "Вторая коробка"
    )

    val thirdBox = Box<Float, String, Int>(
        first = 3.5f,
        second = "Третья коробка",
        third = 30
    )

    println("Коробка 1: ${firstBox.first}, ${firstBox.second}, ${firstBox.third}")
    println("Коробка 2: ${secondBox.first}, ${secondBox.second}, ${secondBox.third}")
    println("Коробка 3: ${thirdBox.first}, ${thirdBox.second}, ${thirdBox.third}")
    println()

    val firstSum = firstBox.sumNumbers()
    val secondSum = secondBox.sumNumbers()
    val thirdSum = thirdBox.sumNumbers()

    println("Сумма чисел в первой коробке: $firstSum")
    println("Сумма чисел во второй коробке: $secondSum")
    println("Сумма чисел в третьей коробке: $thirdSum")

    val totalSum = firstSum + secondSum + thirdSum

    println("Общая сумма чисел: $totalSum")
}