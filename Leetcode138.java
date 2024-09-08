import java.util.ArrayDeque;
import java.util.Deque;
import java.util.ArrayList;
import java.util.List;
class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode (int x){val=x;}
}
public class Leetcode138 {
    public List<Integer> inorder(Treenode root){
        List<Integer> ans = new ArrayList<>();
        Deque<Treenode> stack = new ArrayDeque<>();
        while(root!=null||stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            ans.add(root.val);
            root = root.right;
        }
        return ans;
    }
    public static void main(String [] args){
        Treenode root = new Treenode(1);
        root.right = new Treenode(2);
        root.right.left = new Treenode(3);
        Leetcode138 solution = new Leetcode138();
        List<Integer> result = solution.inorder(root);
        for(int val:result){
            System.out.println(val+ " ");
        }
    }
    
    
}
