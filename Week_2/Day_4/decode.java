class Solution {
    public String decodeString(String s) {
        Stack<String> str=new Stack<>();
        Stack<Integer> count=new Stack<>();
        int cnt=0;
        String ans="";
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                cnt=cnt*10+(ch-'0');
            }
            else if(ch=='['){
                str.push(ans);
                count.push(cnt);
                ans="";
                cnt=0;
            }
            else if(ch==']'){
                StringBuilder popstr=new StringBuilder(str.pop());
                int rep=count.pop();
                for(int i=0;i<rep;i++){
                    popstr.append(ans);
                }
                ans=popstr.toString();
            }
            else ans+=ch;
        }
        return ans;

    }
}