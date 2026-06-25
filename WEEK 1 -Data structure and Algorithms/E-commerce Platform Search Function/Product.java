class Product
{
    public int productId;
    public String productName;
    public String category;
    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
    }
}
class ProductSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == targetId) {
                return products[i];
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
             int mid = (low + high) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            }

            else if (products[mid].productId < targetId) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return null;
    }
}