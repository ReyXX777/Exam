import java.util.ArrayList;
import java.util.List;
class Treenode{
    int val;
    Treenode right;
    Treenode left;
    Treenode(int x){val=x;}
}
public class Leetcode81 {
    private void inorder(Treenode root,List<Integer> arr){
        if(root!=null){
            inorder(root.left,arr);
            arr.add(root.val);
            inorder(root.left,arr);
        }
    }
    public int kthsmallest(Treenode root,int k){
        List<Integer> inorderlist = new ArrayList<>();
        inorder(root,inorderlist);
        return inorderlist.get(k-1);
    }
    public static void main(String [] args){
        Treenode root = new Treenode(0);
        root.left = new Treenode(3);
        root.right = new Treenode(1);
        root.right.left = new Treenode(4);
        root.right.right = new Treenode(2);
        Leetcode81 solution = new Leetcode81();
        int k=2;
        int result = solution.kthsmallest(root, k);
        System.out.println("the kth smallest number" +result);
    }
}
