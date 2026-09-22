class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]left = new int[nums.length];
        int[]right = new int[nums.length];
        int[]sum = new int[nums.length];
        left[0] = 1;
        right[nums.length-1] = 1;
        //left side
        for(int i = 1; i< nums.length;i++){
            left[i]= left[i-1] *nums[i-1];
        }
        //right side
        for(int j = (nums.length-2); 0 <= j;j--){
            right[j] = right[j+1]*nums[j+1];
        }
        for(int g = 0; g <nums.length;g++){
            sum[g] = left[g]*right[g];
        }
        return sum;
        

    }
}  
