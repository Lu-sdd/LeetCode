class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //1.排序
        Arrays.sort(nums);
        //创建结果集
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;
            int a = nums[i];
            //创建2个双指针
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                if(nums[left] + nums[right] == -a){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right - 1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(nums[left] + nums[right] < -a){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return res;

    }
}