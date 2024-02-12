class Solution{
    int equalSum(int [] A, int N) {
        //Write your code here
        int right_sum=0,left_sum=0,total_sum=0;
        for(int i=0;i<N;i++) total_sum+=A[i];
        
        for(int i=0;i<N;i++)
        {
            right_sum=total_sum-left_sum-A[i];
            if(right_sum==left_sum) 
            return i+1;
            else 
                left_sum+=A[i];
        }
        return -1;
    }
}
