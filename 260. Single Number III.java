class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        int first = 0;
        int second = 0;

        for(int i : map.keySet()){
            if(map.get(i)==1){
                if(first==0){
                    first = i;
                }
                else{
                    second = i;
                }
            }
        }
        return new int[]{first,second};
    }
}