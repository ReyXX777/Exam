import java.util.Scanner;
public class Singlydeletemiddle{
static class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next=null;
    }
}
private Node head = null;
public void addNode(int data){
    Node newNode = new Node(data);
    if (head==null){
        head = newNode;
    }else {
        Node current = head;
        while(current.next!=null){
            current = current.next;

        }
        current.next = newNode;
    }
}
public void deleteMiddleNode(){
    if (head==null){
        System.out.println("no nodes in the list");
        return;
    }if(head.next==null){
        head = null;
        System.out.println("one node that has been deleted");
        return;
    }
    Node slow = head;
    Node fast = head;
    Node prev = null;
    while(fast!=null && fast.next!=null){
        fast = fast.next.next;
        prev = slow;
        slow = slow.next;
    }
    if (prev!=null){
        prev.next = slow.next;
        System.out.println("node deleted");
    }


    }
    public void displayNode(){
        Node current = head;
        if(head==null){
            System.out.println("list is empty");
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
        Singlydeletemiddle list = new Singlydeletemiddle();
        System.out.println("enter the number of nodes");
        int n = in.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("enter the value");
            int value = in.nextInt();
            list.addNode(value);
        }
        System.out.println("original list");
        list.displayNode();
        System.out.println("do you want to delete the node");
        String response = in.next();
        if (response.equalsIgnoreCase("yes")){
            list.deleteMiddleNode();
            System.out.println("new list");
            list.displayNode();
        }else{
            System.out.println("no nodes were deleted");
        }
    }
}
 
