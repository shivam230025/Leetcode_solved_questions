class Solution {
    public int partitionString(String s) {
        Set<Character> set= new HashSet<>();
        int count=1;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(set.contains(c)){
                set.clear();
                set.add(c);
                count++;
            }else set.add(c);
        }
        return count;
    }
}