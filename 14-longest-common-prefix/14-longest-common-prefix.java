class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int s = 201;
        if(strs[0].length() == 0){
            return result;
        }
        char ch = strs[0].charAt(0);
        int StringIndex = 0;
        for(int i = 0 ; i < strs.length ; i++){
            if(strs[i].length() <= s){
                s = strs[i].length();
            }
            if(strs[i] == ""){
                s = 0;
            }
        }
        for(int i = 0 ; i < strs.length && s > 0 ; i++){
            if(strs[i].charAt(StringIndex) == ch && (i == strs.length - 1)){
                result = result+ch;
                if(StringIndex < (s -  1)){
                    StringIndex++;
                    ch = strs[0].charAt(StringIndex);
                    i = 0;
                }                
                else{
                    return result;
                }
            }
            if(strs[i].charAt(StringIndex) != ch){
                return result;
            }
        }
        return result;
    }
}