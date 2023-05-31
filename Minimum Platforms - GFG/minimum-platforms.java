//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        
        // int[][] array= new int[arr.length][3];
        // for(int i=0; i<arr.length; i++){
        //     array[i][0]= i;
        //     array[i][1]= arr[i];
        //     array[i][2]= dep[i];
        // }
        
        // Arrays.sort(array, Comparator.comparingDouble(o -> o[1]));
        
        // int count=1;
        // int ans=1;
        // for(int i=1; i<arr.length; i++){
        //     if(array[i][1]<array[i-1][2]){
        //         count++;
        //         ans= Math.max(ans, count);
        //     }else count=1;
        // }
        // return ans;
        
        // Arrays.sort(arr);
        // Arrays.sort(dep);
        
        // int count=0;
        // int maxCount=0;
        // int i=arr[0];
        // int j=0;
        // int k=0;
        
        // while(i<=dep[dep.length-1]){
        //     if(j<arr.length && i==arr[j]){
        //         count++;j++;
        //         maxCount= Math.max(maxCount, count);
        //     }else if(k<dep.length && i==dep[k]){
        //         count--;k++;
        //     }
        //     i++;
        // }
        // return maxCount;
        
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int count=1;
        int maxCount=0;
        int i=1;
        int j=0;
        
        while(i<n){
            if(arr[i]<=dep[j]){
                count++;
                maxCount= Math.max(maxCount, count);
                i++;
            }else{
                count--;
                j++;
            }
        }
        return maxCount;
    }
    
}

