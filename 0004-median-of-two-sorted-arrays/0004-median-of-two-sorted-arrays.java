class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] nums= new int[nums1.length+nums2.length];
        int x=0;
        int ptr1=0;
        int ptr2=0;
        
        while(ptr1<nums1.length && ptr2<nums2.length){
            if(nums1[ptr1]<nums2[ptr2]){
                nums[x++]= nums1[ptr1++];
            }else{
                nums[x++]= nums2[ptr2++];
            }
        }
        
        while(ptr1<nums1.length){
            nums[x++]= nums1[ptr1++];
        }
        
        while(ptr2<nums2.length){
            nums[x++]= nums2[ptr2++];
        }
        
        double ans=0;
        if(nums.length%2==0){
            ans= ((double)nums[nums.length/2] + nums[(nums.length/2)-1])/2;
        }else{
            ans= nums[nums.length/2];
        }
        
        return ans;
    }
}