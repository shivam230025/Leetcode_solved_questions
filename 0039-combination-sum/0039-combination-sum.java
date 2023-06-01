class Solution {
    public static Set<List<Integer>> set;
    
    public void combination(int[] candidates, List<Integer> list, int target){
        if(target<0)return;
        if(target==0){
            List<Integer> temp= new ArrayList<>();
            for(int num: list){
                temp.add(num);
            }
            Collections.sort(temp);
            set.add(temp);
            return;
        }
        
        for(int i=0; i<candidates.length; i++){
            int num= candidates[i];
            List<Integer> tempList= new ArrayList<>();
            for(int n : list){
                tempList.add(n);
            }
            tempList.add(num);
            combination(candidates, tempList, target-num);
        }
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        set= new HashSet<>();
        combination(candidates, new ArrayList<>(), target);
        List<List<Integer>> ans= new ArrayList<>();
        for(List<Integer> list: set){
            ans.add(list);
        }
        return ans;
    }
}