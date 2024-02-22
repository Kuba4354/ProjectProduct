import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Book extends Product {
    private String authorFullName;

    public Book() {

    }


    public Book(String name, String description, int price, LocalDate createdAt, String authorFullName) {
        super(name, description, price, createdAt);
        this.authorFullName = authorFullName;
    }

    public Book(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }



    @Override
    public String toString() {
        return "Book{" +
                "authorFullName='" + authorFullName + '\'' +
                super.toString();

    }
}




