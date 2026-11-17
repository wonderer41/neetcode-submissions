class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> trios = new ArrayList<>();
        Arrays.sort(nums);

        for (int hold = 0; hold < nums.length; hold++) {

            if (hold > 0) {
                if (nums[hold] == nums[hold - 1]) {
                    continue;
                }
            }

            int left = hold + 1;
            int right = nums.length - 1;

            while (left < right) {
                int complement = nums[hold] + nums[left] + nums[right];
                if (complement == 0) {
                    trios.add(Arrays.asList(nums[hold], nums[left], nums[right]));
                    right--;
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else if (complement > 0) {
                    right--;
                } else if (complement < 0) {
                    left++;
                }
            }
        }
        return trios;
    }
}

