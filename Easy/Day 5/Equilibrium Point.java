
class Solution {

    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long sum = 0;
        long left = 0;

        for (long i : arr) {
            sum += i;
        }

        if (n == 1) {
            return 1;
        } else {
            for (int i = 0; i < n; i++) {
                left += arr[i];

                if ((i + 1 < n) && left * 2 == sum - arr[i + 1]) {
                    return (i + 2);
                }
            }
        }
        return -1;
    }
}
