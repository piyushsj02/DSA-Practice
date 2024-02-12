
class Compute {
    public int findElement(int arr[], int n){
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int j=n-1;
        for(int i=0;i<n;i++){
            if(arr[i]>=max)
                max=arr[i];
            leftmax[i]=max;
        }
         while(j>=0){  
            if(arr[j]<=min) 
                min=arr[j];
            rightmax[j]=min;
            j--;
         }    
         
    
        int ans=-1;
        for(int i=1;i<=n-2;i++) { 
            if(leftmax[i]==rightmax[i] ){
                ans=leftmax[i];
                break;
            }
        }
            
        
        return ans;
        }
}
