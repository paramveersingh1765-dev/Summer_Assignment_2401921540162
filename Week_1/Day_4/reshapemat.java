class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(r*c!=m*n) return mat;
        int [][] ans=new int[r][c];
        int [] help=new int[r*c];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                help[n*i+j]=mat[i][j];
            }
        }
        for(int i=0;i<help.length;i++){
            ans[i/c][i%c]=help[i];
        }
        return ans;
    }
}