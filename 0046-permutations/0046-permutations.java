class Solution {
    public void per(List<Integer> nums, List<List<Integer>> ans, List<Integer> list){
        if(nums.size()==0){
            // Collections.sort(list);
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0; i<nums.size(); i++){
            list.add(nums.get(i));
            int num= nums.get(i);
            nums.remove(i);
            
            per(nums, ans, list);
            
            nums.add(num);
            Collections.sort(nums);
            list.remove(list.size()-1);
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> n= new ArrayList<>();
        for(int num: nums){
            n.add(num);
        }
        per(n, ans, new ArrayList<Integer>());
        return ans;
    }
}