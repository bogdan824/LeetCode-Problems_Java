class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer, Integer> hashm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if (hashm.containsKey(nums[i])){
                hashm.put(nums[i],hashm.get(nums[i])+1);
            }
            else{
                hashm.put(nums[i],1);
            }
        }
        int answer = 0;
        for (int i : hashm.keySet()){
            if(hashm.get(i)==1){
                answer = i;
            }
        }
        return answer;
    }
}