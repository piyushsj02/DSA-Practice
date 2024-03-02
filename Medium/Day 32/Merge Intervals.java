// LeetCode - 56


public class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> list = new ArrayList<>();
        
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        for (int[] arr : intervals) {
            
            if (list.isEmpty() || list.get(list.size() - 1)[1] < arr[0]) {
                list.add(arr);
            } else {
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1],
                        arr[1]);
            }
        }

        return list.toArray(new int[0][]);
    }

}