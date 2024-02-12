


class Solve {
    int[] printUnsorted(int[] arr1, int n) {
        // code here
        int ans[] = new int[]{-1,-1};
        int arr2[]=arr1.clone();
        
        Arrays.sort(arr2);
        // for(int i:arr2)
        //     System.out.print(i+" ");
        if(n==1){
            ans[0]=0;
            ans[1]=0;
        }
        else{
            int j=n-1;
            for(int i=0;i<n;i++){
                if(arr1[i]!=arr2[i] && ans[0]==-1){
                    ans[0]=i;
                }
                if(arr1[j-i]!=arr2[j-i] && ans[1]==-1){
                    ans[1]=j-i;
                }
                if(ans[0]!=-1 && ans[1]!=-1)
                    break;
            }
        }
        return ans;
    }
}