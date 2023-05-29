class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] matrix= new int[rowSum.length][colSum.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j]= Math.min(rowSum[i], colSum[j]);
                rowSum[i]-= matrix[i][j];
                colSum[j]-= matrix[i][j];
            }
        }
        return matrix;
    }
}