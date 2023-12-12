import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private List<Product> products;

    public ShoppingList() {
        this.products = new ArrayList<>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Product product : products) {
            result.append(product.getName());
            result.append(",");
        }
        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1); // Remove the last comma
        }
        return result.toString();
    }

    public int total() {
        int totalQuantity = 0;
        for (Product product : products) {
            totalQuantity += product.getQuantity();
        }
        return totalQuantity;
    }

    public static void main(String[] args) {
        // Example usage
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.add(new Product("milk", 2));
        shoppingList.add(new Product("apple", 4));

        System.out.println("toString() -> " + shoppingList.toString());
        System.out.println("total() -> " + shoppingList.total());
    }
}
