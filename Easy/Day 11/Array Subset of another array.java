
class Compute {
    public String isSubset( long arr1[], long arr2[], long n, long m) {
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int flag=0;
        if(arr1.length<arr2.length){
            flag=1;        
            
        }
        else{
            int i=0,j=0;
            while(i<arr1.length){
                if(arr1[i]==arr2[j]){
                    i++; j++;
                    flag =0;
                    if(j==arr2.length) break;
                }
                else if(arr1[i]!=arr2[j]){
                    flag=1;
                    i++;
                }
                
            }
        }
        if(flag==1) return "No";
        else return "Yes";
        
    }
}