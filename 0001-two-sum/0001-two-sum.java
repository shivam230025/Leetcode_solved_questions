class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int[] result= new int[2];
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                result[0]= i;
                result[1]= map.get(target-nums[i]);
            }
            map.put(nums[i], i);
        }
        return result;
        
        
        // int[] ans= new int[2];
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //        if(nums[i]+nums[j]==target){
        //            ans[0]=i;
        //            ans[1]=j;
        //        } 
        //     }
        // }
        // return ans;
    }

        // public int[] twoSum(int[] nums, int target) {
            

            
        // }

            
    }
