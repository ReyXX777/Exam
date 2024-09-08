import java.util.Scanner;
class Singlylinkedlist1 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head = null;
    public void addnode(int data){
        Node newnode = new Node(data);
        if (head==null){
            head = newnode;
        }else {
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newnode;
        }
    }
    public int countnodes() {
        int count =0;
        Node current = head;
        while(current!=null){
            count++;
            current =current.next;
        }
        return count;


    }
    public void displaynode(){
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
        Singlylinkedlist1 list = new Singlylinkedlist1();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num of nodes");
        int nodes = in.nextInt();
        for (int i=0;i<nodes;i++){
            System.out.println("enter value");
            int value = in.nextInt();
            list.addnode(value);
        }
        list.displaynode();
        System.out.println("total number of nodes" + list.countnodes());
    }
}