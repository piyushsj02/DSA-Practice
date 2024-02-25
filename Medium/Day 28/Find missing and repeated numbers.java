

// LeetCode - 2965

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] arr) {
        int rep=0;
        int mis=0;
        int check[]=new int[arr.length*arr.length+1];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                check[arr[i][j]]++;
            }
        }
        for(int i=1;i<check.length;i++){
            if(check[i]>1)
                rep=i;
            if(check[i]==0)
                mis=i;
        }
        return new int[]{rep,mis};
    }
}