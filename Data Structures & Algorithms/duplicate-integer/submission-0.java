class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> find = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(find.contains(nums[i])){
                return true;
                
            }
            if(!(find.contains(nums[i]))){
                find.add(nums[i]);   
            }
        }
        return false;
  
    }   
}
