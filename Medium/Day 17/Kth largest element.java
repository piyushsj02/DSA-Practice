//leetcode 215

class Solution {
    public int findKthLargest(int[] arr, int k) {
       PriorityQueue <Integer> pq = new PriorityQueue<>();
       for(int i=0;i<arr.length;i++){

           if(pq.size()<k){
               pq.add(arr[i]);
           }
           else{
               if(arr[i]>pq.peek()){
                   pq.poll();
                   pq.add(arr[i]);
               }
           }

       }
       return pq.peek();
    }
}