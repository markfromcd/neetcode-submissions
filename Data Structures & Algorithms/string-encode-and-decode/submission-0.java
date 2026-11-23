class Solution {//So the strategy is to use a number#String

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for (String s: strs) {
            str.append(s.length()).append('#').append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int len = str.length();
        int i = 0;
        while (i < len) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            ans.add(str.substring(i, j));
            i = j;
        }
        return ans;
    }
}
