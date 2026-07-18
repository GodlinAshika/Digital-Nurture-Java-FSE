package linkedlist;

public class TaskLinkedList {

    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
        }
    }

    private Node head;

    public void add(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public Task search(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public boolean delete(int taskId) {
        if (head == null) {
            return false;
        }
        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return true;
        }
        Node previous = head;
        Node current = head.next;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                previous.next = current.next;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }
}
