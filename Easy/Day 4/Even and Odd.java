class Solution {
    static void reArrange(int[] arr, int N) {
        // code here
        int i=0;
        int j=1;
        
        while(i<N && j<N){
            
            if(arr[i]%2!=0 && arr[j]%2==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i+=2;
                j+=2;
            }
            else{
                if(arr[i]%2==0)
                    i+=2;
                if(arr[j]%2!=0)
                    j+=2;
            }
        }
    }
}
