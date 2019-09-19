package classes

open class Book(val title: String, val author: String) {

    private var currentPage = 0

    open fun readPage() {
        currentPage = currentPage.plus(1)
    }

}

class Ebook(title: String, author: String, var format: String = "text"): Book(title, author) {

    private var wordCount = 0

    override fun readPage() {
        wordCount = wordCount.plus(250)
    }

}