public class Main {
    public static void main(String[] args) {
        Author authorBook = new Author("Уильям", "Шекспир");
        Book book = new Book(1623, "Буря", authorBook);
        System.out.println(book);
        Author authorBook1 = new Author("Фёдор", "Достоевски");
        Book book1 = new Book(1866, "Преступление и наказание", authorBook1);
        System.out.println(book1);
    }
}