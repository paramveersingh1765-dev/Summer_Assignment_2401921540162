class Solution {
    public void moveZeroes(int[] nums) {
        int temp=0;
        for(int ele:nums){
            if(ele!=0){
                nums[temp]=ele;
                temp++;
            }

        }   
        while (temp<nums.length){
            nums[temp]=0;
            temp++;
        }

        
    }
}