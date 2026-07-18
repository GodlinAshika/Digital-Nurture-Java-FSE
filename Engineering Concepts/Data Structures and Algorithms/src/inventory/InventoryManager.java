package inventory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InventoryManager {

    private Map<Integer, Product> products;

    public InventoryManager() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public boolean updateProduct(int productId, int quantity, double price) {
        Product product = products.get(productId);
        if (product == null) {
            return false;
        }
        product.setQuantity(quantity);
        product.setPrice(price);
        return true;
    }

    public boolean deleteProduct(int productId) {
        return products.remove(productId) != null;
    }

    public Product getProduct(int productId) {
        return products.get(productId);
    }

    public Collection<Product> listProducts() {
        return products.values();
    }
}
