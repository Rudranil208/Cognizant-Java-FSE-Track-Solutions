package ProductSearch;

public class Main {
    public static void main(String args[])
    {
        Product products[]={new Product(101, "Laptop", "Electronics"),
            new Product(102, "Keyboard", "Electronics"),
            new Product(103, "Mouse", "Electronics"),
            new Product(104, "Table", "Furniture"),
            new Product(105, "Chair", "Furniture")};
        Product result1=SearchOperations.linearSearch(products,103);
        Product result2=SearchOperations.binarySearch(products,103);
        System.out.println("Through linear search: ");
        System.out.println(result1);
        System.out.println("Through binary search: ");
        System.out.println(result2);
    }
}
