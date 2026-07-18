package inventory;

public class InventoryDemo {

    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product(101, "Wireless Mouse", 50, 799.00));
        manager.addProduct(new Product(102, "Mechanical Keyboard", 30, 2499.00));
        manager.addProduct(new Product(103, "USB-C Hub", 75, 1299.00));

        System.out.println("All products:");
        for (Product product : manager.listProducts()) {
            System.out.println(product);
        }

        manager.updateProduct(102, 25, 2299.00);
        System.out.println("\nAfter update:");
        System.out.println(manager.getProduct(102));

        manager.deleteProduct(101);
        System.out.println("\nAfter delete:");
        for (Product product : manager.listProducts()) {
            System.out.println(product);
        }
    }
}
