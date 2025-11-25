class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int[] left = new int[numsLength];
        int[] right = new int[numsLength];
        int[] answer = new int[numsLength];

        left[0] = 1;
        for (int i = 1; i < numsLength; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[numsLength - 1] = 1;
        for (int i = numsLength - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < numsLength; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;
    }
}
