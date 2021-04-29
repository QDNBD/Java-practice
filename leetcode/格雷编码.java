class Solution {
    public List<Integer> grayCode(int n) {
        /**
        关键是搞清楚格雷编码的生成过程, G(i) = i ^ (i/2);
        如 n = 3: 
        G(0) = 000, 
        G(1) = 1 ^ 0 = 001 ^ 000 = 001
        G(2) = 2 ^ 1 = 010 ^ 001 = 011 
        G(3) = 3 ^ 1 = 011 ^ 001 = 010
        G(4) = 4 ^ 2 = 100 ^ 010 = 110
        G(5) = 5 ^ 2 = 101 ^ 010 = 111
        G(6) = 6 ^ 3 = 110 ^ 011 = 101
        G(7) = 7 ^ 3 = 111 ^ 011 = 100
        **/
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 1<<n; i++) {
            list.add(i ^ i>>1);
        }
        return list;
    }
}

//常规的回溯思想
class Solution {
    List<Integer> res = new ArrayList();
    boolean[] visited;
    public List<Integer> grayCode(int n) {
        visited = new boolean[1<<n];
        dfs(0,n);
        return res;
    }
    
    boolean dfs(int cur,int n){ 
        if(res.size()==(1<<n))
            return true;
        res.add(cur);
        visited[cur]=true;
        for(int i=0;i<n;i++){
            int next = cur^(1<<i); //这里改变cur的某一位，用异或
            if(!visited[next]&&dfs(next,n))
                return true;
        }
        visited[cur] = false;
        return false;
        
    }
}