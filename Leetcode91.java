class Trienode{
    public Trienode[] children = new Trienode[26];
    public boolean isword = false;
}
public class Leetcode91 {
    private Trienode root = new Trienode();
    public void addword(String word){
        Trienode node = root;
        for(char c:word.toCharArray()){
            int idx = c-'a';
            if(node.children[idx]==null)
                node.children[idx] = new Trienode();
                node = node.children[idx];
            }
            node.isword=true;
        }
        public boolean search(String word){
            return searchhelper(word,0,root);
        }
        private boolean searchhelper(String word,int idx,Trienode node){
            if(idx==word.length())
            return node.isword;
            char c = word.charAt(idx);
            if(c!='.'){
                int childidx = c-'a';
                Trienode next = node.children[childidx];
                return next!=null&& searchhelper(word,idx+1,next);
            }else{
                for(Trienode child:node.children){
                    if(child!=null&&searchhelper(word,idx+1,child))
                    return true;
                }
                return false;
            }
        }
        public static void main(String [] args){
            Leetcode91 dictionary = new Leetcode91();
            dictionary.addword("apple");
            dictionary.addword("banana");
            dictionary.addword("orange");
    
            System.out.println(dictionary.search("apple")); // Should print true
            System.out.println(dictionary.search("app.e")); // Should print true
            System.out.println(dictionary.search("b.n.n.")); // Should print true
            System.out.println(dictionary.search("grape")); // Should print false
        


    }
    

    
}
