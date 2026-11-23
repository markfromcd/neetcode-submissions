class Solution {//Prefix + Sufix, 2 array
    public int[] productExceptSelf(int[] nums) {
        int[] preProd = new int[nums.length];
        int[] sufProd = new int[nums.length];
        int[] ans = new int[nums.length];

        preProd[0] = 1;
        sufProd[nums.length - 1]= 1;
        for (int i = 1; i < nums.length; i++) {
            preProd[i] = preProd[i - 1] * nums[i - 1];
        }
        for (int j = nums.length - 2; j >= 0; j--) {
            sufProd[j] = sufProd[j + 1] * nums[j + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = preProd[i] * sufProd[i];
        }
        return ans;
    }
}  

// x 1 12 123
//234 34 4 x