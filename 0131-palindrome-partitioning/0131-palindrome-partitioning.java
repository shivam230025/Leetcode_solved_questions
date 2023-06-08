class Solution {
    public boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
    
    public void part(String s, List<List<String>> ans, List<String> list){
        
        if(s.length()==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0; i<s.length(); i++){
            String tempS= s.substring(0, i+1);
            if(palindrome(tempS)){
                list.add(tempS);
                String rem= s.substring(i+1);
                part(rem, ans, list);
                list.remove(list.size()-1);
            }
        }
    }
    
    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList<>();
        part(s, ans, new ArrayList<String>());
        return ans;
    }
}