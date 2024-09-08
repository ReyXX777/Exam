import java.util.Scanner;
class Node{
    int data;
    Node prev,next;
    Node(int data){
        this.data = data;
        this.prev = this.next = null;
    }
}
public class Doublylinkedsearch {
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
    public int search(int value){
        Node current = head;
        int position = 1;
        while(current!=null){
            if(current.data == value){
                return position;
            }
            current = current.next;
            position++;
        }
        return -1;

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
        Doublylinkedsearch list = new Doublylinkedsearch();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num of nodes");
        int n = in.nextInt();
        System.out.println("enter the value of the nodes");
        for(int i =0;i<n;i++){
            int value = in.nextInt();
            list.add(value);
        }
        System.out.println("original list");
        list.display();
        System.out.println("enter the value to search");
        int N = in.nextInt();

        int postition = list.search(N);
        if(postition!=-1){
            System.out.println("element found at position" + postition);
        }else{
            System.out.println("element not in the list");
        }

    }
}
