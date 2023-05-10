class Solution {
    int count=0;
    public void merge(int si, int mid, int ei, int[] nums){

                                //   counting
        int i= si;
        int j= mid+1;
        while(i<=mid && j<=ei){
            if(nums[i]>2*(long)nums[j]){
                count= count+(mid-i+1);
                j++;
            }else i++;
        }

                                    // merge sort
        int[] array= new int[ei-si+1];
        int index1= si;
        int index2= mid+1;
        int x=0;

        while(index1<=mid && index2<=ei){
            if(nums[index1]<nums[index2]){
                array[x++]= nums[index1++];
            }else{
                array[x++]= nums[index2++];
            }
        }
        while(index2<=ei){
            array[x++]= nums[index2++];
        }
        while(index1<=mid){
            array[x++]= nums[index1++];
        }

        for(int index=si, k=0; index<=ei; index++, k++){
            nums[index]= array[k];
        }
    }

    public void divide(int si, int ei, int[] nums){
        if(si>=ei)return;
        int mid= si+(ei-si)/2;
        divide(si, mid, nums);
        divide(mid+1, ei, nums);
        merge(si, mid, ei, nums);
    }

    public int reversePairs(int[] nums) {

                            //   brute force
        // int count=0;
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i; j<nums.length; j++){
        //         if(nums[i]>2*nums[j])count++;
        //     }
        // }
        // return count;
        
                              // merge Sort
        count=0; 
        divide(0, nums.length-1, nums);
        return count;


    }
}