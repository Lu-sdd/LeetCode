class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length + 1;
        //初始化DP数组并明确其含义
        int[] dp = new int[n];

        //初始化dp数组,题目说可以从0开始,也可以从1开始
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i < n; i++){
            dp[i] = Math.min(dp[i-1]+cost[i-1], dp[i-2] + cost[i-2]);
        }

        int topCost = dp[n-1];
        return topCost;
    }
}