class Solution {
    public int maxArea(int[] height) {
        //双指针从两端向中间收缩，每次移动短板，寻找可能的更大面积。
        //定义双指针
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){
            //计算面积
            int curArea = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(curArea, maxArea);
            if(height[left] >= height[right]){
                right--;
            }else{
                left++;
            }
        }
        return maxArea;
        
    }
}

