class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       if(matrix == null || matrix.length == 0) return new ArrayList<>();
        
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        
        int u = 0, d = m - 1, l = 0, r = n - 1;
        for(;;) {
            for(int i = l; i <= r; i ++) res.add(matrix[u][i]);
            if(++ u > d) break;
            
            for(int i = u; i <= d; i ++) res.add(matrix[i][r]);
            if(-- r < l) break;
            
            for(int i = r; i >= l; i --) res.add(matrix[d][i]);
            if(-- d < u) break;
            
            for(int i = d; i >= u; i --) res.add(matrix[i][l]);
            if(++ l > r) break;
        }
        
        return res;
    }
}