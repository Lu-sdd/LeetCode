class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        //Compute prefix products and store them in res array
        res[0] = 1;
        for(int i = 1; i < n; i++){
            res[i] = res[i-1] * nums[i-1];
        };

        //Use a right var to store suffix so the space complexity could be O(1)
        int right = 1;
        for(int i = n -1; i >= 0; i--){
            res[i] *= right;
            right *= nums[i];
        }

        return res;
        
    }
}