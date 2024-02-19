// LeetCode-1010

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int res = 0;
        int[] count = new int[60];
        for (int i = 0; i < time.length; i++) {
            time[i] %= 60;
            res += count[(60 - time[i]) % 60];
            count[time[i]]++;
        }
        return res;
    }
}