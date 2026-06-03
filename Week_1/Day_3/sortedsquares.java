class Solution {
    public int[] sortedSquares(int[] arr) {
        int n=arr.length;
        int [] ans=new int[n];
        int l=0;
        int r=n-1;
        int ptr=n-1;
        while(l<=r){
            if((arr[l]*arr[l])<(arr[r]*arr[r])){
                ans[ptr]=(arr[r]*arr[r]);
                ptr--;
                r--;
            }
            else{
                ans[ptr]=arr[l]*arr[l];
                l++;
                ptr--;
            }
        }
        return ans;

    }
}