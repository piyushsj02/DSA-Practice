//GFG


class Solution {
    
    public long countSubArrayProductLessThanK(long a[], int n, long k){
       
       long ans = 0, product = 1;
       int i = 0, j = 0;
       while(j < n) {
           // calc
           product *= a[j];
           if(product < k){
               ans += j-i+1;
               j++;
           }
           else{
               while(i<=j && product>=k){
                   product /= a[i];
                   i++;
               }
               if(i<=j && k != 0) {
                   ans += j-i+1;
               }
               j++;
               
           }
       }
       
       return ans;
       
   }
}