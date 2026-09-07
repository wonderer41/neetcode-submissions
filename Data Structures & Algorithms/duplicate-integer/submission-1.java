class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> answer = new HashSet<>();
        for(int i= 0; i< nums.length;i++){
            boolean drop = answer.add(nums[i]);
            if(drop == false){
                return true;
            }
        }
            return false;
        
        
    }
}