import java.util.Scanner;
public class Singlylinkedlistmax {
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
        if (head==null){
            head = newNode;
        }else {
            Node current = head;
            while (current.next!=null){
                current = current.next;
            }
            current.next =newNode;
        }
    }
    public int findMax(){
        if (head == null){
            throw new IllegalStateException("the list is empty");
        }
        int max = head.data;
        Node current = head.next;
        while(current!=null){
            if(current.data>max){
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }
    public int findMin(){
        if(head==null){
            throw new IllegalStateException("the list is empty");
        }
        int min = head.data;
        Node current = head.next;
        while(current!=null){
            if(current.data<min){
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }
    public void displayNode(){
        Node current = head;
        if(head==null){
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
        Singlylinkedlistmax list = new Singlylinkedlistmax();
        System.out.println("enter the number of nodes");
        int n = in.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("enter value");
            int value = in.nextInt();
            list.addNode(value);
        }
        System.out.println("original list");
        list.displayNode();
        try {
            int max = list.findMax();
            int min = list.findMin();
            System.out.println("the max node in the list" + max);
            System.out.println("the min nodes is" + min);
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }
}
