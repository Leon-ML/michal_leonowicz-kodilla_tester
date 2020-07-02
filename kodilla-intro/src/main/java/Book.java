public class Book {
    private String author;
    private String title;

    public Book (String author, String title){
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title){
        Book book = new Book(author, title);
        return book;
    }

    public static void main(String[] args) {
        Book book1 = Book.of("Dan Brown", "Da Vinci Code");
        Book book2 = Book.of("Wendy Beckett", "Historia Malarstwa");
    }

}
