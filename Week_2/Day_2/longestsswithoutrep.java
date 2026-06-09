class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int[] freq = new int[256];
        int l=0;
        int r=0;
        int max=0;
        while(r<n){
                char ch=s.charAt(r);
                freq[ch]++;
                while(freq[ch]>1){
                char leftChar = s.charAt(l);   
                freq[leftChar]--;
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}