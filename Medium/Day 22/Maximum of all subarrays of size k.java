// GFG


class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList <Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            
            for(int j=i; (j<k+i)&& (i+k<=arr.length) ;j++){
                
                if(arr[j]>max)
                    max=arr[j];
            }
            if(i+k<=arr.length)
                al.add(max);
        }
        return al;
    }
}
