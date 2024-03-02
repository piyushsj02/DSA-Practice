//GFG


class Solution {
    static ArrayList<Integer> spirallyTraverse(int[][] arr,int r , int c) {
        ArrayList <Integer> list = new ArrayList<>();
        
        int top=0, left=0 , right=c-1 ,bottom=r-1;
        while(top<=bottom && left<=right){

            //left -> right
            for(int i=left;i<=right;i++){
                list.add(arr[top][i]);
            }
            top++;
            //top -> bottom
            for(int i=top;i<=bottom;i++){
                list.add(arr[i][right]);
            }
            right--;

            //right -> left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }
            //bottom -> top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
            
        return list;
    }
}