import java.util.Scanner;
public class Removeduplicate{
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            
        }
    }
    public Node head = null;
    public Node tail = null;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;


        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    public void removeduplicate(){
        Node current = head, index = null, temp = null;
        if (head == null){
            System.out.println("the list is empty");
        }else{
            do{
                temp = current;
                index = current.next;
                while(index!=head){
                    if(current.data==index.data){
                        temp.next = index.next;
                    }else{
                        temp = index;
                    }
                    index = index.next;
                }
                current = current.next;
            }while(current.next!=head);
        }
    }
    public void display(){
        Node current = head;
        if(head==null){
            System.out.println("list is empty");
        }else{
            do{
                System.out.print(current.data + " ");
                current = current.next;
            }while(current!=head);
            System.out.println();
        }
    }
public static void main(String [] args){
    Removeduplicate list = new Removeduplicate();
    Scanner in = new Scanner(System.in);
    System.out.println("enter num of nodes");
    int n = in.nextInt();
    System.out.println("enter the value of the nodes");
    for(int i =0;i<n;i++){
        int value = in.nextInt();
        list.add(value);
    }
    System.out.println("original list");
    list.display();
    list.removeduplicate();
    System.out.println("modified list");
    list.display();
}
    
}
