class Solution {
    public boolean check(String num, int i){
        if(i<0)return false;
        
        if(num.length()==0 && i==0)return true;
        
        boolean ans= false;
        for(int j=0; j<num.length(); j++){
            String s= num.substring(0, j+1);
            int val= Integer.parseInt(s);
            ans |= check(num.substring(j+1), i-val);
        }
        return ans;
    }
    
    public int punishmentNumber(int n) {
        int sum=0;
        for(int i=1; i<=n; i++){
            if(check(Integer.toString(i*i), i)){
                sum+=(i*i);
            }
        }
        return sum;
    }
}