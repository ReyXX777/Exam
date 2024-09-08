import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode () {}
    Treenode(int val) {this.val = val;}
    Treenode(int val,Treenode left,Treenode right){
        this.val = val;
        this.right = right;
        this.left = left;
    }

}
public class Leetcode67 {
    public Treenode buildtree(int [] inorder,int [] preorder,int psi,int pei,int isi,int iei){
        int idx = isi;
        while(preorder[psi]!=inorder[idx]) idx++;
        int dist = idx - isi;
        Treenode root = new Treenode(preorder[psi]);
        root.left = buildtree(inorder, preorder, psi+1, psi +dist, isi, idx-1);
        root.right = buildtree(inorder, preorder, psi+dist+1, pei, idx+1, iei);
        return root;

    }
    public Treenode buildtree(int [] preorder,int [] inorder){
        int n = preorder.length;
        return buildtree(inorder, preorder,0,n-1,0,n-1);
    }
    public static void main(String [] args){
        int [] preorder = {3,9,20,15,7};
        int [] inorder = {9,3,15,20,7};
        Leetcode67 solution = new Leetcode67();
        Treenode root = solution.buildtree(preorder, inorder);
        printlevelorder(root);
    }
    public static void printlevelorder(Treenode root){
        if(root == null) return;
        Queue<Treenode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Treenode current = queue.poll();
            System.out.println(current.val + " ");
            if(current.left!=null) queue.add(current.left);
            if(current.right!=null) queue.add(current.right);
        }
    }
    
}
