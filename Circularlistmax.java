import java.util.Scanner;
public class Circularlistmax {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }
    private Node head = null;
    private Node tail = null;
    public void add(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

    }
    public void min(){
        Node current = head;
        int min = head.data;
        if (head == null){
            System.out.println("the list is empty");
        }else{
            do{
                if (min>current.data){
min = current.data;
                }
                current = current.next;
            }while (current!=head);
            System.out.println("the min of the list" + min);
        }
    }
    public void max(){
        Node current = head;
        int max = head.data;
        if (head == null){
            System.out.println("the list is empty");
        }else {
            do{
                if (max <current.data){
max = current.data;
                }
                current = current.next;
            }while(current!=head);
                System.out.println("the max of the list" + max);
            }
        }
        public static void main(String [] args){
            Circularlistmax list = new Circularlistmax();
            Scanner in = new Scanner(System.in);
            System.out.println("enter the num of nodes");
            int n = in.nextInt();
            System.out.println("enter the value of nodes");
            for (int i =0;i<n;i++){
            int value  = in.nextInt();
            list.add(value);
            
        }
        list.max();
        list.min();
    }
}
