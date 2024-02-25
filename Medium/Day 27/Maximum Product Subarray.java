
// LeetCode - 152 

class Solution {
    public int maxProduct(int[] arr) {

        int ans=arr[0] , l=0 , r=0; 
        
        for (int i = 0; i < arr.length; i++) {
            l = (l==0 ? 1:l) * arr[i];
            r = (r==0 ? 1:r) * arr[arr.length-1-i];
            ans = Math.max(ans,Math.max(l,r));
        }   
        return ans;
    }
}