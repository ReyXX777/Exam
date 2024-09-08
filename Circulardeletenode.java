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
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    public void deletenode(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }else if(head==tail){
            head = null;
            tail = null;
        }else{
            head = head.next;
            tail.next = head;
        }
    }
    public void displayNode(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        Node current = head;
        System.out.println("the nodes of the list");
        do{
            System.out.print(current.data+ " ");
            current = current.next;
        }while(current!=head);
        System.out.println();
    }
}
public class Circulardeletenode {
    public static void main(String [] args){
        Circularlist list = new Circularlist();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num of nodes");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter the node");
            int value = in.nextInt();
            list.addNode(value);

        }
        System.out.println("original list");
        list.displayNode();
        list.deletenode();
        System.out.println("new list" );
        list.displayNode();


    }
}
