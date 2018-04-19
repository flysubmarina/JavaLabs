package ua.nure.fokin.task1;

public class Part5 {

    private static int[][] tickets;

    private static int getElement(int n, int k) {
        int res = 0;
        for (int j = 0; j <= 9; j++) {
            res += (k - j >= 0) ? tickets[n - 1][k - j] : 0;
        }
        return res;
    }

    public static int run(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n % 2 != 0) return 0;
        int half = n / 2;
        tickets = new int[half + 1][9 * half + 1];
        tickets[0][0] = 1;
        for (int i = 1; i <= half; i++) {
            for (int j = 0; j <= 9 * half; j++) {
                tickets[i][j] = getElement(i, j) - tickets[i - 1][j];
            }
        }
        int result = 0;
        for (int i = 0; i < 9 * half + 1; i++) {
            result += tickets[half][i] * tickets[half][i];
        }
        return result;
    }
}
