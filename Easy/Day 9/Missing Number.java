// LeetCode- 268

class Solution {
    public int missingNumber(int[] arr) {
        
        int n = arr.length;
        int total=n*(n+1)/2;
        int sum=0;
         for(int i=0;i<n;i++){
            sum+=arr[i];
         }
        return total-sum;
    }
}