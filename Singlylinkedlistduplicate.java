import java.util.Scanner;
public class Singlylinkedlistduplicate {
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
            if (head == null){
                head = newNode;
            }else {
                Node current = head;
                while(current.next!=null){
                    current = current.next;
                }
                current.next = newNode;
            }

        }
        public void removeDuplicate(){
            Node current = head;
            while(current!=null){
                Node temp = current;
                while(temp.next!=null){
                    if (current.data == temp.next.data){
                        temp.next = temp.next.next;
                    }else{
                        temp  = temp.next;
                    }
                }
                current = current.next;
            }
        }
        public void displayNode(){
            Node current = head;
            if (head == null){
                System.out.println("the list is empty");
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
            Singlylinkedlistduplicate list = new Singlylinkedlistduplicate();
            System.out.println("enter the node");
            int n = in.nextInt();
            for (int i=0;i<n;i++){
                System.out.println("enter the value");
                int value = in.nextInt();
                list.addNode(value);
            }
            System.out.println("original list");
            list.displayNode();
            list.removeDuplicate();
            System.out.println("new list");
            list.displayNode();
        }
    }
    

