import java.util.Scanner;
class Node{
    int data;
    Node left,right,middle;
    Node(int data){
        this.data = data;
        this.right = this.left = this.middle = null;

    }
}
public class Ternarytodl {
    Node root;
    Node head,tail = null;
    public void converttotl(Node node){
if(node == null)return;
    Node left = node.left;
    Node right = node.right;
    Node middle = node.middle;
    if(head == null){
        head = tail = node;
    } else {
        tail.right = node;
        node.left = tail;
        tail = node;
    }
    node.middle = null;
    converttotl(left);
    converttotl(right);
    converttotl(middle);
}
public void display(){
    Node current =head;
    while(current!=null){
        System.out.print(current.data + " ");
        current = current.right;
    }
}
public Node insertnode(Node root,int data,char c){
if (root ==null){
    root = new Node(data);
}else if(c == 'l'){
    root.left = insertnode(root.left,data,c);

}else if (c == 'm'){
    root.middle = insertnode(root.middle,data,c);
}else if (c == 'r'){
    root.right = insertnode(root.right,data,c);
}
return root;
}
public static void main(String []args){
    Ternarytodl ternary = new Ternarytodl();
    Scanner in = new Scanner(System.in);
    System.out.println("enter the num of nodes");
    int n = in.nextInt();
    System.out.println("enter the value l/r/m" );
    for (int i =0 ; i< n; i++){
        int data = in.nextInt();
        char c = in.next().charAt(0);
        ternary.root = ternary.insertnode(ternary.root,data,c);
    }
    ternary.converttotl(ternary.root);
    System.out.println("");
    ternary.display();
}
    }
    

