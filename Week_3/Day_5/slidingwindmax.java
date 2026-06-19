class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> que=new LinkedList<>();
        int[] ans=new int[nums.length-k+1];
        int indx = 0;
        for(int i=0;i<nums.length;i++){
            while(!que.isEmpty() && que.peekLast()<nums[i]){
                que.removeLast();
            }
            que.add(nums[i]);
            if(i>=k-1){
                ans[indx++]=que.peek();
                if(que.peek() == nums[i-k+1]){ 
                    que.remove();
                }
            }
        }

        return ans;
    }
}