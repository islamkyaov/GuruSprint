package lesson3
fun main() {
    for (i in 1..10) {
        if (i == 5) {
            println("Пропускаем число 5")
            continue
        }
        if (i == 8) {
            println("Встретили число 8")
            break
        }
        println(i)
    }
    println("Цикл прерванщ")
}