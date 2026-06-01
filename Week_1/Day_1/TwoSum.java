class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> help=new HashMap<>();
        int [] ans =new int[2];
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int more=target-x;
            if(help.containsKey(more)){
                ans[0]=help.get(more);
                ans[1]=i;
                return ans;
            }
            else{
                help.put(x,i);
            }
        }
        return ans;
    }
}