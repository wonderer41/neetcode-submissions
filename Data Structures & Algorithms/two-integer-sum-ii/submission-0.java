class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int totalSum = 0;
        int left = 0;
        int right = numbers.length - 1;
        
        while(left < right){
            totalSum = numbers[left] + numbers[right];
            if(totalSum == target){
                return new int[]{left+1,right+1};
            }else if(totalSum < target){
                left++;
            }else if(totalSum > target){
                right--;
            }
            
        }
        return new int[]{};
    }
}
