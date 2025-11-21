class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];

        for(int i=0; i<length; i++) {
            if(i==0) {
                result[i] = nums[i];
            }
            if(i>0) {
                result[i] = result[i-1] + nums[i];
            }
        }
        return result;
    }
}
