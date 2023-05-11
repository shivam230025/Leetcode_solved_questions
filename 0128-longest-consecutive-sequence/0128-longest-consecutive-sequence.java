import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        
                                       // solution  time-O(NlogN)   space-O(1)
        
        // if(nums.length==0 || nums.length==1)return nums.length;
        // Arrays.sort(nums);
        // int count=1;
        // int maxCount=1;
        // for(int i=0; i<nums.length-1; i++){
        //     if(nums[i]==nums[i+1]-1 || nums[i]==nums[i+1]){
        //         if(nums[i]==nums[i+1]-1)count++;
        //         maxCount= Math.max(maxCount, count);
        //     }
        //     else count=1;
        // }
        // return maxCount;
        
                                         
                                      // better solution
        if(nums.length==0 || nums.length==1)return nums.length;
        HashSet<Integer> set= new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        Iterator<Integer> itr= set.iterator();
        int maxCount=1;
        
        while(itr.hasNext()){
            
            int num= itr.next();
            if(set.contains(num-1)){
                continue;
            }else{
                int count=1;
                while(set.contains(num+1)){
                    count++;
                    num++;
                }
                maxCount= Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}