
// User function Template for Java
class Solution {
    int minDist(int arr[], int n, int x, int y) {
    int i = 0, p = -1; 
    int min = Integer.MAX_VALUE; 

    for (i = 0; i < n; i++) {

        if (arr[i] == x || arr[i] == y) {
    
                if (p != -1 && arr[i] != arr[p])
                    min = Math.min(min, i - p);
              
                p = i;
                }
            }

        if (min == Integer.MAX_VALUE)
        return -1; 

        return min;
}
}