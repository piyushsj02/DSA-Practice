//LeetCode - 11

class Solution {
    public int maxArea(int[] arr) {
        int max = Integer.MIN_VALUE;
        int l=0,r=arr.length-1;

        while(l<r){
            int area = Math.min(arr[l],arr[r]) * (r-l);
            max=Math.max(max,area);

            if(arr[l]<arr[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}