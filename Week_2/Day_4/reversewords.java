class Solution {
    public void reverse(StringBuilder sb,int start , int end){
        while(start<=end){
            char temp=sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
    }
    public String reverseWords(String s) {
        int i=0;
        int j=0;
        StringBuilder sb=new StringBuilder(s);
        while(j<s.length()){
            if(sb.charAt(j)!=' ') j++;
            else{
                reverse(sb,i,j-1);
                i=j+1;
                j=i;
            }
        }
        reverse(sb,i,j-1);
        return sb.toString();
    }
}