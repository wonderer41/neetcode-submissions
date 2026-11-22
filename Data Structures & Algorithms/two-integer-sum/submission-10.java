class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashList = new HashMap<>();
        
        for(int i = 0; i<nums.length;i++){
            int complement = target - nums[i];
            if(hashList.containsKey(complement)){
                int indexOf = hashList.get(complement);
                return new int[]{indexOf, i};
            }
            hashList.put(nums[i],i);
        }
        return new int[]{0,0}; 
    }
}
