import java.util.Objects;

public class Book {
    private String nameBook;
    private int age;
    private Author author;

    public Book(int age, String nameBook, Author author) {
        this.age = age;
        this.nameBook = nameBook;
        this.author = author;
    }

    public Book() {
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, age, author);
    }

    @Override
    public String toString() {
        return "Произведение " + '\"' + nameBook + '\"' +
                ", год выпуска " + age +
                ", автор " + author;
    }
}