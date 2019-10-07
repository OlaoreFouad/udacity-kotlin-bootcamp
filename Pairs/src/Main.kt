fun main(args: Array<String>) {
    println("Hello, world!")

    val book1 = Book(getTitleAndAuthor().first, getTitleAndAuthor().second, 2019)
    val book2 = Book(getAllData().first, getAllData().second, getAllData().third)

    println(book1)
    println(book2)

    println(book1.printUrl())
    println("My personal text".isLong())
}

fun getTitleAndAuthor() = "Bob Marley" to "Getting out of bed!"
fun getAllData() = Triple("Bob Marley", "Getting out of bed!", 2004)

data class Book(var title: String, var author: String, var year: Int) {

    var pages: Int = 0

    fun printUrl() = "${Constants.baseUrl}${title.replace(" ", "")}.html"

    override fun toString(): String {
        return "Here is your book $title written by $author in $year"
    }
}

fun Book.calculateWeight() = this.pages.times(1.5)

fun Book.tornPages(torn: Int) {
    this.pages = this.pages - torn;
}

class Puppy(val book: Book) {

    init {
        if (book.pages > 0) {
            book.pages = book.pages - (Math.random() * book.pages).toInt()
        }
        book.pages = book.pages - (Math.random() * book.pages).toInt()
    }

}

fun String.isLong() = this.length > 10

