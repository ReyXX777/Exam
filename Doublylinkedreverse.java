import java.util.Scanner;
class Node{
    int data;
    Node prev,next;
    Node(int data){
        this.data = data;
        this.prev = this.next = null;
    }
}
public class Doublylinkedreverse {
    Node head,tail  = null;
    public void add(int data){
        Node node = new Node(data);
        if(head == null){
            head = tail = node;
            head.next = null;
head.prev = null;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = null;

        }
    }
    public void reverse(){
        Node current = tail;
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.prev;
        }

    }
    public static void main(String [] args){
        Doublylinkedreverse list = new Doublylinkedreverse();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num of nodes");
        int n = in.nextInt();
        System.out.println("enter the value of the node");
        for(int i=0;i<n;i++){
            int data = in.nextInt();
            list.add(data);
        }
        System.out.println("list in reverse");
        list.reverse();
    }
    
}
