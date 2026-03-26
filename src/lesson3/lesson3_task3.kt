package lesson3

fun main() {
    val secret = "кот"
    var input: String
    do {
        print("Введи пароль: ")
        input = readln()
        if (input != secret) {
            println("Неправильно")
        }
    } while (input != secret)
    println("Молодец!")
}