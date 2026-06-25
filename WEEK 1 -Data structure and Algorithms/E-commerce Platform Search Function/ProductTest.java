import java.util.*;

public class ProductTest {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Book", "Education"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories")
        };
System.out.println("Enter the search key:");
        int searchId = sc.nextInt();

        // Linear Search
        System.out.println("LINEAR SEARCH");
        Product result1 = ProductSearch.linearSearch(products, searchId);

        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product Not Found");
        }

        System.out.println();

        // Binary Search
        System.out.println("BINARY SEARCH");
        Product result2 = ProductSearch.binarySearch(products, searchId);

        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product Not Found");
        }
    }
}