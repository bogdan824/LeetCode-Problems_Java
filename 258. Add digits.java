class Solution {
    public int addDigits(int num) {
        int a = 9;
        int b = 11;

        int keep = 0;
        while (num!=0){
            keep += num%10;
            num /= 10;
            if ((keep>9) && (num==0)){
                num=keep;
                keep=0;
            }
        } 
        return keep;
    }
}