package arrayops;

public class ArrayDemo {

    public static void main(String[] args) {
        EmployeeArrayManager manager = new EmployeeArrayManager(10);

        manager.add(new Employee(1, "Divya Sharma", "Software Engineer", 65000));
        manager.add(new Employee(2, "Rohan Gupta", "QA Engineer", 55000));
        manager.add(new Employee(3, "Neha Kapoor", "Product Manager", 85000));

        System.out.println("All employees:");
        manager.traverse();

        System.out.println("\nSearch for id 2:");
        System.out.println(manager.search(2));

        manager.delete(1);
        System.out.println("\nAfter deleting id 1:");
        manager.traverse();
    }
}
