//用一个26大小的数组来记录出现的字符出现的频率,maxFreq来追踪出现的最频繁的字符的出现次数.如果窗口的大小 - maxFreq 大于k,也就是即使替换掉k个字符仍然会有不一样的字符,那就需要缩小窗口
class Solution {
    public int characterReplacement(String s, int k) {
        int[] record = new int[26];
        int left = 0;
        int maxLen = 0;
        int maxFreq = 0;

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            record[c - 'A']++;
            maxFreq = Math.max(maxFreq, record[c - 'A']);

            //如果当前窗口里有多余k个字符需要被替换,则需要缩小窗口,将左指针右移
            while(right - left + 1 - maxFreq > k){
                record[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}