// LeetCode -75

class Solution {
    public void sortColors(int[] arr) {
        int r=arr.length-1;
        int l=0;

        for(int i=0;i<=r;){
           
            if(arr[i]==0)
                swap(arr,i++,l++);
            
            else if(arr[i]==1)
                ++i;
            else if(arr[i]==2)
                swap(arr,i,r--);
        }
    }

    private void swap(int []arr,int i,int j){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;  
    }
}