class Solution {
    public List<Integer> partitionLabels(String s) {
        
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), i);
        }
        
        List<Integer> list= new ArrayList<>();
        int max=0;
        int p=-1;
        for(int i=0; i<s.length(); i++){
            max= Math.max(max, map.get(s.charAt(i)));
            if(max==i){
                list.add(max-p);
                p=max;
            }
        }
        return list;
        
    }
}