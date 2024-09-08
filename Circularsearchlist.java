import java.util.Scanner;
public class Circularsearchlist {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
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
            tail = newNode;
            newNode.next = head;
        }
    }
    public void search(int element){
        Node current = head;
        int position = 1;
        boolean found = false;
        if (head ==null){
            System.out.println("the list is empty");
        }else{
            do{
                if(current.data == element){
                    found = true;
                    break;
                }
                current = current.next;
                position++;
            }while(current!=head);
            if(found){
                System.out.println("the position of the element is at the index" + position);
            }else{
                System.out.println("the position is not in the list");
            }
        }
    }
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("the list is empty");
        }else{
            do{
                System.out.print(current.data + " ");
                current = current.next;
            }while(current!=head);
            System.out.println();
        }
    }
    public static void main(String [] args){
        Circularsearchlist list = new Circularsearchlist();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n = in.nextInt();
        System.out.println("enter the value of the nodes");
        for(int i=0;i<n;i++){
        int value = in.nextInt();
        list.add(value);
        }
    System.out.println("the original list");
    list.display();
    System.out.println("enter the element to search");
    int element = in.nextInt();
    list.search(element);
    
}
}
