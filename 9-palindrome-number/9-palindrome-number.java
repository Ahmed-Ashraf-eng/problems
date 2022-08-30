class Solution {
    public boolean isPalindrome(int x) {
        
        String number = Integer.toString(x);
        char[] ch = number.toCharArray();
        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i] != ch[(ch.length-1) - i]){
                return false;
            }
        }
        return true;
    }
}