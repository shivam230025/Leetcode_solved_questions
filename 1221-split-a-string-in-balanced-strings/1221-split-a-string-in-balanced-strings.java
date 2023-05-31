class Solution {
    public int balancedStringSplit(String s) {
        int rCount=0;
        int lCount=0;
        int count=0;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(c=='R')rCount++;
            else lCount++;
            if(rCount==lCount){
                count++;
                rCount=0;
                lCount=0;
            }
        }
        return count;
    }
}