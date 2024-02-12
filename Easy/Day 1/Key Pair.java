class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        HashSet<Integer>set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int temp = x- arr[i];
            if(set.contains(temp)){
                return true;
            }
            else{
                set.add(arr[i]);
            }
    }
    return false;
}
}