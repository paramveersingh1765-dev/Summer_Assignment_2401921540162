class Solution {
    public boolean canConstruct(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[] frq2=new int[26];
        for(char ele:s2.toCharArray()){
            frq2[ele-'a']++;
        }
        for(char ele:s1.toCharArray()){
            frq2[ele-'a']--;
            if(frq2[ele-'a']<0){
                return false;
            }
        }
        return true;
    }
}