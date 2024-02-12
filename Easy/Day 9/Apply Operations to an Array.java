// LeetCode =2460

class Solution {
    public int[] applyOperations(int[] arr) {
        
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            
            if(arr[i]!=arr[i+1]) continue;
            if(arr[i]==arr[i+1]){
                arr[i]*=2;
                arr[i+1]=0;
            }
        }
        int i=0,j=0;
        while (j<n-1){
            if(arr[i]!=0){
                i++;
                j=i+1;
            }
            if(arr[i]==0 && arr[j]==0) j++;

            if(arr[i]==0 && arr[j]!=0){
                arr[i]=arr[j];
                arr[j]=0;
                i++;
            }
        } 
        
    return arr;

    }
}