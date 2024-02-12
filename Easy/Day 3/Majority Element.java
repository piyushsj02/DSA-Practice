// LeetCode - 169

class Solution {
    public int majorityElement(int[] arr) {
        int  count=0;
        int x=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                x=arr[i];
                count++;
            }    
            else if(arr[i]==x)
                count++;
            else if(arr[i]!=x)
                count--;    
        }
        return x;
    }
}