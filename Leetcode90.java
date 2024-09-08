class Trienode{
    public Trienode[] children= new Trienode[26];
    public boolean isword = false;
}
public class Leetcode90 {
    private Trienode root = new Trienode();
    public void insert(String word){
        Trienode node = root;
        for (final char c:word.toCharArray()){
            final int i = c-'a';
            if(node.children[i]==null)
            node.children[i] = new Trienode();
            node = node.children[i];

        }
        node.isword =true;

    }
    public boolean search(String word){
        Trienode node = find(word);
        return node!=null&node.isword; 
    }
    public boolean startprefix(String prefix){
        return find(prefix)!=null;
    }
    private Trienode find(String prefix){
        Trienode node=root;
        for(final char c:prefix.toCharArray()){
            final int i = c-'a';
            if(node.children[i]==null)
            return null;
            node = node.children[i];


        }
        return node;
    }
    public static void main(String[] args){
        Leetcode90 trie = new Leetcode90();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startprefix("apple"));
        trie.insert("apple");
    }
    
}
