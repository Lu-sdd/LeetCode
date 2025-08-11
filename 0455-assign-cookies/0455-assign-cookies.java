class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //升序排序
        Arrays.sort(g);
        Arrays.sort(s);

        int result = 0;
        int index = s.length - 1;
        for(int i = g.length - 1; i >= 0; i--){
            if(index >= 0 && s[index] >= g[i]){
                result++;
                index--;
            }
        }
        return result;
    }
}