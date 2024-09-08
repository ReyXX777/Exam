import java.util.Scanner;
public class Binarysearchtree {
    static class Node{
        int key;
        Node left,right;
        Node(int data){
             key = data;
            left = right = null;
        }
    }
    Node root;
    Binarysearchtree(){
        root = null;
    }
    void insert(int key){
        root = insertRec(root,key);

    }
    Node insertRec(Node root,int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key<root.key)
        root.left = insertRec(root.left, key);
        else if(key>root.key)
        root.right = insertRec(root.right, key);
        return root;
    }
    void delete(int key){
        root = deleteRec(root,key);

    }
    Node deleteRec(Node root,int key){
        if(root == null) return root;
        if(key<root.key)
        root.left = deleteRec(root.left, key);
        else if(key>root.key)
        root.right = deleteRec(root.right, key);
        else{
            if(root.left == null)
            return root.right;
            else if(root.right== null)
            return root.left;
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, key);

            }
            return root;
        }
        int minValue(Node root){
            int minv = root.key;
            while(root.left!=null){
                minv = root.left.key;
                root = root.left;
            }
            return minv;
        }
        void inorder(){
            inorderRec(root);
        }
        void inorderRec(Node root){
            if(root!=null){
                inorderRec(root.left);
                System.out.print(root.key + " ");
                inorderRec(root.right);
            }
        }
        public static void main(String [] args){
            Binarysearchtree list = new Binarysearchtree();
            Scanner in = new Scanner(System.in);
            System.out.println("enter the number of nodes to insert");
            int n = in.nextInt();
            System.out.println("enter the nodes value");
            for(int i=0;i<n;i++){
                int value = in.nextInt();
                list.insert(value);
            }
            System.out.println("in order traversal of the bst");
            list.inorder();
            System.out.println();
            System.out.println("enter the node value to delete");
            int value = in.nextInt();
            list.delete(value);
            System.out.println("in order traversal of the bst");
            list.inorder();
            System.out.println();
        }
    }
    

