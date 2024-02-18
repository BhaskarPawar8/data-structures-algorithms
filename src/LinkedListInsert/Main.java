package src.LinkedListInsert;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Method to add a new node at the beginning of the linked list
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to add a new node after a given node
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Method to add a new node at the end of the linked list
    public void append(int data) {
        Node newNode = new Node(data);
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

    // Method to print the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(4);
        list.display(); // Output: 1 2 4

        list.prepend(0);
        list.display(); // Output: 0 1 2 4

    }
}
