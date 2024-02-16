// LeetCode - 238

class Solution {
    public int[] productExceptSelf(int[] arr) {

        int total = 1;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                total *= arr[i];

            } else {
                count++;
                if (count >= 2) {
                    total = 0;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && count == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = total;
            } else {
                arr[i] = total / arr[i];
            }

        }
        return arr;
    }
}
