class Solution {
    public int minPartitions(String n) {
        int maxCount=0;
        for(int i=0; i<n.length(); i++){
            // char c= n.charAt(i);
            // String s= ""+c;
            String s= n.substring(i, i+1);
            int digit= Integer.parseInt(s);
            maxCount= Math.max(maxCount, digit);
        }
        return maxCount;
    }
}