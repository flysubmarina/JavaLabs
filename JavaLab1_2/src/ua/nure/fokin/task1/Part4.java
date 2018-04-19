package ua.nure.fokin.task1;

public class Part4 {
    public static int Run(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] dp = new int [n+1];
        int sum = 1;
        dp[1] = 1;
        int last = 1;
        for(int i = 2; i <= n; i++){
            int sign = ( i % 2 == 0)? -1 : 1;
            dp[i] = sign * Math.abs(dp[i - 1]) * i;
            sum += dp[i];
        }
        return sum;
    }
}
