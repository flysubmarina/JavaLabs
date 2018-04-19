package ua.nure.fokin.task1;

public class Part7 {

    public static int[] getSimpleNums(int n) {
        {
            int[] arr = new int[n + 1];
            arr[1] = 0;
            for (int k = 2; k <= n; k++) arr[k] = 1;
            for (int k = 2; k * k <= n; k++) {
                if (arr[k] == 1) {
                    for (int l = k * k; l <= n; l += k) {
                        arr[l] = 0;
                    }
                }
            }
            return arr;
        }
    }

    public static int[] run(String[] args) {
        int n = Integer.parseInt(args[0]);
        return getSimpleNums(n);
    }
}
