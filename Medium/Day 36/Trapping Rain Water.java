// GFG


class Solution{
    static long trappingWater(int arr[], int n) { 
       
        long water=0;
        
        int left[]=new int[n];
        int right[]=new int[n];
        int leftMax=Integer.MIN_VALUE;
        int rightMax=Integer.MIN_VALUE;
       
        for(int i=0;i<n;i++){
            
            left[i]=leftMax=Math.max(leftMax,arr[i]);
            right[n-1-i]=rightMax=Math.max(rightMax,arr[n-1-i]);
        }
        
        for(int i=0;i<n;i++){
            
            int hight=Math.min(left[i],right[i]);
            
            if(arr[i]<hight){
                water+=(hight-arr[i]);
            }
        }
      
        return water; 
    } 
}




