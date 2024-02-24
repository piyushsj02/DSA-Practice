// LeetCode-532

//Approach 1

class Solution {
    public int findPairs(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    if (!(map.containsKey(arr[i]) && map.containsValue(arr[j]))) {
                        map.put(arr[i], arr[j]);
                        map.put(arr[j], arr[i]);
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

// Approach 2

class Solution {
    public int findPairs(int[] arr, int k) {
        Stack<Integer> s = new Stack<>();
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k && !(s.contains(arr[j]))) {
                    s.push(arr[j]);
                    count++;
                }
            }
        }
        return count;
    }
}
