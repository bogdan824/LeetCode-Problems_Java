import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int newArr[] = nums;
        System.out.println();Arrays.toString(nums);
        
        int aLen = nums.length;
        int bLen = newArr.length;
        
        int result [] = new int [aLen + bLen];
        
        System.arraycopy(nums,0,result,0,aLen);
        System.arraycopy(newArr,0,result,aLen,bLen);
        
        return result;
    }
}