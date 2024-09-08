import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Circularlist{
private Node head = null;
private Node tail = null;
public void add(int data){
    Node newNode = new Node(data);
    if (head == null){
        head = newNode;
        tail = newNode;
        newNode.next = head;

    }else{
       newNode.next = head;
       head = newNode;
       tail.next = head;

    }
}
public void display(){
    if (head == null){
        System.out.println("the list is empty");
        return;
    }
    Node current = head;
    System.out.println("the nodes of the list");
    do{
        System.out.print(current.data + " ");
        current = current.next;
    }while(current!=head);
    System.out.println();
}
}

public class Circularlinkedlistadd1 {
    public static void main(String [] args){
        Circularlist list = new Circularlist();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n = in.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("enter the value");
            int value = in.nextInt();
            list.add(value);
        }
        System.out.println("the nodes of the list");
        list.display();
    }
    
}

