class Solution {
    public int[] runningSum(int[] nums) {
        int size = nums.length;
        
        int[] newArr = new int[size];
        
        int sumA = 0;
        
        for(int i=0;i<size;i++){
            newArr[i] = sumA + nums[i];
            sumA+=nums[i];
        }
        
        return newArr;
        
    }
}