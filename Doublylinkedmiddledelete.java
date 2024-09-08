import java.util.Scanner;
class Node{
    int data;
    Node prev,next;
    Node(int data){
        this.data = data;
        this.prev = this.next = null ;
    }
}
public class Doublylinkedmiddledelete {
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
public void delete(){
    if(head == null){
        System.out.println("list is empty");
        return;
    }
    Node slow = head;
    Node fast = head;
    while(fast!=null&& fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }
    if(slow.prev!=null){
        slow.prev.next = slow.next;
    }if(slow.next!=null){
        slow.next.prev = slow.prev;
    }
    if (slow == head){
        head = slow.next;
    }
    if(slow == tail){
        tail = slow.prev;
    }

    }
    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " " );
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String [] args){
        Doublylinkedmiddledelete list = new Doublylinkedmiddledelete();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("enter the value for the nodes");
        for(int i=0;i<n;i++){
            int value = in.nextInt();
            list.add(value);
        }
        System.out.println("doubly linked list");
        list.display();
        System.out.println("modified list");
        list.delete();
        list.display();

    }
}
    

