class Solution {
                                //   method1(recursion)
    // static int count;
    // public void uniquePaths(int stm, int stn, int m, int n){
    //     if(stm==m && stn==n){
    //         count++;
    //         return;
    //     }
    //     if(stm<m)uniquePaths(stm+1, stn, m, n);
    //     if(stn<n)uniquePaths(stm, stn+1, m, n);
    // }
                                //    method 2(recursion)
    // public int recursive(int i, int j, int m, int n){
    //     if(i>m || j>n)return 0;
    //     if(i==m && j==n)return 1;

    //     return recursive(i+1, j, m, n)+ recursive(i, j+1, m, n);
    // }

                                //    method3(memoization)
    // public int solve(int i, int j, int m, int n, int[][] dp){
    //     if(i>=m || j>=n)return 0;
    //     if(i==m-1 && j==n-1)return 1;
    //     if(dp[i][j]!=-1)return dp[i][j];
    //     else return dp[i][j]= solve(i+1, j, m, n, dp) + solve(i, j+1, m, n, dp);
    // }

                                    //  method4(tabulation)
    
    

    public int uniquePaths(int m, int n) {
                                    //  method1
        // count=0;
        // uniquePaths(1, 1, m, n);
        // return count;
                                
                                      // Method2
        // return recursive(1, 1, m, n);

                                      // Method3
        // int[][] dp= new int[m][n];
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         dp[i][j]=-1;
        //     }
        // }
        // return solve(0, 0, m, n, dp);

                                    //   method4
       int[][] dp= new int[m][n];
       for(int i=0; i<m; i++)dp[i][0]=1;
       for(int i=0; i<n; i++)dp[0][i]=1;

       for(int i=1; i<m; i++){
           for(int j=1; j<n; j++){
               dp[i][j]= dp[i-1][j]+ dp[i][j-1];
           }
       }
       return dp[m-1][n-1];
    }
}