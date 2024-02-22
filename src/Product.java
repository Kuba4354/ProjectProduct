import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Product {
    private String name;
    private String description;
    private int price;
    private LocalDate createdAt;

    public Product() {

    }



    public Product(String name, String description, int price, LocalDate createdAt) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
    }

    public static Book[] booo = {};
    public static Electronics[] eleeeee = {};


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Product[] productsElectronics() {
        Scanner scanner = new Scanner(System.in);
        Electronics electronics = new Electronics();
        electronics.setName(scanner.nextLine());
        electronics.setDescription(scanner.nextLine());
        electronics.setPrice(scanner.nextInt());
        electronics.setCreatedAt(LocalDate.now());
        electronics.setBrand(scanner.nextLine());
        electronics.setColor(scanner.nextLine());
        electronics.setColor(scanner.nextLine());
        electronics.setNew(scanner.nextBoolean());
        electronics.setMemory(scanner.nextInt());
        eleeeee = Arrays.copyOf(eleeeee, eleeeee.length + 1);
        eleeeee[eleeeee.length - 1] = electronics;


        return eleeeee;
    }
    public Product[] productsBook() {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        book.setName(scanner.nextLine());
        book.setDescription(scanner.nextLine());
        book.setPrice(scanner.nextInt());
        book.setCreatedAt(LocalDate.now());
        book.setAuthorFullName(scanner.nextLine());
        book.setAuthorFullName(scanner.nextLine());
        booo = Arrays.copyOf(booo, booo.length + 1);
        booo[booo.length - 1] = book;
        return booo;

    }



    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", createdAt=" + createdAt +
                '}';
    }
}
