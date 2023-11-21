public class Main {
    public static void main(String[] args) {

        Author author = new Author("Bram Stoker", "BramStoker@mail.com", true);
        Book book = new Book("Drakula",author, 200, 123567);

        System.out.println(author.toString());
        System.out.println(book.toString());
    }
}