// LeetCode - 128

class Solution {
    public int longestConsecutive(int[] arr) {

        int n = arr.length;
        if(n==0)
            return 0;

        Arrays.sort(arr);

        int len=1;
        int count=0;
        int prev=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            if(arr[i]-1==prev){
                count++;
                prev=arr[i];
            }
            else if(arr[i]!=prev){
                count=1;
                prev=arr[i];
            }
            len = Math.max(len,count);
        }
        
        
        return len;
    }
}