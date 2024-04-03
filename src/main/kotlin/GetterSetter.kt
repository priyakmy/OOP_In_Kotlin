fun main(){
    val book = Book()
    print(book.author)


}
class Book() {
    var author: String = "Denish Ritchi"
        get() {
            return field
        }
        set(value) {
            field = value
        }
}