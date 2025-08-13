class Solution {
    public boolean isPalindrome(String s) {
       //考虑edge case
       if(s == null) return false;

        //定义左右指针
        int left = 0;
        int right = s.length() - 1;

        //使用左右指针开始向中间移动比较
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}