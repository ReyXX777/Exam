import java.util.Scanner;
class Node{
    int data;
    Node next,prev ;
    Node(int data){
        this.data = data;
        this.next = this.prev = null;
    }
}
public class Doublylinkeddelete {
   
    Node head,tail = null;
    public void add(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            head.prev = null;
            tail.next = null;

        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    public void deletenode(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }else if(head == tail){
            head = tail = null;
        }else {
            tail = tail.prev;
            tail.next = null;
        }
    }
    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String [] args){
        Doublylinkeddelete list = new Doublylinkeddelete();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num of nodes");
        int n = in.nextInt();
        System.out.println("enter the value of the nodes");
        for (int i =0;i<n;i++){
            int value = in.nextInt();
            list.add(value);

        }
        System.out.println("original list");
        list.display();
        list.deletenode();
        System.out.println("modified list");
        list.display();
    }
    
}
