import java.util.*;

class Book {
    private int id;
    private String title;
    private String author;
    private double price;

    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "ID: " + id + " | Title: " + title + " | Author: " + author + " | Price: Rs." + price;
    }
}

class BookShopSystem {
    private List<Book> books = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n===== BOOK SHOP MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Purchase Book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1: addBook(); break;
                    case 2: removeBook(); break;
                    case 3: searchBook(); break;
                    case 4: displayBooks(); break;
                    case 5: purchaseBook(); break;
                    case 6:
                        System.out.println("Thank you! Visit again.");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid Input! Try Again.");
            }
        }
    }

    private void addBook() {
        try {
            System.out.print("Enter Book ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Book Author: ");
            String author = sc.nextLine();

            System.out.print("Enter Price: Rs.");
            double price = Double.parseDouble(sc.nextLine());

            books.add(new Book(id, title, author, price));
            System.out.println("Book Added Successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input! Please enter valid values.");
        }
    }

    private void removeBook() {
        System.out.print("Enter Book ID to remove: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean removed = books.removeIf(b -> b.getId() == id);
        System.out.println(removed ? "Book Removed Successfully." : "Book ID Not Found.");
    }

    private void searchBook() {
        System.out.print("Enter Book Title to Search: ");
        String title = sc.nextLine();
        books.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .forEach(System.out::println);
    }

    private void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books Available!");
        } else {
            System.out.println("\n--- Available Books ---");
            books.forEach(System.out::println);
        }
    }

    private void purchaseBook() {
        System.out.print("Enter Book ID to Purchase: ");
        int id = Integer.parseInt(sc.nextLine());
        for (Book b : books) {
            if (b.getId() == id) {
                System.out.println("\n----- BILL -----");
                System.out.println("Book: " + b.getTitle());
                System.out.println("Author: " + b.getAuthor());
                System.out.println("Amount to Pay: Rs." + b.getPrice());
                System.out.println("----------------");
                System.out.println("Thank You for Shopping!");
                return;
            }
        }
        System.out.println("Book ID Not Found.");
    }
}

public class BookShop {
    public static void main(String args[]) {
        new BookShopSystem().start();
    }
}
