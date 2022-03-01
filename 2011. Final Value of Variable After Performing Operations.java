class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0; 
        
        for(int i = 0; i<operations.length; i++){
            if ((operations[i].charAt(0)=='-') || (operations[i].charAt(2)=='-' )){
                count-=1;
            }
            if ((operations[i].charAt(0)=='+') || (operations[i].charAt(2)=='+' )){
                count+=1;
            }
        }
        return count;
    }
}