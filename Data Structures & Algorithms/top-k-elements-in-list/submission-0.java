class Solution {//bucket count
    public int[] topKFrequent(int[] nums, int k) {
        //Map, used for counting each number's frequency
        Map<Integer, Integer> map = new HashMap<>();
        //bucket sort,
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] ans = new int[k];
        for (int i = freq.length -1 ; i >0; i--) {
            for (int n: freq[i]) {
                ans[k - 1] = n;
                k--;
            }
            if (k == 0) return ans;
        }
        return ans;
    }
}
