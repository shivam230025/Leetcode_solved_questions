//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        // int[][] job= new int[arr.length][3];
        // for(int i=0; i<arr.length; i++){
        //     job[i][0]= arr[i].id;
        //     job[i][1]= arr[i].deadline;
        //     job[i][2]= arr[i].profit;
        // }
        
        // Arrays.sort(job, Comparator.comparingDouble(o -> o[2]));
        
        // int time=0;
        // int jobNum=0;
        // int profit=0;
        // for(int i=n-1; i>=0; i--){
        //     if(time<job[i][1]){
        //         jobNum++;
        //         profit+=job[i][2];
        //         time++;
        //     }
        // }
        
        // int[] ans= new int[2];
        // ans[0]= jobNum;
        // ans[1]= profit;
        // return ans;
        
        Arrays.sort(arr, (a,b)->(b.profit-a.profit));
        
        int max=0;
        for(int i=0; i<n; i++){
            if(max<arr[i].deadline)max= arr[i].deadline;
        }
        
        int[] resultArray= new int[max+1];
        
        for(int i=0; i<resultArray.length; i++){
            resultArray[i]= -1;
        }
        
        int countJob=0;
        int profit=0;
        for(int i=0; i<n; i++){
            for(int j=arr[i].deadline; j>0; j--){
                if(resultArray[j]==-1){
                    countJob++;
                    profit+= arr[i].profit;
                    resultArray[j]= arr[i].id;
                    break;
                }
            }
        }
        
        int[] ans= new int[2];
        ans[0]= countJob;
        ans[1]= profit;
        return ans;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/