// LeetCode - 136
class Solution {
    public int singleNumber(int[] arr) {
        int ans=0;

        for (int i = 0; i < arr.length; i++) {

            ans = ans ^ arr[i];

        }
        return ans;

    }
}