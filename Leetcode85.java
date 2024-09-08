import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
class Node{
    public int val;
    public List<Node> neighbor;
    public Node(){
        val = 0;
        neighbor = new ArrayList<Node>();
    }
    public Node(int val){
        val = -val;
        neighbor = new ArrayList<>();
    }
public Node(int _val,ArrayList<Node> _neighbor ){
    val = _val;
    neighbor = _neighbor;
}
}
public class Leetcode85 {
    private Map<Node,Node> visited = new HashMap<>();
    public Node clone(Node node){
        if(node==null){
            return null;
        }
        if(visited.containsKey(node)){
            return visited.get(node);
        }
        Node clone = new Node(node.val);
        visited.put(node, clone);
        for(Node neighbor:node.neighbor){
            clone.neighbor.add(clone(neighbor));
        }
        return clone;
    }
    public static void main(String [] args){
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        node1.neighbor.add(node2);
        node1.neighbor.add(node4);
        node2.neighbor.add(node1);
        node2.neighbor.add(node3);
        node3.neighbor.add(node2);
        node3.neighbor.add(node4);
        node4.neighbor.add(node1);
        node4.neighbor.add(node3);
        Leetcode85 solution = new Leetcode85();
        Node clonegraph = solution.clone(node1);
        System.out.println("cloned value"+clonegraph.val);
        for(Node neighbor:clonegraph.neighbor){
            System.out.println("neighbor"+neighbor.val);
        }

    }

    
}
