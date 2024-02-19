// LeetCode-289


class Solution {
    public void gameOfLife(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int live=0;
                if(j+1<m && Math.abs(arr[i][j+1])==1) live++;
                if(i+1<n && Math.abs(arr[i+1][j])==1) live++;
                if(i-1>=0 && Math.abs(arr[i-1][j])==1) live++;
                if(j-1>=0 && Math.abs(arr[i][j-1])==1) live++;
                if((i+1<n && j+1<m ) && Math.abs(arr[i+1][j+1])==1) live++;
                if((i+1<n && j-1>=0) && Math.abs(arr[i+1][j-1])==1) live++;
                if((j-1>=0 && i-1>=0) && Math.abs(arr[i-1][j-1])==1) live++;
                if((i-1>=0 && j+1<m ) && Math.abs(arr[i-1][j+1])==1) live++;
                
                
                if(arr[i][j]==1 && live<2) arr[i][j]=-1;
                else if(arr[i][j]==1 && (live==2 || live==3)) arr[i][j]=1;
                else if(arr[i][j]==1 && live>3) arr[i][j]=-1;
                 else if(arr[i][j]==0 && live==3) arr[i][j]=2;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==2)
                    arr[i][j]=1;
                else if(arr[i][j]==-1)
                    arr[i][j]=0;
            }
        }
    }
}