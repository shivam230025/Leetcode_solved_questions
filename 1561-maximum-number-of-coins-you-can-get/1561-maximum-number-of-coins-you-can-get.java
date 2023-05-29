class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int times= piles.length/3;
        int index= piles.length-2;
        int sum=0;
        while(times>0){
            sum+= piles[index];
            index-=2;
            times--;
        }
        return sum;
    }
}