class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set= new HashSet<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-3; i++){
            for(int j=i+1; j<nums.length-2; j++){
                int k= j+1;
                int l= nums.length-1;
                while(k<l){
                    // List<Integer> ls= new ArrayList<>();
                    long sum= (long)nums[i]+ (long)nums[j]+ (long)nums[k]+ (long)nums[l];
                    if(sum==target){
                        set.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k++], nums[l--])));
                    }else if(sum>target) l--;
                    else k++;
                }
            }
        }
        
        return new ArrayList<>(set);
    }
}