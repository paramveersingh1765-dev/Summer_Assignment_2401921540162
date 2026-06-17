class Solution {
    public boolean isValid(String s) {
        List<Character> arr=new ArrayList<>();
        if(s.length()==1) return false;
        for(char ele:s.toCharArray()){
            if(ele=='['||ele=='{'||ele=='('){
                arr.add(ele);
            }
            else if((ele==']'||ele=='}'||ele==')')){
                if(arr.size()==0){
                    return false;
                }
                char top=arr.get(arr.size()-1);
                if(ele==')' && top!='(') return false;
                if(ele=='}' && top!='{') return false;
                if(ele==']' && top!='[') return false;
                arr.remove(arr.size()-1);
                
            }
        }
        if(arr.size()==0) return true;
        return false;
    }
}
