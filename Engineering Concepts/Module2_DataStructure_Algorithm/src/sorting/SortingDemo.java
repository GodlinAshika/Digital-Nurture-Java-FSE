package sorting;

import java.util.Arrays;

public class SortingDemo {

    public static void main(String[] args) {
        Order[] bubbleOrders = {
                new Order(1, "Asha Rao", 2599.00),
                new Order(2, "Vikram Nair", 799.00),
                new Order(3, "Priya Menon", 4599.00),
                new Order(4, "Karthik Iyer", 1299.00)
        };

        BubbleSort.sort(bubbleOrders);
        System.out.println("Sorted with Bubble Sort:");
        System.out.println(Arrays.toString(bubbleOrders));

        Order[] quickOrders = {
                new Order(1, "Asha Rao", 2599.00),
                new Order(2, "Vikram Nair", 799.00),
                new Order(3, "Priya Menon", 4599.00),
                new Order(4, "Karthik Iyer", 1299.00)
        };

        QuickSort.sort(quickOrders, 0, quickOrders.length - 1);
        System.out.println("\nSorted with Quick Sort:");
        System.out.println(Arrays.toString(quickOrders));
    }
}
