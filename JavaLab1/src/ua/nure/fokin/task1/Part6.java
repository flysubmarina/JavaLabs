package ua.nure.fokin.task1;

public class Part6 {
    private static int[] fib (int n){
        int[] fib = new int[n+1];
        fib[0] = fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i - 2];
        }
        return fib;
    }
    public static int[] run(String[] args) {
        int x = Integer.parseInt(args[0]);
        return fib(x);
    }
}
