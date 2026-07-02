package InventoryManagementSystem;

import java.util.HashMap;

public class Inventory {

    private HashMap<Integer, Product> products = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {

        if(products.containsKey(product.getProductId())) {
            System.out.println("Product already exists.");
            return;
        }

        products.put(product.getProductId(), product);
        System.out.println("Product added successfully.");
    }

    // Update Product
    public void updateProduct(int id, String name, int quantity, double price) {

        if(!products.containsKey(id)) {
            System.out.println("Product not found.");
            return;
        }

        Product p = products.get(id);

        p.setProductName(name);
        p.setQuantity(quantity);
        p.setPrice(price);

        System.out.println("Product updated successfully.");
    }

    // Delete Product
    public void deleteProduct(int id) {

        if(products.remove(id) != null)
            System.out.println("Product deleted successfully.");
        else
            System.out.println("Product not found.");
    }

    // Display Inventory
    public void displayProducts() {

        if(products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        for(Product p : products.values()) {
            System.out.println(p);
        }
    }
}
