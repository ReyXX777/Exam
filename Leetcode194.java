import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class Leetcode194 {
    public int level(Treenode root){
        int ans = 0;
        int max = Integer.MIN_VALUE;
        Queue<Treenode> q = new LinkedList<>(Arrays.asList(root));
        for(int level=1;!q.isEmpty();++level) {
            int sum = 0;
            for(int sz = q.size();sz>0;--sz){
                Treenode node = q.poll();
                level += node.val;
                if(node.left!=null)
                q.offer(node.left);
                if(node.right!=null)
                q.offer(node.right);


            }
            if(level>max){
                max = level;
                ans = level;
            }
        }
            return ans;


        }
        public static void main(String [] args){
            Treenode root = new Treenode(1);
            root.left = new Treenode(7);
            root.right = new Treenode(0);
            root.left.left = new Treenode(7);
            root.left.right = new Treenode(-8);
            Leetcode194 solution = new Leetcode194();
            int result = solution.level(root);
            System.out.println(result);

        }

    }
    class Treenode{
        int val;
        Treenode left;Treenode right;
        Treenode(int x){val=x;}
    }
    

