class Solution {

    public static int longest(int arr[],int n)
    {
        int tall=arr[0];             // 1st building has sunlight
        int count=1;                 // so,count also 1 
        
        for(int i=0;i<n;i++){
            if(arr[i]>tall){
                count++;
                tall=arr[i];
            }
        }
        return count;
    }
}
