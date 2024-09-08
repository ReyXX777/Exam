import java.util.Scanner;
import java.util.HashSet;
class Node{
    int data;
    Node prev,next;
    Node(int data){
        this.data = data;
        this.prev = this.next = null;
    }
}
public class Doublyremoveduplicate {
    Node head,tail = null;
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    public void remove(){
        if(head == null) return;
        HashSet <Integer> seen = new HashSet<>();
        Node current = head;
        while(current!=null){
            if(seen.contains(current.data)){
                Node next = current.next;
                if(current.prev!=null){
                    current.prev.next = current.next;

                }
                if(current.next!=null){
                    current.next.prev = current.prev;
                }
                if(current == head){
                    head = current.next;
                }
                if (current == tail){
                    tail = current.prev;
                }
                current = next;
            }else{
                seen.add(current.data);
                current = current.next;
            }
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
        Doublyremoveduplicate list = new Doublyremoveduplicate();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num of nodes");
        int n = in.nextInt();
        System.out.println("enter the value of nodes");
        for(int i=0;i<n;i++){
            int value = in.nextInt();
            list.add(value);
        }
        System.out.println("original list");
        list.display();
        System.out.println("remove duplicate");
        list.remove();
        System.out.println("modified list");
        list.display();
    }
    
}
