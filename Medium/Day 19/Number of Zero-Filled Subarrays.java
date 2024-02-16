// LeetCode-2348

class Solution {
    public long zeroFilledSubarray(int[] arr) {
        int len0 = 0, sum = 0;
        long count = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum != 0) {
                sum = 0;
                len0 = 0;
                continue;
            }

            len0++;
            count += len0;

        }

        return count;
    }
}