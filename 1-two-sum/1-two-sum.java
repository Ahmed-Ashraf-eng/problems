class Solution {
    public int[] twoSum(int[] nums, int target) {
        int num1 = 0;
        int index1 = 0;
        int index2 = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
                num1 = nums[i];
                for(int j = 0; j < nums.length; j++){
                    if(nums[j] == (target - num1) && j != i){
                        int[] result = {i , j};
                        return result;
                    }
                }            
        }
        return nums;
    }
}