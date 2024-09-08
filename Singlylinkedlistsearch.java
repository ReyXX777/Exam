import java.util.Scanner;
public class Singlylinkedlistsearch {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    
    private Node head = null;
    public void addNode(int data){
    Node newNode = new Node(data);
        if (head ==null){
            head = newNode;
        }else {
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;

        }
    }
public boolean searchNode(int data){
    Node current = head;
    while(current!=null){
        if (current.data==data){
            return true;
        }
        current = current.next;
    }
    return false;
}
public void displayNode(){
    Node current = head;
    if(head==null){
System.out.println("the list is empty");
return;

    }
    System.out.println("the nodes in the list");
    while(current!=null){
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}
public static void main(String [] args){
    Scanner in  = new Scanner(System.in);
    Singlylinkedlistsearch list = new Singlylinkedlistsearch();
    System.out.println("enter the num of nodes");
    int n = in.nextInt();
    for(int i=0;i<n;i++){
        System.out.println("enter the value");
        int value = in.nextInt();
        list.addNode(value);
    }
    System.out.println("original list");
    list.displayNode();
    System.out.println("enter the nodes to search");
    int search = in.nextInt();
    boolean found = list.searchNode(search);
    if(found){
        System.out.println("node present in the list");
    }else {
        System.out.println("node not present in the list");
    }
    
}

    
}
