class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n=arr.length;
        int r=k;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int max=sum;
        while(r<n){
           
            sum=sum+arr[r];
            sum=sum-arr[r-k];
            max=Math.max(max,sum); 
            r++;
        
            
        }
        return max/(double)k;
        
    }
}
