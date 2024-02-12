class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
        // code here
        long []ans=new long[n];
        long mul1=1; 
        long mul2=1; 
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            if (arr[i]==0)count++;
            if(arr[i]!=0)   
                mul1*=arr[i];
            mul2*=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(count==0){
                ans[i]=mul1/arr[i];
            }
            else if(count==1){
                if(arr[i]==0)
                    ans[i]=mul1;
                else
                    ans[i]=mul2;
            }
            else if(count>1){
                ans[i]=0;
            }
        }
        
        return ans;
	} 
} 