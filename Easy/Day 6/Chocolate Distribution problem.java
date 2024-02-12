
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    
    {
        // your code 
        int diff1=Integer.MAX_VALUE;
        int diff2=Integer.MAX_VALUE;
        
       Collections.sort(a);
       if(n==m){
           diff2=a.get(n-1)-a.get(0);
       }
       else{
           for(int i=0;i<n-m+1;i++){
               diff1=a.get(m+i-1)-a.get(i);
               
               if(diff2>=diff1)
                     diff2=diff1;
           }
       }
       return diff2;
           
    }
}