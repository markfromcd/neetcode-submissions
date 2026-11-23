class Solution { //So, we should first think about the worst case which is brutal force with 3 for loop. n^3.
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);// We do need to sort the array. T NlogN.
        List<List<Integer>> ans = new ArrayList<>();
        //since we have already sorted the array, the first value should not be over 0.
        //so for each traverse, the same first number end up with same results, skip if next are same
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[l] + nums[r] > -nums[i]) {
                    r--;
                } else if (nums[l] + nums[r] < -nums[i]) {
                    l++;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    // To avoid duplicate issue, we need to add:
                    while (l < r && nums[l] == nums[l - 1]) l++;
                }
            }
        }
        return ans;
    }
}
