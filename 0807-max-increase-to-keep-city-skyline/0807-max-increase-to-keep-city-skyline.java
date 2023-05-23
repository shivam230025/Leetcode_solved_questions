class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] maxRow= new int[grid.length];
        int[] maxColumn= new int[grid[0].length];
        
        for(int i=0; i<maxRow.length; i++){
            int maxRowValue= Integer.MIN_VALUE;
            for(int j=0; j<grid[i].length; j++){
                maxRowValue= Math.max(maxRowValue, grid[i][j]);
            }
            maxRow[i]= maxRowValue;
        }
        
        for(int j=0; j<maxColumn.length; j++){
            int maxColumnValue= Integer.MIN_VALUE;
            for(int i=0; i<grid.length; i++){
                maxColumnValue= Math.max(maxColumnValue, grid[i][j]);
            }
            maxColumn[j]= maxColumnValue;
        }
        
        int sum=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                int num= Math.min(maxRow[i], maxColumn[j]);
                sum+= (num-grid[i][j]);
            }
        }
        return sum;
        
    }
}