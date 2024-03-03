// LeetCode - 31

class Solution {
    public void nextPermutation(int[] arr) {
        
        int n=arr.length;
        int idx1=-1;
        int idx2=-1;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i-1]<arr[i]){
                idx1 = arr[i-1];
                idx2= i-1;
                break;
            }
        }
        if(idx2>=0){
            int j = n-1;
            while(arr[j]<=arr[idx2]){
                j--;
            }
            swap(arr,idx2,j);
        }
        reverse(arr,idx2+1);
    } 
    private void reverse(int[] arr, int start) {
        int i = start, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    public void swap(int[] arr, int a ,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}