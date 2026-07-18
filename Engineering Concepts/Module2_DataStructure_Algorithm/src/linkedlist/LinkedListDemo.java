package linkedlist;

public class LinkedListDemo {

    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.add(new Task(1, "Design database schema", "In Progress"));
        taskList.add(new Task(2, "Set up CI pipeline", "Pending"));
        taskList.add(new Task(3, "Write unit tests", "Pending"));

        System.out.println("All tasks:");
        taskList.traverse();

        System.out.println("\nSearch for id 2:");
        System.out.println(taskList.search(2));

        taskList.delete(1);
        System.out.println("\nAfter deleting id 1:");
        taskList.traverse();
    }
}
