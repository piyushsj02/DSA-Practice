class Solution{
    
    static ArrayList<Integer> leaders(int arr[], int n){
        
        ArrayList<Integer>list=new ArrayList<>();
        int max = arr[n-1];
        list.add(max);
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                max = arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
