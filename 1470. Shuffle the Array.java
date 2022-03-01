import java.util.Arrays;
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] keep = new int[nums.length];
        
        int position = 0;   
        
        for (int i=0; i<nums.length/2; i++){
            //System.out.println("i: "+ nums[i]);
            keep[position]=nums[i];
            keep[position+1]=nums[i+n];
            position+=2;
            //System.out.println("array" +Arrays.toString(keep));
        }
        
    
        //System.out.println(Arrays.toString(keep));
        return keep;
    }
}