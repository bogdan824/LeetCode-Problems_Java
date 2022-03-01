class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int keep = x;
        
        while(x>0){
            sum = (sum * 10) + x%10;
            x/=10;
        }
        if (keep==sum){
            return true;
        }
        return false;
    }
}