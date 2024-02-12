class Solution {
    int remove_duplicate(int arr[],int N){
        // code here
         int i = 0,j = 1;
        while(j<N){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i+1;
    }
}