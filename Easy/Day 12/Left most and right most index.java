
class Solution {
    public pair indexes(long arr[], long x)
    {  
        int i=0;
        int j=arr.length-1;
        int idx1=-1;
        int idx2=-1;
        while(i<=j){
            if(arr[i]!=x)
                i++;
            if(arr[j]!=x)
                j--;
            if(arr[i]==x && arr[j]==x){  
                idx1=i;
                idx2=j;
                break;
            }
        }
            return new pair(idx1,idx2);  
        
    }
}