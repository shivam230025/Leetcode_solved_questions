class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
                                            // using HashMap
//         Set<List<Integer>> set= new HashSet<>();
//         Arrays.sort(nums);
        
//         for(int i=0; i<nums.length-2; i++){
//             int target= -1*nums[i];
//             HashMap<Integer, Integer> map= new HashMap<>();
            
//             for(int j=i+1; j<nums.length; j++){
//                 if(map.containsKey(target-nums[j])){
                    
//                     List<Integer> ls= new ArrayList<>();
//                     ls.add(nums[i]);
//                     ls.add(nums[j]);
//                     ls.add(target-nums[j]);
//                     set.add(ls);
                    
//                 }else{
//                     map.put(nums[j], j);
//                 }
//             }
//         }
        
//         return new ArrayList<>(set);
        
        
                                           // using 2 pointers
        
        Set<List<Integer>> set= new HashSet<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum= nums[i]+ nums[j]+ nums[k];
                if(sum==0){
                    set.add(new ArrayList<>(Arrays.asList(nums[i], nums[j++], nums[k--])));
                }else if(sum>0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        
        return new ArrayList<>(set);
        
        
        
        
        
        
        
        
    }
}