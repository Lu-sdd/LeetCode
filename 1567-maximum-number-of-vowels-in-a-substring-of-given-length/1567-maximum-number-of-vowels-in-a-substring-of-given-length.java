class Solution {
    public int maxVowels(String s, int k) {
        int num = 0;
        char[] chars = s.toCharArray();
        //initialize the window
        for(int i = 0; i < k; i++){
            if(isVowel(chars[i])){
                num++;
            }
        }
        int maxNum = num;

        //move the window
        for(int i = k; i < chars.length; i++){
            if(isVowel(chars[i])){
                num++;
            };

            if(isVowel(chars[i-k])){
                num--;
            }

            maxNum = Math.max(maxNum, num);
        }

        return maxNum;
    }

    private boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }else{
            return false;
        }
    }
}