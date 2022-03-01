class Solution {
    public boolean isPrefixString(String s, String[] words) {
        boolean ss = false;
        String keep = "";
        for(int i=0;i<words.length;i++){
            keep+=words[i];
            System.out.println(keep);
            if(keep.equals(s)){
                ss = true;
            }
        }
        return ss;
    }
}