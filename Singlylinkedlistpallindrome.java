import java.util.Scanner;
import java.util.Stack;
public class Singlylinkedlistpallindrome{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next = null;
        }
    }
        private Node head = null;
        public void addNode(int data){
            Node newNode = new Node(data);
            if (head==null){
                head = newNode;
            }else{
                Node current = head;
                while(current.next!=null){
                  current =  current.next;

                }
                current.next = newNode;
            }

        }
        public boolean isPallindrome(){
            if(head==null){
                return true;
            }
            Stack <Integer> stack = new Stack<>();
            Node current = head;
            while(current!=null){
                stack.push(current.data);
                current = current.next;
            }
            current = head;
            while(current!=null){
                int top = stack.pop();
                if(current.data !=top){
                    return false;
                }
                current = current.next;
            }
            return true;
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
    Singlylinkedlistpallindrome list = new Singlylinkedlistpallindrome();
    System.out.println("enter num of nodes");
    int n = in.nextInt();
    for (int i=0;i<n;i++){
        System.out.println("enter the nodes");
        int  value = in.nextInt();
        list.addNode(value);

    }
    System.out.println("original list");
    list.displayNode();
    if (list.isPallindrome()){
        System.out.println("the list is pallindrome");
    }else {
        System.out.println("the list is not pallindrome");
    }
}
    }
