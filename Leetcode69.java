class Node{
    public int val;
    public Node left;
    public Node right;
    public Node next;
    public Node () {}
    public Node(int val) {
        this.val = val;
    }
    public Node(int val,Node left,Node right,Node next){
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }

}
public class Leetcode69 {
    private Node prev,next;
    public Node connect(Node root){
        Node node = root;
        while(node!=null){
            prev = null;
            next = null;
            while(node!=null){
                modify(node.left);
                modify(node.right);
                node = node.next;
            }
            node = next;
        }
        return root;
    }
    private void modify(Node curr){
        if(curr==null){
            return;
        }
        if(next==null){
            next=curr;
        }
        if(prev!=null){
            prev.next = curr;
        }
        prev = curr;
    }
    public static void main(String [] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);
        Leetcode69 solution = new Leetcode69();
        root = solution.connect(root);
        printnextpointer(root);
    }
    public static void printnextpointer(Node root){
        Node levelstart = root;
        while(levelstart!=null){
            Node current = levelstart;
            while(current!=null){
                System.out.print(current.val + " ");
                if(current.next!=null){
                    System.out.print(current.next.val + " ");
                }else {
                    System.out.print("null");
                }
                current = current.next;
            }
            System.out.println();
            levelstart = levelstart.left;
        }

    }
    
}
