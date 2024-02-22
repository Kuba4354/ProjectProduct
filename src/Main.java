
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Product product = new Product();
        Electronics electronics = new Electronics();
        Book book = new Book();
        Scanner scannerc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    1.Register :
                    2.Login :
                    3.Excit :
                      """);

            switch (scannerc.nextLine()) {
                case "1" -> {
                    System.out.println("firstName?");
                    user.setFirstName(scannerc.nextLine());
                    System.out.println("lastName?");
                    user.setLastName(scannerc.nextLine());
                    System.out.println("emai?");
                    user.setEmail(scannerc.nextLine());
                    System.out.println("password?");
                    user.setPassword(scannerc.nextInt());
                    User[] users = {user};
                    for (User user1 : users) {
                        System.out.println(user1);
                    }
                }


                case "2" -> {
                    System.out.println("email?");
                    String email = "Kuba@gmail.com";
                    if (scannerc.nextLine().equalsIgnoreCase(email)) {
                        System.out.println("успешно");
                    } else System.out.println("invalid email");
                    System.out.println("password?");
                    int password = 1234;
                    if (scannerc.nextInt() == password) {
                        System.out.println("успешно");
                    } else {
                        System.out.println("invalid password");
                        return;
                    }
                }
                case "3" -> {
                    return;
                }
            }
            while (true) {
                System.out.println("""
                        1 -Add new Product
                        2 -Get All Products
                        3- Get All Books
                        4 -Get All Electronics
                        """);
                switch (scannerc.nextLine()) {
                    case "1" -> {
                        System.out.println("komanda tandanyz");
                        switch (scannerc.nextInt()) {

                            case 11 -> {

                                System.out.println(Arrays.toString(electronics.productsElectronics()));
                            }
                            case 22 -> {
                                System.out.println(Arrays.toString(book.productsBook()));
                            }
                        }
                    }

                    case "2" -> {

                        System.out.println(Arrays.toString(Product.eleeeee));
                        System.out.println(Arrays.toString(Product.booo));
                    }
                    case "3" -> {
                        System.out.println(Arrays.toString(Product.booo));

                    }
                    case "4" -> {
                        System.out.println(Arrays.toString(Product.eleeeee));


                    }
                }
            }
        }
    }
}




