import java.util.ArrayList;
import java.util.List;
class Trienode{
    public Trienode[] children = new Trienode[26];
    public String word;
}
public class Leetcode211 {
    public List<List<String>> suggested(String [] products,String search){
        List<List<String>> ans = new ArrayList<>();
        for(String product:products)
    insert(product);
    Trienode node = root;
    for(char c :search.toCharArray()){
        if(node==null || node.children[c-'a']==null){
            node = null;
            ans.add(new ArrayList<>());
            continue;
        }
        node = node.children[c-'a'];
        ans.add(search(node));
    }
    return ans;
    }
    private Trienode root = new Trienode();
    private void insert(String word){
        Trienode node = root;
        for(char c:word.toCharArray()){
            int i = c-'a';
            if(node.children[i]==null)
            node.children[i] = new Trienode();
            node = node.children[i];
        }
        node.word = word;
    }
    private List<String> search(Trienode node){
        List<String> res = new ArrayList<>();
        dfs(node,res);
        return res;
    }
    private void dfs(Trienode node,List<String>ans){
        if(ans.size()==3)
        return;
        if(node==null)
        return;
        if(node.word!=null)
        ans.add(node.word);
        for(Trienode child:node.children)
        dfs(child,ans);
    }
    public static void main(String [] args){
        Leetcode211 solution = new Leetcode211();
        String [] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String search = "mouse";
        List<List<String>> result = solution.suggested(products, search);
        System.out.println(result);
    }
    
}
