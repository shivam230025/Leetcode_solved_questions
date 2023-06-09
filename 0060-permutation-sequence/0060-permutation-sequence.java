class Solution {
    
    public int factorial(int n){
        if(n==0 || n==1)return n;
        return n*factorial(n-1);
    }
    
    public String per(List<Integer> nums, int k){
        if(nums.size()==0)return "";
        int total= factorial(nums.size());
        int seqNum= total/nums.size();
        int num= k/seqNum;
        int newK= k%seqNum;
        if(newK==0){
            num--;
            newK=seqNum;
        }
        String ans = Integer.toString(nums.get(num));
        nums.remove(num);
        return ans+ per(nums, newK);
    }
    
    public String getPermutation(int n, int k) {
        List<Integer> list= new ArrayList<>();
        for(int i=1; i<=n; i++){
            list.add(i);
        }
        return per(list, k);
        // return ans;
    }
}