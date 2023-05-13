class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set= new HashSet<>();
        int left=0;
        int right=0;
        int count=0;
        int maxCount=0;
        
        while(right<s.length()){
            
            char c1= s.charAt(right);
            if(set.contains(c1)){
                
                while(set.contains(c1)){
                    char c2= s.charAt(left);
                    set.remove(c2);
                    left++;
                }
                
            }else{
                count= right-left+1;
                maxCount= Math.max(count, maxCount);
                
                set.add(c1);
                right++;
            }
            
        }
        return maxCount;
    }
}