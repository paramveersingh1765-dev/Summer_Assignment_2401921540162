class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int prev=0;
        int next=1;
        while(next<n){
            if(nums[prev]!=nums[next]){
                prev++;
                nums[prev]=nums[next];

            }
            next++;
        }
        return prev+1;
    }
}