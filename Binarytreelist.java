import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Binarytreelist{
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public Node root;
    public Binarytreelist(){
        root = null;
    }
    public int difference(){
        if(root == null){
            System.out.println("the list is empty");
            return 0;
        }
        int oddlevelsum =0;int evenlevelsum =0;
        Queue<Node> queue  = new LinkedList<>();
        queue.add(root);
        boolean isOddlevel = true;
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            for(int i=0;i<levelsize;i++){
                Node currentNode = queue.poll();
                if(isOddlevel){
                    oddlevelsum += currentNode.data;

                }else{
                    evenlevelsum += currentNode.data;
                }
                if(currentNode.left!=null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.add(currentNode.right);
                }

            }
            isOddlevel = !isOddlevel;


        }
        return Math.abs(oddlevelsum-evenlevelsum);
    }
    public void add(int data){
        root = addnoderecursive(root,data);

    }
    private Node addnoderecursive(Node root,int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        Scanner in = new Scanner(System.in);
        System.out.println("enter left child of" + root.data);
        int leftdata = in.nextInt();
        if(leftdata!=-1){
root.left = addnoderecursive(root.left, leftdata);
        }
        System.out.println("enter right child of" + root.data);
        int rightdata = in.nextInt();
        if(rightdata!=-1){
            root.right = addnoderecursive(root.right, rightdata);


        }
        return root;
    }
    public static void main(String [] args){
        Binarytreelist list = new Binarytreelist();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the root node value");
        int rootvalue = in.nextInt();
        list.add(rootvalue);
        System.out.println("enter the number of additional nodes");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
System.out.println("enter the value of nodes");
int value = in.nextInt();
list.add(value);
        }
        int difference = list.difference();
        System.out.println("the difference between both levels" +difference);
    }
}