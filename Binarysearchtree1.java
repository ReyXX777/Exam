import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Binarysearchtree1 {
    static class Node{
        int data;
        Node left,right;
        Node(int item){
data = item;
left = right = null;
        }
    }
    Node root;
    Binarysearchtree1(){
        root = null;
    }
    void insert(int data){
        root = insertRec(root,data);
    }
    Node insertRec(Node root,int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        Scanner in = new Scanner(System.in);
        System.out.println("enter left child of" + root.data);
        int leftdata = in.nextInt();
        if(leftdata!=-1){
            root.left = insertRec(root.left, leftdata);
        }
        System.out.println("enter right child of" + root.data);
        int rightdata = in.nextInt();
        if(rightdata!=-1){
       root.right = insertRec(root.right, rightdata);

    }
    return root;
    
}
void storeInorder(Node node,ArrayList<Integer> inorder){
    if(node==null){
        return;
    }
    storeInorder(node.left, inorder);
    inorder.add(node.data);
    storeInorder(node.right, inorder);
}
void binarytree1(){
    ArrayList<Integer> inorder = new ArrayList<>();
    storeInorder(root, inorder);
    Collections.sort(inorder);
    index = 0;
    arraytobst(root,inorder);


}
int index;
void arraytobst(Node node,ArrayList<Integer> inorder){
    if(node == null){
        return;
    }
    arraytobst(node.left, inorder);
    node.data = inorder.get(index++);
    arraytobst(node.right, inorder);

}
void inorder(){
    inorderRec(root);

}
void inorderRec(Node root){
    if(root!=null){
        inorderRec(root.left);
        System.out.print(root.data + " ");
        inorderRec(root.right);
    }
}
public static void main(String [] args){
    Binarysearchtree list = new Binarysearchtree();
    Scanner in = new Scanner(System.in);
    System.out.println("enter the root node value");
    int rootvalue = in.nextInt();
    list.insert(rootvalue);
    System.out.println("enter the number of additional nodes");
    int n = in.nextInt();
    for(int i=0;i<n;i++){
        System.out.println("enter the value of node" + (i+1));
        int value = in.nextInt();
        list.insert(value);
    }
    System.out.println("in order traversal of the binary tree");
    list.inorder();
    System.out.println();
   
    System.out.println("in order traversal of the converted");
    list.inorder();
}
}
