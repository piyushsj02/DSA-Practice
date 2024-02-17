// LeetCode-695

class Solution {
    int temp=0;

    public void area(int g[][],int i,int j){
        if(i<0 || j<0 || i>=g.length || j>=g[0].length || g[i][j]==0)
            return;
        g[i][j]=0;
        temp++;

        area(g,i+1,j);
        area(g,i-1,j);
        area(g,i,j+1);
        area(g,i,j-1);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                if(grid[i][j]==1){
                    temp=0;
                    area(grid,i,j);
                    max=Math.max(max,temp);
                }
        return max;
    }
}