import java.util.Scanner;

public class SinglyReverseLinkedList {
    // Node class to represent each node in the linked list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    private Node head = null;

    // Method to add a node to the linked list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the nodes in reverse order
    public void displayReverse(Node node) {
        if (node == null) {
            return;
        }
        displayReverse(node.next);
        System.out.print(node.data + " ");
    }

    // Method to get the head of the linked list
    public Node getHead() {
        return head;
    }

    public static void main(String[] args) {
        SinglyReverseLinkedList list = new SinglyReverseLinkedList();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int value = in.nextInt();
            list.addNode(value);
        }
        System.out.println("Nodes in reverse order:");
        list.displayReverse(list.getHead());
    }
}
