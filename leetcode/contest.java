public class contest{
    class Solution {
    public int minOperations(int[] nums) {
       boolean allEqual = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[0]) {
                allEqual = false;
                break;
            }
        }
        if (allEqual) return 0;

        // otherwise always 1 operation needed
        return 1;
    }
}
}