
class Solution{
    public void zigZag(int arr[], int n){
        
        int temp=0;
        
        for(int i=0;i<n-1;i++){
            if(i%2==0 && !(arr[i]<arr[i+1])){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            if(i%2==0 && (arr[i]<arr[i+1])){
                continue;
            }
            if(i%2!=0 && !(arr[i]>arr[i+1])){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            if(i%2!=0 && (arr[i]>arr[i+1])){
                continue;
            }
        }
    }
}