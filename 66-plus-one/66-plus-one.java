class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int lastDigit = digits[length - 1];
        for(int i = length -1 ; i >= 0 ;i--){
            if(digits[i] < 9){
              digits[i]++;
                if(i != (length -1)){
                 for(int j = i+1 ; j < digits.length ;  j++){
                    digits[j] = 0;
        }
                }
            }
            else{
                if(i == 0){
                    return fun(digits);
                }
                continue;
            } 
            break;
        }
        return digits;
    }
    public int[] fun(int[] digits){
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for(int j = 1 ; j < result.length ;  j++){
            result[j] = 0;
        }
        return result;
    } 

}