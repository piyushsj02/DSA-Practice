
// GFG


class Solution {
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        int ans = 0;
        int i = 0, j = 0;
        while (i < n || j < m) {
            if (i < n && (j >= m || arr1[i] < arr2[j])) {
                ans = (k == 1) ? arr1[i] : ans;
                i++;
            } else if (j < m && (i >= n || arr1[i] >= arr2[j])) {
                ans = (k == 1) ? arr2[j] : ans;
                j++;
            }
            k--;
            if (k == 0) break;
        }
        return ans;
    }
}
