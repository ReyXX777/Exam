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
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;

        }else{
            tail.next = newNode;
            tail =newNode;
            tail.next = head;
        }
    }
    public void addNode(int data){
if (head == null){
    add(data);
    return;
}
Node newNode = new Node(data);
Node slow = head;
Node fast = head;
while(fast.next!=head && fast.next.next!=head){
    slow = slow.next;
    fast = fast.next.next;
} 
newNode.next = slow.next;
slow.next = newNode;
    }
    public void display(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        Node current = head;
        System.out.println("node of the list");
        do{
            System.out.print(current.data + " ");
            current = current.next;
        }while(current!=head);
        System.out.println();

    }
}

public class Circularlinkedlistmiddle1 {
    public static void main(String []args){
        Circularlist list = new Circularlist();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num of nodes");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter the value");
            int value = in.nextInt();
            list.add(value);
        }
        System.out.println("original list");
        list.display();
        System.out.println("enter the value to be inserted");
        int value = in.nextInt();
        list.addNode(value);
        System.out.println("the list new list");
        list.display();
    }
    
}
