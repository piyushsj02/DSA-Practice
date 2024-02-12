// LeetCode - 121

class Solution {
    public int maxProfit(int[] arr) {
       
        int min=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)  
                min=arr[i];
            
            int profit=arr[i]-min;
            maxProfit=Math.max(maxProfit,profit);

        }
       return maxProfit;
    }
}