import java.util.Scanner;
class Node{
    int data;
    Node prev,next;
    Node(int data){
        this.data = data;
        this.prev = this.next = null; 
    }
}
public class Doblylinkedmiddle {
    Node head,tail = null;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            head.prev = null;
            tail.next = null;

        }else{
            tail.next =newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    public void insert(int data){
       if(head==null){
        add(data);
        return;
       }
       Node newNode = new Node(data);
       Node slow = head;
       Node fast = head;
       while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
       }
       newNode.next = slow.next;
       newNode.prev = slow;
       if(slow.next!=null){
        slow.next.prev = newNode;

       }
       slow.next = newNode;
       if(newNode.next == null){
        tail = newNode;
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
    Doblylinkedmiddle list = new Doblylinkedmiddle();
    Scanner in = new Scanner(System.in);
    System.out.println("enter the num of nodes");
    int n = in.nextInt();
    System.out.println("enter the value of the nodes");
    for(int i=0;i<n;i++){
        int value = in.nextInt();
        list.add(value);
    }
    System.out.println("doubly linked list");
    list.display();
    System.out.println("enter the num to fit");
    int data = in.nextInt();
    list.insert(data);
    System.out.println("modified list");
    list.display();
}
    
}
