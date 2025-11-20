class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> data = new HashSet<>();
        int length = nums.length;
        for(int i=0;i<length;i++) {
            data.add(nums[i]);
        }
        if(data.size()==length) return false;
        else return true;
    }
}
