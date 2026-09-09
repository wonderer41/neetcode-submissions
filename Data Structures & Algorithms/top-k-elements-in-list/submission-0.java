class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> repeats = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (repeats.containsKey(nums[i])) {
                repeats.put(nums[i], repeats.get(nums[i]) + 1);
            } else {
                repeats.put(nums[i], 1);
            }
        }

        List<Integer>[] bucketList = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : repeats.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();
            if (bucketList[count] == null) {
                bucketList[count] = new ArrayList<>();
            }
            bucketList[count].add(number);
        }

        int[] result = new int[k];
        int idx = 0;
        for (int i = bucketList.length - 1; i >= 0; i--) {
            if (bucketList[i] != null) {
                for (int number : bucketList[i]) {
                    result[idx] = number;
                    idx++;
                    if (idx == k) return result;
                }
            }
        }
        return result;
    }
}