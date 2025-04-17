public class Product {
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Display product details
    public void displayDetails() {
        System.out.println("Product Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    // Main method for testing
    public static void main(String[] args) {
        Product p = new Product(101, "Laptop", 75000);
        p.displayDetails();
    }
}
