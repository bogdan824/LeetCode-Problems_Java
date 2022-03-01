class Solution {
    public int mostWordsFound(String[] sentences) {
        int max =0;
        for (int i=0; i<sentences.length;i++){
            String[] keep = sentences[i].split(" ");
            if (keep.length > max){
                max = keep.length;
            }           
        }
        return max;
    }
}