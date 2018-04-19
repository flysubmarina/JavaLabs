package ua.nure.fokin.task1;

public class Part10 {
    static int[][] dp;

    static int bcr(int n, int k) {
        if (k > n / 2) k = n - k;
        if (k == 1) return n;
        if (k == 0) return 1;
        if (dp[n][k] == 0)
            dp[n][k] = bcr(n - 1, k) + bcr(n - 1, k - 1);
        return dp[n][k];

    }

    public static String[][] run(String[] args) {
        int n = Integer.parseInt(args[0]);
        n--;
        dp = new int[n + 1][n + 1];
        String[][] outArr = new String[n + 1][];
        //dp[n][0] = bcr(n, 0);
        for (int i = 0; i < n + 1; i++) {
            outArr[i] = new String[i + 1];
            for (int j = 0; j <= i; j++) {
                outArr[i][j] = Integer.toString(bcr(i, j));
            }
        }

        return outArr;
    }
}
