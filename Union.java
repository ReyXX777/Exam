public class Union {
    public Union(int n){
        count =n;
        id = new int[n];
        rank = new int[n];
        for(int i=0;i<n;++i)
        id[i]=i;
    }
    public void unionrank(int u,int v){
        int i = find(u);
        int j = find(v);
        if(i==j)
        return;
        if(rank[i]<rank[j]){
            id[i] = j;

        }else if(rank[i]>rank[j]){
            id[j] = i;
        }else{
            id[i] = j;
            ++rank[j];
        }
        --count;
    }
    public int count(){
        return count;
    }
    int count;
    int [] id;
    int [] rank;
    int find(int u){
        return id[u] == u?u:(id[u]=find(id[u]));
    }
}
 class Leetcode197 {
    public int find(int [][] isconnected){
        int n = isconnected.length;
        Union u = new  Union(n);
        for(int i=0;i<n;++i)
        for(int j=i;j<n;++j)
        if(isconnected[i][j]==1)
        u.unionrank(i, j);
        return u.count;
    }
    public static void main(String [] args){
        int [][] isconnected ={
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };
        Leetcode197 solution = new Leetcode197();
        int result = solution.find(isconnected);
        System.out.println(result);
    }

    }
