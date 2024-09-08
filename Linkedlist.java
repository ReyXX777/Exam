import java.util.Scanner;
class Node {
    int data;
    Node next;
    public Node(int data){
        this.data =data;
        this.next = null;
    }
}
class Singlylinkedlist{
    private Node head = null;
    private Node tail = null;
    public void addnode(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
            tail = newnode;

        }else {
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void display(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node current = head;
        System.out.println("nodes of linked list");
        while (current!= null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class Linkedlist {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Singlylinkedlist list = new Singlylinkedlist();
        System.out.println("enter the number of nodes");
        int nodes = in.nextInt();
        for (int i =0;i<nodes;i++){
            System.out.print("enter the nodes");
            int data = in.nextInt();
            list.addnode(data);


        }
        list.display();
        in.close();
    }
    
}
