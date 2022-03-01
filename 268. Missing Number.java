class Solution {
    public int missingNumber(int[] nums) {
        int keep = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            keep = i;
            if (nums[i] != i){
                return keep; 
            }    
        }
        return keep+1;   
    }  
}