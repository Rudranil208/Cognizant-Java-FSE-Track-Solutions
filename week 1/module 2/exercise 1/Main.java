package InventoryManagementSystem;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        // Add Products
        inventory.addProduct(new Product(101, "Laptop", 15, 55000));
        inventory.addProduct(new Product(102, "Keyboard", 30, 1200));
        inventory.addProduct(new Product(103, "Mouse", 50, 700));

        System.out.println("\nInventory:");
        inventory.displayProducts();

        // Update Product
        inventory.updateProduct(102, "Mechanical Keyboard", 25, 2500);

        System.out.println("\nAfter Update:");
        inventory.displayProducts();

        // Delete Product
        inventory.deleteProduct(103);

        System.out.println("\nAfter Deletion:");
        inventory.displayProducts();
    }
}
