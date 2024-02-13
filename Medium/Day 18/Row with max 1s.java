// LeetCode-2643,GFG

// GFG --> Approach
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int max =0;
        int idx=-1;
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1)
                    temp++;
            }
            if(temp>max){
                max=temp;
                idx=i;
            }
        }
        return idx;
    }
}




// LeetCode --> Approach

class Solution {
    public int[] rowAndMaximumOnes(int[][] arr) {
        
        int idx=0;
        int maxCount=0;
        for(int i=0;i<arr.length;i++){

            int temp=0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1)
                    temp++;
            }
            if(temp>maxCount){
                maxCount=temp;
                idx=i;
            }
        }
        return new int[]{idx,maxCount};
    }
}