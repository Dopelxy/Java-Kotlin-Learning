package Lesson7.forkotlin.Ex9

fun main() {
    val book1 = Book("Война и мир", "Толстой", "123-1", 1869)
    val book2 = Book("Преступление и наказание", "Достоевский", "456-2", 1866)
    val book3 = Book("Мастер и Маргарита", "Булгаков", "789-3", 1967)
    val book4 = Book("Анна Каренина", "Толстой", "101-4", 1877)

    LibraryCatalog.addBook(book1)
    LibraryCatalog.addBook(book2)
    LibraryCatalog.addBook(book3)
    LibraryCatalog.addBook(book4)

    println("Поиск 'Маргарита':")
    val found = LibraryCatalog.findByTitle("Маргарита")
    found.forEach { println(it) }

    println("\nУдаляем книгу с ISBN 456-2 (Преступление и наказание)")
    LibraryCatalog.removeBook("456-2")

    println("\nОставшиеся книги в каталоге:")
    LibraryCatalog.printAll()
}