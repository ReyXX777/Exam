public class Leetcode195 {
    public Treenode delete(Treenode root,int key){
        if(root==null)
        return null;
        if(root.val==key){
            if(root.left==null)
                return root.right;
                if(root.right==null)
                return root.left;
                Treenode min = min(root.right);
                root.right = delete(root.right, min.val);
                min.left = root.left;
                min.right = root.right;
                root = min;

            }else if(root.val<key){
                root.right = delete(root.right, key);

            }else{
                root.left = delete(root.left, key);
            }
            return root;
        }
        private Treenode min(Treenode node){
            while(node.left!=null)
            node = node.left;
            return node;
        }
        public static void main(String [] args){
            Treenode root = new Treenode(5);
            root.left = new Treenode(3);
    root.right = new Treenode(6);
    root.left.left = new Treenode(2);
    root.left.right = new Treenode(4);
    root.right.right = new Treenode(7);
    Leetcode195 solution = new Leetcode195();
    int key = 3;
    Treenode result = solution.delete(root, key);
    System.out.println(result);
        }
    }
    class Treenode{
        int val;
        Treenode left;Treenode right;
        Treenode(int x){val=x;}
    }
    

