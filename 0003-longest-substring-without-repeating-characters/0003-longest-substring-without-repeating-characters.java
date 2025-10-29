/**最长子字符串,里面没有重复的字符
滑动窗口,用maxLen维护符合条件的最长长度
HashMap<Character,Integer> 来维护character出现的最近的位置;如果检测到子字符串里hashmap contains这个key,那就直接跳到这个字符最近出现的位置+1,然后计算/更新子字符串的长度
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
        
            if(map.containsKey(c) && map.get(c) >= left){ //如果这个字符出现过并且在当前的窗口里,我们就要移动left指针跳过该元素
                left = map.get(c) + 1;
            }
            map.put(c,right);
            maxLen = Math.max(maxLen, right - left + 1);

        }

        return maxLen;
    }
}