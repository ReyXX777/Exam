import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode(int x){val=x;}

}
public class Leetcode77 {
    public List<Double> average(Treenode root){
        List<Double> res = new LinkedList<Double>();
        Queue<Treenode> q = new LinkedList<Treenode>();
        if(root==null){
            return res;
        }
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            int sum =0;
            for(int i=0;i<n;i++){
                Treenode node = q.poll();
                sum += (double)(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            res.add(sum/(double)n);
        }
        return res;
    }
    public static void main(String [] args){
        Treenode node = new Treenode(3);
        node.left = new Treenode(9);
        node.right = new Treenode(15);
        node.right.left = new Treenode(20);
        node.right.right = new Treenode(7) ;
        Leetcode77 solution = new Leetcode77();
        System.out.println(solution.average(node));
    }
}
