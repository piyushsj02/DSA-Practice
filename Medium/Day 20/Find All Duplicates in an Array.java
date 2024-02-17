// LeetCode-442

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> al= new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
                al.add(arr[i]);
        }

        return al;
    }
}