class Solution {
    
//     public void combination(int[] candidates, int target, List<Integer> list, Set<List<Integer>> ans, int i){
        
//         if(target==0){
//             Collections.sort(list);
//             ans.add(new ArrayList<>(list));
//             return;
//         }
        
//         if(i>=candidates.length || target<0)return;
        
//         int num= candidates[i];
//         combination(candidates, target, new ArrayList<>(list), ans, i+1);
//         List<Integer> temp= new ArrayList<>(list);
//         temp.add(num);
//         combination(candidates, target-num, temp , ans, i+1);
        
//     }
    
    public static void combine(int index, int target, int[] candidates, List<List<Integer>> ans, List<Integer> temp){
        
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=index; i<candidates.length; i++){
            if(i!=index && candidates[i]==candidates[i-1])continue;
            if(candidates[i]>target)break;
            
            temp.add(candidates[i]);
            combine(i+1, target-candidates[i], candidates, ans, temp);
            temp.remove(temp.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // Set<List<Integer>> set= new HashSet<>();
        // // Arrays.sort(candidates);
        // combination(candidates, target, new ArrayList<>(), set, 0);
        // List<List<Integer>> list= new ArrayList<>();
        // for(List<Integer> temp: set){
        //     list.add(temp);
        // }
        // return list;
        
        Arrays.sort(candidates);
        List<List<Integer>> ans= new ArrayList<>();
        combine(0, target, candidates, ans, new ArrayList<>());
        return ans;
        
    }
}