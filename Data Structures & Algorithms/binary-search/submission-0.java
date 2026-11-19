class Solution {
    public int search(int[] nums, int target) { 
        
        int left = 0;
        int right = nums.length - 1;

        while(left <=  right){

            int middle = (left + right)/2;
            int current = nums[middle];
            if(target == current){
                return middle;
            }else if(target > current){
                left = middle + 1;
            }else if(target < current){
                right = middle -1;
            }
        }
        return -1;

    }
}
