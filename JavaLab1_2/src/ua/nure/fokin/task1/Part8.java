package ua.nure.fokin.task1;

public class Part8 {
    public static char[][] run(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        char[][] arr = new char[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if ((j + i) % 2 == 0) arr[i][j] = '?';
                else arr[i][j] = '?';
            }
        }
        return arr;
    }
}
