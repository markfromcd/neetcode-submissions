class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int now = nums[i];
            if (map.containsKey(now)) {
                return new int[]{map.get(now), i};
            }
            map.put(target - now, i);
        }
        return new int[]{};
    }
}
