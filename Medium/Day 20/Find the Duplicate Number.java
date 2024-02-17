// LeetCode-287

class Solution {
    public int findDuplicate(int[] arr) {
        Map <Integer,Integer> map= new HashMap<>();
        int num=0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                num=arr[i];
                break;
            }
            else{
                map.put(arr[i],1);
            }
        }
        return num;
    }
}
