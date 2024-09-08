import java.util.Scanner;
class Node{
    int data;
    Node prev,next;
    public Node(int data){
        this.data = data;
        this.prev = this.next = null;
    }
}
public class Doublylinkedsort {
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
    public void sort(){
        if(head == null) return;
        Node current =head,index =null;
        int temp;
        while(current!=null){
            index = current.next;
            while(index!=null){
                if(current.data>index.data){
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;

            }
            current = current.next;
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
        Doublylinkedsort list  = new Doublylinkedsort();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n = in.nextInt();
        System.out.println("enter the value of the nodes");
        for(int i =0;i<n;i++){
            int value = in.nextInt();
            list.add(value);
        }
        System.out.println("original list");
        list.display();
        list.sort();
        System.out.println("modified list");
        list.display();
    }
    
}
