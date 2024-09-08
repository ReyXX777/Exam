import java.util.ArrayList;
import java.util.List;

public class Leetcode191 {
    public boolean similar(Treenode root1,Treenode root2){
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        dfs(root1,leaves1);
        dfs(root2,leaves2);
        return leaves1.equals(leaves2);
    }
    public void dfs(Treenode node,List<Integer> leaves){
        if(node==null)
        return;
        if(node.left==null&&node.right==null){
        leaves.add(node.val);
        return;

    }
    dfs(node.left,leaves);
    dfs(node.right,leaves);
}
public static void main(String [] args){
    Treenode node1 = new Treenode(1);
    Treenode node2 = new Treenode(2);
    Leetcode191 solution = new Leetcode191();
    boolean result = solution.similar(node1, node2);
    System.out.println(result);
}


    
}
class Treenode{
    int val;
    Treenode left;Treenode right;
    Treenode(int val){this.val = val;}

}
