class Solution {
    public int[] buildArray(int[] nums) {
        int size = nums.length;
        int[] keep = new int[size];
        
        for (int i=0;i<size;i++){
            keep[i]=nums[nums[i]];
        }
        return keep;
    }
}