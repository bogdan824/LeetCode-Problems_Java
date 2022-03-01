class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int []account:accounts){
            int wealth = 0;
            for(int customer : account){
                wealth+=customer;
            }
            if (wealth>max){
                max=wealth;
            }
        }
        return max;
    }
}