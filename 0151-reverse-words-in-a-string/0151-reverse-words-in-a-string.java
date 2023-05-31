class Solution {
    public String reverseWords(String s) {
        s= s.trim();
        String ans="";
        int i=s.length()-1;
        // String word="";
        
        while(i>=0){
            String word="";
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            while(i>=0 && s.charAt(i)!=' '){
                word= s.charAt(i)+ word;
                i--;
            }
            ans+= word+" ";
            i--;
        }
        
        return ans.trim();
    }
}