class Solution {
    public long matrixSumQueries(int n, int[][] queries) {
        // boolean[][] boolmatrix= new boolean[n][n];
        boolean[] row= new boolean[n];
        boolean[] column= new boolean[n];
        int rowCount=n;
        int columnCount=n;
        long sum=0;
        
        for(int i=queries.length-1; i>=0; i--){
            int type= queries[i][0];
            int indx= queries[i][1];
            int val= queries[i][2];
            
            if(type==0 && !row[indx]){
                sum+= val*columnCount;
                row[indx]=true;
                rowCount--;
            }else if(type==1 && !column[indx]){
                sum+= val*rowCount;
                column[indx]=true;
                columnCount--;
            }
        }
        return sum;
        
    }
}