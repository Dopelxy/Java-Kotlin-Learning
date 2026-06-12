package Lesson7.forkotlin.Ex9

interface LibraryItem {
    fun getTitle(): String      // обещаем, что у каждого элемента есть название
    fun getUniqueId(): String   // обещаем, что у каждого элемента есть уникальный номер
}

class Book(
    private val title: String,   // название книги (приватное)
    private val author: String,  // автор (приватный)
    private val isbn: String,    // уникальный номер книги (приватный)
    private val year: Int        // год издания (приватный)
) : LibraryItem {                // говорим: "я реализую интерфейс LibraryItem"

    override fun getTitle(): String = title          // выполняю обещание: вернуть название
    override fun getUniqueId(): String = isbn        // выполняю обещание: вернуть isbn

    override fun toString(): String = "Книга: '$title' ($author, $year)"   // как печатать книгу
}

object LibraryCatalog {
    private val books = mutableListOf<LibraryItem>()   // список книг

    fun addBook(book: Book) {
        books.add(book)        // добавить книгу в список
    }

    fun removeBook(isbn: String) {
        books.removeAll { it.getUniqueId() == isbn }   // удалить по ISBN
    }

    fun findByTitle(title: String): List<LibraryItem> {
        return books.filter { it.getTitle().contains(title, ignoreCase = true) }
        // вернуть все книги, у которых в названии есть искомая строка (без учёта регистра)
    }

    fun printAll() {
        books.forEach { println(it) }   // напечатать все книги
    }
}