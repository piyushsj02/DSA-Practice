// LeetCode - 229

class Solution {
    public List<Integer> majorityElement(int[] arr) {
        List <Integer> al = new ArrayList<>();
        Map<Integer,Integer>map = new HashMap<>();

        int n = arr.length;

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else    
                map.put(arr[i],1);
        }

         for(int i=0;i<n;i++){
            if(map.get(arr[i])>n/3){
                al.add(arr[i]);
                map.put(arr[i],0);
            }
         }
        return al;
    }
}