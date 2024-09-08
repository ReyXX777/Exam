public class Leetcode97 {
    private int n;
    private int ans;
    private boolean[] cols = new boolean[10];
    private boolean[] dg = new boolean[20];
    private boolean[] udg = new boolean[20];
    public int totalqueens(int n){
        this.n=n;
        dfs(0);
        return ans;
    }
    private void dfs(int i){
        if(i==n){
            ++ans;
            return;
        }
        for(int j=0;j<n;++j){
            int a=i+j,b=i-j+n;
            if(cols[j]||dg[a]||udg[b]){
                continue;
            }
            cols[j] = true;
            dg[a]=true;
            udg[b] = true;
            dfs(i+1);
            cols[j] = false;
            dg[a] = false;
            udg[b]=false;
        }

    }
    public static void main(String [] args){
        int n=8;
        Leetcode97 solution = new Leetcode97();
        int totalsolutions = solution.totalqueens(n);
        System.out.println(totalsolutions);
    }
    
}
