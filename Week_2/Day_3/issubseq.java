class Solution {
    public boolean isSubsequence(String s, String t) {
        int ls=s.length();
        int lt=t.length();
        int i=0;
        int j=0;
        while(i<ls&&j<lt){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                
            }
            j++;
        }
        return i==ls;
    }
}