import java.util.Scanner;
public class Singlylinkedlistdelete {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head =null;
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head =newNode;
        }else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void deleteNode(){
        if (head == null){
            System.out.println("list is empty");
        }else{
            head = head.next;
            System.out.println("node deleted from beginning");
        }
    }
    public void displayNode(){
        Node current = head;
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        System.out.println("nodes in the list");
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    System.out.println();
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Singlylinkedlistdelete list = new Singlylinkedlistdelete();
        System.out.println("enter no of nodes");
        int n = in.nextInt();
        for (int i =0;i<n;i++){
System.out.println("enter the value");
int value = in.nextInt();
list.addNode(value);
        }
        System.out.println("original list");
        list.displayNode();
        System.out.println("do you want to delete the node yes/no");
        String response = in.next();
        if(response.equalsIgnoreCase("yes")){
            list.deleteNode();
            System.out.print("display new list");
            list.displayNode();
        }else{
            System.out.println("no nodes were deleted");

        }
    }
}
