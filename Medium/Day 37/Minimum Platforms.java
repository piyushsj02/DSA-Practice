//GFG
class Solution{

    static int findPlatform(int arr[], int dept[], int n){
        Arrays.sort(arr);
        Arrays.sort(dept);
        
        int max = Integer.MIN_VALUE;
        // int count=0;
        int x=0,y=0,count=0;
        
        while(x<n && x<n){
            
            if(arr[x]<=dept[y]){
                count++;
                x++;
                max=Math.max(max,count);
            }
            else{
                count--;
                y++; 
            }
            
        }
        return max;
        
    }
    
}