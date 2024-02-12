// LeetCode-66

class Solution {
    public int[] plusOne(int[] arr) {
       int n=arr.length;
       for(int i=n-1;i>=0;i--){
           if(arr[i]<9){
               arr[i]+=1;
               return arr;
           }
           arr[i]=0;
       }
       int arr2[]=new int[n+1];
       arr2[0]=1;
       return arr2;
    }
}