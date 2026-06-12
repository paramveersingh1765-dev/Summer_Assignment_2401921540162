class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        List<List<String>> ans=new ArrayList<>();
        boolean[] used = new boolean[n];
        String[] sort = new String[n];
        for(int i=0;i<n;i++) {
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            sort[i]=new String(arr);
        }
        for(int i=0;i<n;i++){
            if(used[i])  continue;
            List<String> anss = new ArrayList<>();
            anss.add(strs[i]);
            used[i]=true;
            for(int j=i+1;j<n;j++){
                if(!used[j]&&sort[i].equals(sort[j])){
                    anss.add(strs[j]);
                    used[j]=true;
                }
            }
            ans.add(anss);
        }
        return ans;
    }
}
