
//GFG 

class Solution {
    // Function to count inversions in the array.
    static long inversionCount(long arr[], long N) {
        // Calling the mergeSort function to perform the inversion count
        return mergeSort(arr, 0, N - 1);
    }

    // Recursive function to perform merge sort and count inversions
    static long mergeSort(long[] arr, long low, long high) {
        long count = 0;
        // If there is more than one element in the array
        if (low < high) {
            // Calculate the middle index
            long mid = (low + high) / 2;
            // Recursively sort and count inversions in the left and right halves
            count = count + mergeSort(arr, low, mid);
            count = count + mergeSort(arr, mid + 1, high);
            // Merge the two sorted halves and count inversions
            count = count + merge(arr, low, mid, high);
        }
        return count;
    }

    // Merge function to merge two sorted halves and count inversions
    static long merge(long[] arr, long low, long mid, long high) {
        // Temporary list to store the merged result
        ArrayList<Long> temp = new ArrayList<>();
        // Pointers for the left and right halves
        long left = low;
        long right = mid + 1;
        // Variable to count inversions during merging
        long count = 0;
        // Compare elements from both halves and merge
        while (left <= mid && right <= high) {
            if (arr[(int) left] <= arr[(int) right]) {
                temp.add(arr[(int) left]);
                left++;
            } else {
                temp.add(arr[(int) right]);
                // Count inversions for elements in the left half
                count += (mid - left + 1);
                right++;
            }
        }
        // Copy remaining elements from the left half
        while (left <= mid) {
            temp.add(arr[(int) left]);
            left++;
        }
        // Copy remaining elements from the right half
        while (right <= high) {
            temp.add(arr[(int) right]);
            right++;
        }
        // Copy merged elements back to the original array
        for (int i = (int) low; i <= high; i++) {
            arr[i] = temp.get(i - (int) low);
        }
        // Return the count of inversions during this merge
        return count;
    }
}