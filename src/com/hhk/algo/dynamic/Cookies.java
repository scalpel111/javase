package com.hhk.algo.dynamic;

import java.util.Arrays;

public class Cookies {
    public int cookie(int[] coins, int amount){
        if(amount < 0){
            return -1;
        }
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int i = 0; i <= amount; i++){
            for (int coin : coins){
                if(i - coin < 0){
                    continue;
                }
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Cookies cookies = new Cookies();
        int res = cookies.cookie(new int[]{5,2}, 13);
        System.out.println(res);
    }
}
