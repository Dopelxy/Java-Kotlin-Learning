package Lesson4.forkotlin

fun main() {
    print("Enter string: ")
    val input = readln()

    val reversed = reverseWords(input)
    println("Result: $reversed")
}

fun reverseWords(str: String): String {
    if (str.isBlank()) return ""

    val result = StringBuilder()
    var i = str.length - 1

    while (i >= 0) {

        while (i >= 0 && str[i] == ' ') {
            i--
        }

        if (i < 0) break

        val end = i

        while (i >= 0 && str[i] != ' ') {
            i--
        }
        val word = str.substring(i + 1, end + 1)

        if (result.isNotEmpty()) {
            result.append(" ")
        }
        result.append(word)
    }

    return result.toString()
}