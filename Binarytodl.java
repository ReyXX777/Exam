import java.util.Scanner;
class Node{
    int data;
    Node left,right;
   public Node(int data){
        this.data = data;
        this.left = this.right =null;

    }
}
public class Binarytodl{
    Node root;
    Node head,tail = null;
    public void converttodl(Node node){
        if(node == null) return;
        converttodl(node.left);
        if(head == null){
            head = tail = node;
        }else{
            tail.right = node;
            node.left = tail;
            tail = node;
        }
        converttodl(node.right);

    }
    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.right;
        }
    }
    public Node insertnode(Node root,int data){
        if (root == null){
            root = new Node(data);

        }else if(data<=root.data){
            root.left = insertnode(root.left, data);

        }else {
            root.right = insertnode(root.right, data);
        }
        return root;
    }
    public static void main(String [] args){
        Binarytodl binary = new Binarytodl();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num of nodes");
        int n = in.nextInt();
        System.out.println("enter the nodes");
        for (int i =0;i<n;i++){
            int data = in.nextInt();
            binary.root = binary.insertnode(binary.root, data);
        }
        binary.converttodl(binary.root);
        System.out.println("binary tree");
        binary.display();
    }

}

