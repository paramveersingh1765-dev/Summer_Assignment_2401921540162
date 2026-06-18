class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        int max = 0;
        for(int i = 0; i <= heights.length; i++) {
            while(!stk.isEmpty()&&(i==heights.length||heights[i]<heights[stk.peek()])){
                int height=heights[stk.pop()];
                int width;
                if (stk.isEmpty()) {
                    width=i;
                } else {
                    width=i-stk.peek()-1;
                }
                max=Math.max(max, height*width);
            }
            stk.push(i);
        }
        return max;
    }
}