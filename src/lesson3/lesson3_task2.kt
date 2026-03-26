package lesson3

fun main() {
    val secret = "кот"
    var password: String
    do {
        print("Введите пароль: ")
        password = readln()
        if (password != secret) {
            println("Неверно!")
        }
    } while (password != secret)
    println("Верно!")
}