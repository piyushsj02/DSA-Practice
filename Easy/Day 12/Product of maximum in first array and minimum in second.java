
class Solution{
    
    // Function for finding maximum and value pair
    public static long find_multiplication (int arr1[], int arr2[], int n, int m) {
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int i=0,j=0;
        
        while(i<n || j<m){
            
            if(i<n){
                if(arr1[i]>max)
                    max=arr1[i];
                i++;
            }
            if(j<m){
                if(arr2[j]<min)
                    min=arr2[j];
                j++; 
            }
        }
        
        return min*max;
        
    }
}
