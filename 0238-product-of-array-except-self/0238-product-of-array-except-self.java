class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] prefix = new int[length];

        prefix[0] = 1;
        for(int i = 1; i < length; i++) {
            prefix[i] = nums[i-1] * prefix[i -1];
        }

        int[] suffix = new int[length];
        suffix[length -1] = 1;
        for(int i = length - 2; i >= 0; i--){
            suffix[i] = nums[i + 1] * suffix[i + 1];
        }

        int[] answer = new int[length];
        for(int i = 0; i < length; i++) {
            answer[i] = prefix[i] * suffix[i];
        }

        return answer;
        
    }
}