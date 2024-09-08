import java.util.Scanner;
     class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    class Circular{
    private Node head = null;
    private Node tail = null;
    public void addNode(int data){
        Node newNode = new Node(data);
            if (head == null){
                head = newNode;
                tail = newNode;
                newNode.next = head;
            }else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;

            }

        }
        public void displayNode(){
            Node current = head;
            if (head == null){
                System.out.println("the list is empty");
            }else {
                System.out.println("nodes of current list");
                do{
                    System.out.print(current.data + " ");
                    current = current.next;
                }while(current!=head);
                System.out.println();
            }
        }

    }
    public class CircularLinkedList1 {
        public static void main(String [] args){
            Circular list = new Circular();
            Scanner in = new Scanner(System.in);
            System.out.println("enter the num of nodes");
            int n = in.nextInt();
            for(int i =0;i<n;i++){
                System.out.println("enter the nodes");
                int data = in.nextInt();
                list.addNode(data);
            }
            list.displayNode();
        }
    


    }
    

