class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<>();
        for(String str:tokens){
            if(str.equals("+")||str.equals("-")|| str.equals("*")||str.equals("/")){
                int x=stk.pop();
                int y=stk.pop();
                if(str.equals("+")){
                    stk.push(x+y);
                }
                else if(str.equals("-")){
                    stk.push(y-x);
                }
                else if(str.equals("*")){
                    stk.push(x*y);
                }
                else stk.push(y/x);
            }
            else stk.push(Integer.parseInt(str));
        }
        return stk.peek();
    }
}