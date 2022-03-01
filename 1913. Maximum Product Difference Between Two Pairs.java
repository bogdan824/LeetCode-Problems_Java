class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        
        int product = (nums[size-1]*nums[size-2]) - (nums[0]*nums[1]);
            
        return product;
    }
}