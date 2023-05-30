class Solution {
    public int matrixScore(int[][] grid) {
        
        for(int i=0; i<grid.length; i++){
            if(grid[i][0]==0){
                for(int j=0; j<grid[i].length; j++){
                    if(grid[i][j]==0)grid[i][j]=1;
                    else grid[i][j]=0;
                }
            }
        }
        
        for(int i=1; i<grid[0].length; i++){
            int oneCount=0;
            for(int j=0; j<grid.length; j++){
                if(grid[j][i]==1)oneCount++;
            }
            if(oneCount<=grid.length/2){
                for(int j=0; j<grid.length; j++){
                    if(grid[j][i]==0)grid[j][i]=1;
                    else grid[j][i]=0;
                }
            }
        }
        
        int ans=0;
        for(int i=0; i<grid.length; i++){
            int rowNum=0;
            int n=0;
            for(int j=grid[i].length-1; j>=0; j--){
                rowNum+= grid[i][j]*Math.pow(2,n);
                n++;
            }
            ans+= rowNum;
        }
        return ans;
        
    }
}