class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0 || nums.length==1)return nums.length;
        Arrays.sort(nums);
        int count=1;
        int maxCount=1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]-1 || nums[i]==nums[i+1]){
                if(nums[i]==nums[i+1]-1)count++;
                maxCount= Math.max(maxCount, count);
            }
            else count=1;
        }
        return maxCount;
        
    }
}