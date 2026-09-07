class Solution {
    public int[] twoSum(int[] nums, int target) {
   HashMap<Integer, Integer> answer = new HashMap<>();
 
   for(int i = 0; i< nums.length; i++){
    int comp = target - nums[i];

         if(answer.containsKey(comp)){
            return new int[]{answer.get(comp), i};   
        }else{
            answer.put(nums[i], i);
        }
   }
return new int[]{};
 }
}