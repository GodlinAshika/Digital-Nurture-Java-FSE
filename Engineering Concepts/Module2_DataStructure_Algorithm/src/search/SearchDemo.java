package search;

import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Bluetooth Speaker", "Electronics"),
                new Product(2, "Running Shoes", "Footwear"),
                new Product(3, "Coffee Maker", "Appliances"),
                new Product(4, "Yoga Mat", "Fitness"),
                new Product(5, "Desk Lamp", "Home")
        };

        Product linearResult = ProductSearch.linearSearch(products, "Coffee Maker");
        System.out.println("Linear search result: " + linearResult);

        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts, Comparator.comparing(Product::getProductName));

        Product binaryResult = ProductSearch.binarySearch(sortedProducts, "Yoga Mat");
        System.out.println("Binary search result: " + binaryResult);
    }
}
