import java.util.Scanner;
class Node{
    int data;
    Node prev,next;
    Node(int data){
        this.data = data;
        this.prev = this.next = null;

    }
}
public class Doublylinkedrotate1 {
    Node head,tail = null;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
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
    public void rotate (int N){
        if (head == null || N ==0) return;
        Node current = head;
        int count = 1;
        while(count<N && current!=null){
            current = current.next;
            count++;
        }
        if(current == null) return;
        Node nthNode = current;
        while(current.next!=null){
            current = current.next;
        }
        current.next = head;
        head.prev = current;
        head = nthNode.next;
        head.prev = null;
        nthNode.next = null;
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
        Doublylinkedrotate1 list = new Doublylinkedrotate1();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n = in.nextInt();
        System.out.println("enter the value of the nodes");
            for(int i =0;i<n;i++){
                int value = in.nextInt();
                list.add(value);
            }
            System.out.println("enter the number of rotation");
            int N = in.nextInt();
            System.out.println("original list");
            list.display();
            list.rotate(N);
            System.out.println("modified list");
            list.display();

        }
    }
   

    

