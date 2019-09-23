fun main(args: Array<String>) {

    val allBooks = setOf("Hamlet", "Macbeth", "Romeo and Juliet", "A Midnight summer dream", "Othello", "Much ado about nothing!")

    val library = mapOf(allBooks to "William Shakespeare")

    println(library.any { it.key.contains("Hamlet") })

    val bestAuthor = "William Shakespeare"

    val moreBooks = mutableMapOf("The Tempest" to bestAuthor, "The Merchant of Venice" to bestAuthor)
    val title = moreBooks.getOrPut("Julius Caesar", { bestAuthor })     

}