//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}
// } Driver Code Ends


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        double[][] matrix = new double[arr.length][3];
        for(int i=0; i<n; i++){
            matrix[i][0]= arr[i].value;
            matrix[i][1]= arr[i].weight;
            matrix[i][2]= arr[i].value/(double)arr[i].weight;
        }
        
        Arrays.sort(matrix, Comparator.comparingDouble(o -> o[2]));
        
        double weight= (double)W;
        double value=0;
        for(int i=n-1; i>=0; i--){
            if(matrix[i][1]<=weight){
                value+= matrix[i][0];
                weight-=matrix[i][1];
            }else{
                value+= weight*matrix[i][2];
                break;
            }
        }
        
        return value;
        
    }
}