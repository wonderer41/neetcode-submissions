class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length - 1;
        while(left <= right){
            int middle = (left+right)/2;
            int current = nums[middle];
            if(current < target){
                left= middle + 1;

            }else if(current >target ){
                right= middle -1;
            }else if(current == target){
                return middle;
            }
        }
        return -1;
    
}
}
