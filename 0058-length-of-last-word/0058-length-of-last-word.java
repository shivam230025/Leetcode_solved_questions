class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int num=0;
        for(int i=s.length()-1; i>=0; i--){
            if(Character.isWhitespace(s.charAt(i))){
                return num;
            }
            num++;
        }
        return num;
    }
}