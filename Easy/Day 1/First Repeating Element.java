class Solution {
    
    public static int firstRepeated(int[] arr, int n) {
   
        HashMap<Integer,Integer>map = new HashMap<>();
        
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],2);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>=2){
                return i+1;
            }
        }
        return -1;
    }
}