class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk=new Stack<>();
        int [] ans=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){    
            while(!stk.isEmpty()&&temperatures[stk.peek()]<temperatures[i]){
                int indx=stk.pop();
                ans[indx]=i-indx;
            }
            stk.push(i);
        }
        return ans;
    }
}